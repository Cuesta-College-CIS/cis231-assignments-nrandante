package Quiz6;
import java.util.ArrayList;
import java.util.Scanner;
public class Question3 {
    public static ArrayList<Student> fillupStudent()  {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Student> slist = new ArrayList<Student>();
       
        String currName;
       String currDOB;

       Integer currSid;
       

       int courseCnt;
       String currCID;
        String currCname;
        int currCscore;
        

      


        
        for (int i = 0; i < 3; i++) {
            
            
            
            currSid = scnr.nextInt();
           currName = scnr.next();
             courseCnt = scnr.nextInt();
            currDOB = scnr.next();
            
            
           
            ArrayList<Course> currCourse = new ArrayList<Course>();
            for (int j = 0; j < courseCnt; j++) {
            currCID = scnr.next();
           
            currCname = scnr.next();
           
            currCscore = scnr.nextInt();
           
            Course crse = new Course(currCID, currName, currCscore);
           
            currCourse.add(crse);
            }

            Student stdnt = new Student(currName, currDOB, currSid, currCourse );
            slist.add(stdnt);

         }
        scnr.close();
        return slist;
    }
     
           
           
            
            


    
    
    

    public static void printStudent(ArrayList<Student> slist) {
        for(int i = 0; i < slist.size(); i++){
            System.out.println(slist.get(i));


        }



    }
    public static void main(String[] args) {

        ArrayList<Student> slist;

        slist = fillupStudent();
        printStudent(slist);



    }




}
