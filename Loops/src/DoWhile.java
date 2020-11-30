
import java.util.Scanner;

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
public class DoWhile
{
      public static void main(String[] args)
      {
          Scanner input = new Scanner(System.in);
          int number, max;
          number = input.nextInt();
          max = number;
          
          do
          {
              number = input.nextInt();
              if(number > max)
              {
                  max = number;
              } 
          }while(number!=0);
          
          System.out.println("max is " + max);
          System.out.println("number is " + number);
      }
}
