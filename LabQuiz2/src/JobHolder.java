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
abstract class JobHolder 
{
   private String name;
   private int age;
   private int employeeNumber;
   private int salary;
   
   JobHolder(String name, int age, int employeeNumber, int salary)
   {
       this.name = name;
       this.age = age;
       this.employeeNumber = employeeNumber;
       this.salary = salary;
   }
   
   public String getName()
   {
       return this.name;
   }
   public int getAge()
   {
       return this.age;
   }
   public int getEmployeeNumber()
   {
       return this.employeeNumber;
   }
   public int getSalary()
   {
       return this.salary;
   }
   public void setName(String name)
   {
       this.name = name;
   }
   public void setAge( int age)
   {
       this.age = age;
   }
   public void setEmployeeNumber(int employeeNumber)
   {
       this.employeeNumber = employeeNumber;
   }
   public void setSalary(int salary)
   {
       this.salary = salary;
   }
   
   abstract void print();
           
}
