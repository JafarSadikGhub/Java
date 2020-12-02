/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MultilevelInheritence;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
class Animal
{
    void eat()
    {
        System.out.println("Eating...");
    }
}
class Dog extends Animal
{
      void bark()
      {
           System.out.println("Barking..."); 
      }
}
class BabyDog extends Dog
{
    void weep()
    {
        System.out.println("Weeping...");
    }
}

class TestInheritence2
{
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
        
}
