/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HierarchicalInheritance;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class Animal 
{
    void eat()
    {
        System.out.println("Eatinggggg....");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Barkinggggg....");
    }
}
class Cat extends Animal
{
    void meaow()
    {
        System.out.println("Meaowingggg...");
    }
}
class TestInheritence3
{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.meaow();
        //c.bark(); CT error
    }
}
