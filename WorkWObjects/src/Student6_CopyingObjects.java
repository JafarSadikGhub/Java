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
public class Student6_CopyingObjects
{
    String id;
    String name;
    
    Student6_CopyingObjects(String id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    Student6_CopyingObjects(Student6_CopyingObjects s)
    {
        this.id = s.id;
        this.name = s.name;
        
    }
    void display()
    {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) 
    {
           Student6_CopyingObjects s1 = new Student6_CopyingObjects("S01", "Jafar");
           Student6_CopyingObjects s2 = new Student6_CopyingObjects(s1);
          s1.display();
          s2.display();
    }
}
