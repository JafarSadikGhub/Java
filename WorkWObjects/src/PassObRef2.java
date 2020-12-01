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
public class PassObRef2 
{
      int a, b;
      
      PassObRef2(int a, int b)
      {
          this.a = a;
          this.b = b;
      }
      void meth( PassObRef2 o)
      {
          o.a = a *2;
          o.b = b/2;
      }
      public static void main(String[] args) 
      {
          PassObRef2 ob1 = new PassObRef2(25, 30);
          System.out.println("Before: " + ob1.a + " " + ob1.b);
          ob1.meth(ob1);
          System.out.println("After: " + ob1.a + " " + ob1.b);
          
          
       }
              
}
