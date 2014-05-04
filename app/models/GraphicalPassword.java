package models;
import play.data.validation.Constraints.*;
import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import play.db.ebean.Model.Finder;
import models.*;
import java.util.List;

@Entity
public class GraphicalPassword extends Model{
    @Id
    public String email;
    public int cat1;
    public int cat1Image1;
    public int cat1Image2;
    public int cat2;
    public int cat2Image1;
    public int cat2Image2;
    public int cat3;
    public int cat3Image1;
    public int cat3Image2;

    
    public GraphicalPassword(String email){
        this.email = email;
        this.save();
    }

    public void setGraphicalPassword1(int cat1,int cat1Image1,int cat1Image2){
        this.cat1 = cat1;
        this.cat1Image1 = cat1Image1;
        this.cat1Image2 = cat1Image2;
        this.save();
    }
    public void setGraphicalPassword2(int cat2,int cat2Image1,int cat2Image2){
        this.cat2 = cat2;
        this.cat2Image1 = cat2Image1;
        this.cat2Image2 = cat2Image2;
        this.save();
    }
    public void setGraphicalPassword3(int cat3,int cat3Image1,int cat3Image2){
        this.cat3 = cat3;
        this.cat3Image1 = cat3Image1;
        this.cat3Image2 = cat3Image2;
        this.save();
    }

    public static Finder<String,GraphicalPassword> find = new Finder<String,GraphicalPassword>(
        String.class, GraphicalPassword.class
    ); 
}
