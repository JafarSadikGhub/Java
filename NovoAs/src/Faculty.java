public class Faculty extends Person {
    private String facultyId;
    private String[] courses;
    private String designation;
    
    Faculty(String firstName, String lastName, String nationalId, int age, String facultyId, String designation, String[] courses){
        super(firstName,lastName,age,nationalId);
        this.facultyId=facultyId;
        this.designation=designation;
        this.courses = courses;
        
    }
    
    public String getFullName(){
        return super.getFullName();
    }
     public String toString(){
     return super.toString() + "Faculty ID:< " + this.facultyId  +" >\nDesignation:< " + getDesignation() + " >\nCourses:< " + printCourses() + " >";
  }
    public String getDesignation(){
        return designation;
    }
    public String[] getCourses(){
     return courses; 
     
    }
    public String printCourses()
    {
      String str = "";
      for(int i=0; i< courses.length; i++)
      {
         str= str + courses[i] + " ";
      }
     
      return str;    
    }
    public void setCourses(String[] newCourses){
        this.courses=newCourses;
    }
    
   public void setDesignation(String designation){
       
       this.designation=designation;
   }
    
}