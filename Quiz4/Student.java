package Quiz4;

import java.util.ArrayList;

public class  Student {
    ArrayList<Course> clist;
    
    int sid;
    String sname;

    public Student(Integer id, String name, ArrayList<Course> c)  {
        sid = id;
        sname = name;
        clist = c;


    }


    public int getTotalCredits() {
        int totalCreds;
        totalCreds = 0;
        int currCreds;
        for(int i = 0; i < clist.size(); i++) {
            currCreds = clist.get(i).getCredit();
            totalCreds = (totalCreds + currCreds);
            
        }
        
       return totalCreds;
        
        
        

        

        
    }
    //Returns total credits
    public Integer getSID() {

        return sid;
    } 
    
    public String toString()  {
       
        return sid + " " + sname + " " + clist; 

         

    }
    //Override the toString to print the object instance
    //Return string to print all information of student object
}