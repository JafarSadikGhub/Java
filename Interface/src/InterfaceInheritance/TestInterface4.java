/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfaceInheritance;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
interface Printable
{
    void print();
}
interface Showable extends Printable
{
    void show();
}
public class TestInterface4 implements Showable
{
    @Override
    public void print()
    {
        System.out.println("Hello");
    }
    @Override
    public void show()
    {
        System.out.println("Welcome");
    }
    public static void main(String[] args)
    {
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show();
                
    }
}

