package Quiz4;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz4 {
    public static void main(String []args) {
        
        int sid;
        ArrayList<Student> slist;


        slist = fillupStudent();
        printStudent(slist);
        sid = findStudent(slist);

        printStudent(slist, sid);
      








    }

public static ArrayList<Student> fillupStudent() {
     
    Scanner scnr = new Scanner(System.in);
    ArrayList<Student> slist = new ArrayList<Student>();
    
    int currSID;
    String currName;
    

   
    String currCID;
    String currCname;
    Integer currCredit;
    String currGrade;
    
    int courseCnt;
    
    
    
     
     
      
     for(int i = 0; i < 3; i++){
        currSID = scnr.nextInt();
        currName = scnr.next();
        courseCnt = scnr.nextInt();
        ArrayList<Course> currCourse = new ArrayList<Course>();
        for (int j = 0; j < courseCnt; j++){
            currCID = scnr.next();
            currCname = scnr.next();
            currCredit = scnr.nextInt();
            currGrade = scnr.next();
            Course crse = new Course(currCID, currCname, currCredit,currGrade);
            currCourse.add(crse);
        } 

    Student stdnt = new Student(currSID, currName, currCourse);
        slist.add(stdnt);
}
     
        
        
scnr.close();

    return slist;



     }
    

    
   




    
    
    // My Code



public static void printStudent(ArrayList<Student> slist) {


for (int i = 0; i < slist.size(); i++) {
    System.out.println(slist.get(i).toString());
   System.out.println();
    System.out.println("Total Credits: " + slist.get(i).getTotalCredits());
    System.out.println();
    
}

}

public static void printStudent(ArrayList<Student> slist, int id) {
int passID = id;

for (int i = 0; i < slist.size(); i++){
    if (slist.get(i).getSID()  == passID) {

        System.out.println(slist.get(i).toString());
        System.out.println();
        System.out.println("Total Credits: " + slist.get(i).getTotalCredits());
        System.out.println();

    }
    

}


}

public static Integer findStudent(ArrayList<Student> slist) {
    Integer maxCreds;
    maxCreds = 0;
    int index;

    index = 0;
    for (int i = 0; i < slist.size(); i++){
        if (i == 0){
            maxCreds = slist.get(i).getTotalCredits();
        }

        if (maxCreds < slist.get(i).getTotalCredits()) {

            maxCreds = slist.get(i).getTotalCredits();
            index = i;
        }

        

    }


    Integer maxCsid;
        maxCsid = slist.get(index).getSID();
        
        return maxCsid;



}


}






