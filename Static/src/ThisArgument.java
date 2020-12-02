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
public class ThisArgument 
{
     void m(ThisArgument obj)
     {
         System.out.println("method is invoked: ");
     }
     void p()
     {
         m(this);
     }
     public static void main(String[] args) {
        ThisArgument s1 = new ThisArgument();
        s1.p();
    }
}
