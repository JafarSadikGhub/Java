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
public class TestMultiplyUsingMethods 
{
     public static void main(String[] args)
     {
         int i =1;
         while(i<=6)
         {
             method1(i, 2);
             i++;
         }
     }
     public static void method1(int i, int num)
     {
         for(int j=1; j<=i; j++)
         {
             System.out.println(num + " ");
             num *=2;
         }
         System.out.println();
     }
}
