
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class Course 
{
   public String name;
   public String code;
   public ArrayList<Student> students = new ArrayList<Student>();
   public Faculty faculty;
   
   Course()
   {
       this.name = "deafult name";
       this.code = "default code";
       //this.students = "Default";
       //this.faculty = "Default faculty";
   }
   Course(String name, String code)
   {
       this.name = name;
       this.code = code;
   }
   
   Course(String name, String code, ArrayList<Student> students, Faculty faculty)
   {
       this.name = name;
       this.code = code;
       this.students = students;
       this.faculty = faculty;
    
   }
   
   public void addStudents(Student student)
   {
       students.add(student);
   }
   public void setFaculty(Faculty faculty)
   {
       this.faculty = faculty;
   }
   public String getName()
   {
       return this.name;
   }
   public String getCode()
   {
       return this.code;
   }
   public Faculty getFaculty()
   {
       return this.faculty;
   }
   public ArrayList<Student> getStudents()
   {
       return this.students;
   }
   
   @Override
   public String toString()
   {
       return "[Course Class]" +"\nname: " + this.name + " code: " + this.code + "\nStudents: " + this.students + "\nFaculty: " + this.faculty;
   }
          
}
