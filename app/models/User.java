package models;
import play.data.validation.Constraints.*;
import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import play.db.ebean.Model.Finder;

@Entity
public class User extends Model{
    @Id
    public String name;
    public String email;
    public String password;
    public int category1;
    public int category2;
    public int category3;
    
    public User(String email, String name,String password){
        this.email = email;
        this.name = name;
        this.password = password;
        category1 = 0;
        category2 = 0;
        category3 = 0;
    }
    
    public static Finder<String,User> find = new Finder<String,User>(
        String.class, User.class
    ); 
}