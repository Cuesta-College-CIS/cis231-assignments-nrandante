package Quiz6;
import java.util.ArrayList;
public class Student extends Person {
   
    Integer sid;
    
    ArrayList<Course> clist;
  
    
    Person var;
   
    
    
 
   
  
   
   public Student (String name, String DOB, Integer sid, ArrayList<Course> clist) {
        
         super(name, DOB);
         this.sid = sid;
         
         this.clist = clist;




    }



 public void printPerson() {

    System.out.println(name + " " + DOB);




 }


 public String toString() {

    return name + DOB;
    
    
    }


}
