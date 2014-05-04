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
    public int number;
    @OneToMany(cascade=CascadeType.PERSIST)
    public List<Picture> pictures;
    @ManyToOne
    public List<User> users;
    
    public Category(String catName, int number){
        this.catName = catName;
        this.number = number;
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