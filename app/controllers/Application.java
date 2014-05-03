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
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result signUp(){
       // initializeDB();
        List<Category> categories = Category.find.all();
        return ok(signUp.render(categories));
    }
    
     public static void initializeDB(){
      if(!init){
        Category cat1 = new Category("Planes");
        Category cat2 = new Category("Cars");
        Category cat3 = new Category("People");
        Category cat4 = new Category("Nature");
        Category cat5 = new Category("Buildings");
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
