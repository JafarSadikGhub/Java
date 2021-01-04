public class Student extends Person{
   private float cgpa;
   private String studentId;
   private String[] courses;
   
 Student(){
     
 }  
 Student(String firstName,String lastName,String nationalId, String studentId,int age, float cgpa, String[] courses){
     super(firstName,lastName,age,nationalId);
     this.studentId=studentId;
     this.cgpa = cgpa;
     this.courses = courses;
     //this.age=age;
 }
 
   public String getFullName(){
       return super.getFullName();
   } 
   public String toString(){
     return super.toString() + "Student ID:< " + getStudentId()  +" >\nCGPA:< " + getCgpa() + " >\nCourses:< " + getCourses() + " >";
 }
   public void setCgpa(float newCgpa){
       this.cgpa=newCgpa;
   }
public float getCgpa(){
    return this.cgpa;
}   
   public String getStudentId(){
       return this.studentId;
   }
   public String[] getCourses(){
       return this.courses;
   }
   public void setCourses(String[] courses){
       this.courses=courses;
   }
   
  
   
   
}