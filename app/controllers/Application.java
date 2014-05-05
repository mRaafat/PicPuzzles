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
    

     public static Result chooseGridSeq(String email){
        DynamicForm form = Form.form().bindFromRequest();
        if(form.hasErrors()){
            return badRequest();
        }else{
         
            int cat1 = Category.find.byId(form.get("cat1")).getID();
            int cat2 = Category.find.byId(form.get("cat2")).getID();
            int cat3 = Category.find.byId(form.get("cat3")).getID();
            int cat1pos1 = Integer.parseInt(form.get("cat1Image1"));
            int cat1pos2 = Integer.parseInt(form.get("cat1Image2"));
            int cat2pos1 = Integer.parseInt(form.get("cat2Image1"));
            int cat2pos2 = Integer.parseInt(form.get("cat2Image2"));
            int cat3pos1 = Integer.parseInt(form.get("cat3Image1"));
            int cat3pos2 = Integer.parseInt(form.get("cat3Image2"));
            System.out.println(cat3pos2);
            System.out.println(GraphicalPassword.find.byId(email).email);
            GraphicalPassword.find.byId(email).setGraphicalPassword1(cat1,cat1pos1,cat1pos2);
            GraphicalPassword.find.byId(email).setGraphicalPassword2(cat2,cat2pos1,cat2pos2);
            GraphicalPassword.find.byId(email).setGraphicalPassword3(cat3,cat3pos1,cat3pos2);
            return ok();
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
        int randomImage1 = (int) ((((Math.random()*100))%(picList.size())));
        int randomImage2 = (int) ((((Math.random()*100))%(picList.size())));
        int [] returnedImages = new int [2];
        returnedImages[0] = picList.get(randomImage1).id;
        returnedImages[1] = picList.get(randomImage2).id;
        return returnedImages;
    }
            
    public static Result loginUser(){    

        //initializeDB();
        User user = User.find.byId("a@a.com");
        int cat1 = GraphicalPassword.find.byId(user.email).cat1;
        int cat2 = GraphicalPassword.find.byId(user.email).cat2;
        int cat3 = GraphicalPassword.find.byId(user.email).cat3;
        
        List<Integer> categories = new ArrayList<>();
        categories.add(cat1);
        categories.add(cat2);
        categories.add(cat3);

        int [] cat1Pics = getCategoryImages(cat1);
        int [] cat2Pics = getCategoryImages(cat2);
        int [] cat3Pics = getCategoryImages(cat3);
        List<Integer> catPics = new ArrayList<>();
        catPics.add(cat1Pics[0]);
        catPics.add(cat1Pics[1]);
        catPics.add(cat2Pics[0]);
        catPics.add(cat2Pics[1]);
        catPics.add(cat3Pics[0]);
        catPics.add(cat3Pics[1]);

         List<Integer> places = new ArrayList<>();
        while(places.size() < 6){
            int randomPlace = (int) ((((Math.random()*100))%(16)) + 1);
            if(!places.contains(randomPlace)){
                places.add(randomPlace);
            }           
        }
        return ok(login.render(user.email,catPics,categories,places,Form.form(Category.class)));
    }


    public static Result validateLogin(String email, List<Integer> catPics, List<Integer> categories, List<Integer> places){
        DynamicForm requestData = Form.form().bindFromRequest();
        String origin = requestData.get("origin");
        String target = requestData.get("target");
        System.out.println(origin);
        System.out.println();
        System.out.println(target);
        if(true){
            return success();    
        }else{
            return ok(login.render(email,catPics,categories,places,Form.form(Category.class)));
        }
        

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
