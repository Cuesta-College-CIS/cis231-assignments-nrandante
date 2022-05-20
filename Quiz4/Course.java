package Quiz4;



public  class Course {
    
    String cid;
    String cname;
    Integer credit;
    String grade;
    
    public Course(String id, String name, Integer c, String g){
        cid = id;
        cname = name;
        credit = c;
        grade = g;

    
    }
    
    public Integer getCredit() {

        return credit;


    }
    public String toString()  {
    
        return "\n Course: " + cid + " " + cname + " " + credit + " " + grade; 
    
    
    
        //Override the toString to print the object instance
    //Return string to print all information of student object


    }


}