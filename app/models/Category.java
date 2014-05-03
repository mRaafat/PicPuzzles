package models;
import play.data.validation.Constraints.*;
import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import play.db.ebean.Model.Finder;
import models.*;
import java.util.List;

@Entity
public class Category extends Model{
    @Id
    public String catName;
    @OneToMany(cascade=CascadeType.PERSIST)
    public List<Picture> pictures;
    @ManyToOne
    public List<User> users;
    
    public Category(String catName){
        this.catName = catName;
        this.pictures = null;
        this.users = null;
    }
    public String getTitle(){
        return this.catName;
    }
     public static Finder<String,Category> find = new Finder<String,Category>(
        String.class, Category.class
    ); 
}