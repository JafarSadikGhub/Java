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
interface printable
{
   void print();
   //^actually means- public abstract void print();
}
class A6 implements printable
{
    @Override
    public void print()
    {
        System.out.println("Hello");
    }
    public static void main(String[] args)
    {
        A6 obj = new A6();
        obj.print();
    }
}
