/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MultipleInheritence;

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
    //void print();
    void show();
}
public class TestInterface3 implements Showable
{
    @Override
    public void print()
    {
        System.out.println("Hello");
    }
    public void show()
    {
        System.out.println("Showing..");
    }
    public static void main(String[] args)
    {
        Showable p = new TestInterface3();
        //TestInterface3 p = new TestInterface3();
       p.print();
       p.show();
    }
}
