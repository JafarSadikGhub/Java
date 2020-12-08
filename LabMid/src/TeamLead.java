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
public class TeamLead
{
   private String name;
   private String almaMater;
   private int age;
   private int numberOfProjects;
   
   TeamLead(String name, String almaMater, int age)
   {
       this.name = name;
       this.almaMater = almaMater;
       this.age = age;
   }
   public void increaseProjects()
   {
       numberOfProjects++;
   }
   public void decreaseProjects()
   {
       numberOfProjects--;
   }
   //toString
   @Override
   public String toString()
   {
       return "[TEAMLEAD] Name: " + name + " Alma-mater: " + almaMater + " Age: " + age;
   }

    
}
