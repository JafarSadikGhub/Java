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
public class Student_CPOM2 
{
       String id;
       String name;
       Student_CPOM2(String id, String name)
       {
           this.id = id;
           this.name = name;
     
       }
       Student_CPOM2()
       {
           
       }
       void display()
       {
           System.out.println(id + " " + name);
       }
       public static void main(String[] args) {
        Student_CPOM2 s1 = new Student_CPOM2("jafar01", "Jafar");
        Student_CPOM2 s2 = new Student_CPOM2();
        s2.id = s1.id;
        s2.name = s1.name;
        s1.display();
        s2.display();   
    }
}
