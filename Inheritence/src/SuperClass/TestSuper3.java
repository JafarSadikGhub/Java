/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SuperClass;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
class Person
{
    int id;
    String name;
    Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
class Emp extends Person
{
    float salary;
    Emp(int id, String name, float salary)
    {
        super(id, name);
        this.salary = salary;
    }
   @Override
   public String toString()
   {
       return "Id: " +  id + " Name: "  + name + " Salary: " + salary; 
   }
}


public class TestSuper3 
{
    public static void main(String[] args)
    {
        Emp e = new Emp(120, "jafar", 500000);
        System.out.println(e);
                
    }
}
