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
public class Animal 
{
    Animal()
    {
        System.out.println("Animal Is Created.....");
    }
    void eat()
     {
         System.out.println("Eatingggg....");
     }
}
class Dog extends Animal
{
    Dog()
    {
       // super();
        System.out.println("Dog Is Created.....");
    }
    @Override
    void eat()
    {
        System.out.println("Eating breaaadddd....");
    }
    void bark()
    {
        System.out.println("Barkingggg...");
    }
    void work()
    {
       super.eat();
       bark();
    }
    
}
class TestSuper
{
    public static void main(String[] args)
    {
        Dog d = new Dog(); // Will call the existing two constructor
        d.work();
        
    }
}
