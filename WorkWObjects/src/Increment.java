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
public class Increment
{
     int a;
     Increment(int a)
     {
         this.a = a;
     }
     Increment incByTen()
     {
         Increment o = new Increment(a + 10);
         return o;
     }
     public static void main(String[] args) {
        Increment ob1 = new Increment(2);
        Increment ob2 = ob1.incByTen();
         System.out.println("ob1.a: " + ob1.a);
         
    }
}
