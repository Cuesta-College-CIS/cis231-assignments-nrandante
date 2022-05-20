package Quiz6;

abstract class Person {
    String name;
    String DOB;

  Person(String name, String DOB){
   this.name = name;
   this.DOB = DOB;
    


 }


 public abstract void printPerson();




public String toString() {

return name + DOB;


}


}