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
public class VoidMax 
{
    public static void main(String[] args)
    {
        int voidMax = 0;
        voidMax(1, 2, voidMax);
        System.out.println(voidMax);
    }
    public static void voidMax(int value1, int value2, int voidMax)
    {
        if(value1>value2)
        {
            voidMax = value1;
        }
        else
            voidMax = value2;
        
    }

}
