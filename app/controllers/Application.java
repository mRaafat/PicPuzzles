package controllers;
import java.util.LinkedList;
import java.util.List;
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
       // initializeDB();
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
            

    public static int [] getCategoryImages(int category){
        Object [] p = Picture.find.all().toArray();
        List <Picture> picList = new LinkedList<Picture>();
        for(int i=0;i<p.length;i++){
            if(((Picture) p[i]).category.getID() == category){
                picList.add((Picture) p[i]);
            }
        }
        int randomImage1 = (int) ((((Math.random()*100))%(picList.size())) + 1);
        int randomImage2 = (int) ((((Math.random()*100))%(picList.size())) + 1);
        int [] returnedImages = new int [2];
        returnedImages[0] = randomImage1;
        returnedImages[1] = randomImage2;
        return returnedImages;
    }
            
    public static Result loginUser(){    

        //initializeDB();
        User user = User.find.byId("a@a.com");
        
        int cat1 = GraphicalPassword.find.byId(user.email).cat1;
        int cat2 = GraphicalPassword.find.byId(user.email).cat2;
        int cat3 = GraphicalPassword.find.byId(user.email).cat3;
        int [] cat1Pics = getCategoryImages(cat1);
        int [] cat2Pics = getCategoryImages(cat2);
        int [] cat3Pics = getCategoryImages(cat3);
//        System.out.println(cat1Pics[0] + " , " + cat1Pics[1]);
//        System.out.println(cat2Pics[0] + " , " + cat2Pics[1]);
//        System.out.println(cat3Pics[0] + " , " + cat3Pics[1]);
        return ok(login.render(user,Form.form(Category.class)));
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

        for(int i=1;i<=5;i++){
          Picture x = new Picture ("images/pln"+i+".jpg",cat1);
          x.save();
        }
        for(int i=1;i<=5;i++){
          Picture x = new Picture ("images/car"+i+".jpg",cat2);
          x.save();
        }

        for(int i=1;i<=5;i++){
          Picture x = new Picture ("images/ppl"+i+".jpg",cat3);
          x.save();
        }
        for(int i=1;i<=8;i++){
          Picture x = new Picture ("images/plant"+i+".jpg",cat4);
          x.save();
        }
        for(int i=1;i<=7;i++){
          Picture x = new Picture ("images/build"+i+".jpg",cat5);
          x.save();
        }

        User a = new User("a@a.com","a","a");
        a.graphicalPassword.setGraphicalPassword1(2,1,2);
        a.graphicalPassword.setGraphicalPassword2(5,3,4);
        a.graphicalPassword.setGraphicalPassword3(1,15,16);
        a.save();

       }
    }
}
