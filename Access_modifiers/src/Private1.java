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
class A
{
     private int data = 40;
     int d = data;
    private void msg()
    {
        System.out.println("Hello Java");
    }
}
public class Private1
{
         public static void main(String[] args) {
          A obj = new A();
          //System.out.println(obj.data); CT error
          //obj.msg(); CT error
    }
}
