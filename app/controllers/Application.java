package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.*;
import static play.data.Form.*;
import models.*;
import play.db.*;
import play.api.*;
import java.util.*;
import javax.persistence.*;

public class Application extends Controller {

    public static boolean categorySet = false;
    public static boolean attm1 = false;
    public static boolean attm2= false;
    public static int attempts = 0;
    public static Integer pos1 = 0;
    public static Integer pos2 = 0;
    public static boolean init = false;
    
    public static Result index() {
        initializeDB();
        List<Category> categories = Category.find.all();
        return ok(signUp.render(categories,Form.form(User.class)));
    
        
    }
    
    public static Result signUp(){
        DynamicForm requestData = Form.form().bindFromRequest();
        List<Category> categories = Category.find.all();
        if(requestData.hasErrors()){
            return badRequest();
        }else{
            String email= requestData.get("email");
            String name = requestData.get("name");
            String password = requestData.get("password");
            User newUser = new User(email,name,password);
            newUser.save();
            return ok(gridSeq.render(email,categories));
        }

    }
    public static Result chooseGridSeq(String user1){
        User user = User.find.byId(user1);
        List<Category> categories = Category.find.all();
        List<Integer> catAndSeq ;
        DynamicForm requestData = Form.form().bindFromRequest();
        if(requestData.hasErrors()){
            return badRequest();
        }else{
            if(!categorySet){
                Category cat = Category.find.byId(requestData.get("Categories"));
                int category = cat.getID();
                user.categorySeq.add(category);
                user.save();
                categorySet = true;
            }
            
                if(!attm1){
                    pos1 = Integer.parseInt(requestData.get("num"));
                    user.categorySeq.add(pos1);
                    attm1 = true;
                }else{
                    if(!attm2){
                        pos2 = Integer.parseInt(requestData.get("num"));
                        user.categorySeq.add(pos2);
                        attm2 = true;
                        categorySet = false;
                        attm1 = false;
                        
                    }
                }
                return ok(gridSeq.render(user.email,categories));
            }
            
            
            
        }
    

    
     public static void initializeDB(){
      if(!init){
        Category cat1 = new Category("Planes",1);
        Category cat2 = new Category("Cars",2);
        Category cat3 = new Category("People",3);
        Category cat4 = new Category("Nature",4);
        Category cat5 = new Category("Buildings",5);
        cat1.save();
        cat2.save();
        cat3.save();
        cat4.save();
        cat5.save();
        init = true;
        /*
        for(int i=1;i<=55;i++){
          Image i = new Image (i,"images/"+i+".jpg");
          i.save();
          
        }*/
        
       }
    }
}
