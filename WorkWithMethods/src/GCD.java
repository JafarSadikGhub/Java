
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
public class GCD
{
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        num1 = inp.nextInt();
        System.out.println("Please enter the second number: ");
        num2 = inp.nextInt();
        int getGCD = getGCD(num1, num2);
        System.out.println(getGCD);
        
    }
    
    public static int getGCD(int n1, int n2)
    {
        int gcd = 1;
        int init =2;
        while(init<=n1 && init<=n2)
        {
            if(n1%init==0 && n2%init==0)
            {
                gcd = init;
              
            }
            init++;
        }
        return gcd;
    }
     
     
}
