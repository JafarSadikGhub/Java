
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
public class My_square 
{
    private static boolean isMy_Square(int[][] sq, int n)
    {
        boolean ret = true;
        for(int i=0; i<sq[0].length; i++)
        {
            for (int j = 0; j < sq[1].length; j++)
            {
               if(sq[i][j]>n*n)
               {
                   
                   ret = false;
                   break;
               }
               else 
                   ret = true;
               
            }
        }
        return ret;
    }
    
    public static void main(String[] args)
    {
        
        System.out.println("Please enter the array dimension (n): ");
        Scanner input = new Scanner(System.in);
        int dim= input.nextInt();
        int [][] array1= new int[dim][dim];
        System.out.println("Input your array: ");
        int data;
        for(int i=0; i<dim; i++)
        {
            for(int j=0;j<dim; j++)
            {
                data = input.nextInt();
                array1[i][j] = data;
            }
        }
        System.out.println(isMy_Square(array1, 3));
    }
}
