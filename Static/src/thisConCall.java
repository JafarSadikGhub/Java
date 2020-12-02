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
public class thisConCall 
{
     int rollno;
     String name, course;
     float fee;
     thisConCall(int rollno, String name, String course)
     {
         this.rollno = rollno;
         this.name = name;
         this.course = course;
     }
     thisConCall(int rollno, String name, String course, float fee)
     {
         this(rollno, name, course);
         this.fee = fee;
         //Compile time error if this constructor wasn't called first;
     }
     @Override
     public String toString()
     {
         return "rollno: " + rollno + " name: " + name + " course: " + course + " fee: " + fee;
     }
     void display()
     {
         System.out.println(toString());
     }
     public static void main(String[] args) 
     {
          thisConCall c1 = new thisConCall(112, "Jafar", "Java");
          thisConCall c2 = new thisConCall(112, "Jafar", "C#", 16500);
          c1.display();
          c2.display();
     }
}
