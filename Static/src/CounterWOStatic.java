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
public class CounterWOStatic 
{
      int counter = 0;
      
      CounterWOStatic()
      {
          counter++;
      }
      @Override
      public String toString()
      {
         return  "Counter: " + counter;
      }
      public static void main(String[] args) {
        CounterWOStatic c1 = new CounterWOStatic();
        CounterWOStatic c2 = new CounterWOStatic();
        CounterWOStatic c3 = new CounterWOStatic();
        CounterWOStatic c4 = new CounterWOStatic();
          System.out.println(c1);
          System.out.println(c2);
          System.out.println(c3);
          System.out.println(c4);
    }
}
