package Quiz6;

public class Course implements CourseActivity {
    
    String cid;
    String coursename;
    Integer score;
    String grade;

    
       
public Course(String cid, String coursename, Integer score){
    
    this.cid = cid;
    this.coursename = coursename;
    this.score = score;





}
  


    
 public void decideGrade() {
    
    
    while(score>0){
    
    if (score >= 90){

        System.out.println("A");


    } else if (score < 90 && score >= 80) {

        System.out.println("B");


    } else if (score < 80 && score >= 70) {


        System.out.println("C");
    } else if (score < 70 && score >= 60) {

        System.out.println("D");
    } else {
        System.out.println("F");
    }
}

}

public void printCourseinfo() {

    
    System.out.println(cid + " " + coursename + " " + score + " " + grade);



}



public String toString()  {
    
    return "\n Course: " + cid + " " + coursename + " " + score + " " + grade; 



   

}


}




