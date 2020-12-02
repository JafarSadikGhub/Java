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
public class CounterWStatic
{
     static int counter = 0;
      
      CounterWStatic()
      {
          counter++;
      }
      @Override
      public String toString()
      {
         return  "Counter: " + counter;
      }
      public static void main(String[] args) {
        CounterWStatic c1 = new CounterWStatic();
         System.out.println(c1);
        CounterWStatic c2 = new CounterWStatic();
         System.out.println(c2);
        CounterWStatic c3 = new CounterWStatic();
         System.out.println(c3);
        CounterWStatic c4 = new CounterWStatic();
         
          System.out.println(c4);
      }
}
