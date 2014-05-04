package models;
import play.data.validation.Constraints.*;
import javax.persistence.*;
import play.db.ebean.*;
import java.util.List;
import com.avaje.ebean.*;
import play.db.ebean.Model.Finder;

@Entity
public class User extends Model{
    @Id
    public String name;
    public String email;
    public String password;
    public List<Integer> categorySeq;

    
    public User(String email, String name,String password){
        this.email = email;
        this.name = name;
        this.password = password;
        categorySeq = null;

    }
    
    public static Finder<String,User> find = new Finder<String,User>(
        String.class, User.class
    ); 
}
