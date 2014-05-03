package models;

import play.data.validation.Constraints.*;
import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import play.db.ebean.Model.Finder;

@Entity
public class Picture extends Model{
    @Id
    public int id;
    public String image_link;
    
    @ManyToOne
    public Category category;
    
    public Picture(){
        
    }
}