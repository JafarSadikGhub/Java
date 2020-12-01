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
public class PassObReference
{
           int a, b;
           PassObReference(int a, int b)
           {
               this.a = a;
               this.b = b;
           }
           boolean isEqual(PassObReference o)
           {
               if(o.a == a && o.b == b )
               {
                   return true;
               }
               else
                   return false;
           }
           public static void main(String[] args) 
           {
               PassObReference ob1 = new PassObReference(111, 527);
               PassObReference ob2 = new PassObReference(111, 527);
               PassObReference ob3 = new PassObReference(11, 527);
               System.out.println("ob1 == ob2 :" + ob1.isEqual(ob2));
               System.out.println("ob1 == ob2 :" + ob1.isEqual(ob3));
           }
}
