package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
package controllers;
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
        return ok(signUp.render());
    }
    
     public static void initializeDB(){
      if(!init){
        for(int i=1;i<=55;i++){
          Image i = new Image (i,"images/"+i+".jpg");
          i.save();
          
        }
        init = true;
       }
    }

}
