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

    public static boolean init = false;
    
    public static Result index() {
        initializeDB();
 
        List<Category> categories = Category.find.all();
        return ok(signUp.render(categories,Form.form(User.class)));
    }
    
    public static Result signUp(){
       // initializeDB();
        //List<Category> categories = Category.find.all();
        //return ok();//signUp.render(categories));
        DynamicForm requestData = Form.form().bindFromRequest();
        if(requestData.hasErrors()){
            return badRequest();
        }else{
            int x = 0;
            String email= requestData.get("email");
            String name = requestData.get("name");
            String password = requestData.get("password");
            String Categoryx = requestData.get("Categories");
            String num = requestData.get("num");
            if(num.equals("5")){
                x = 5;
            }
            Category cat = Category.find.byId(Categoryx);
            int cat1 = cat.number;
            int cat2;
            int cat3;
            User newUser = new User(email,name,password);
            newUser.category1 = cat1;
            newUser.save();
            return ok(test.render(newUser,x));
        }

    }
    
    public static Result login(){
        List<Category> categories = Category.find.all();
        return ok(login.render(User.find.byId(""),Form.form(Category.class)));
    }


    public static Result validateLogin(){

    return success();
    }

    public static Result success(){
        return ok(success.render());
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
