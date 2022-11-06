import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("student")
@ManagedBean  
@ApplicationScoped  
public class Student {
    int id;
    String name;
    public int getId() {
        return id; 
 }
public void setId(int id) 
   {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   
}
