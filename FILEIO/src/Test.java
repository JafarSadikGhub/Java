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
class Test
{

    public static void main(String[] args) throws InterruptedException
    {
        int s = 10;
        printAll(args);
    }

    public static void printAll(String[] lines) throws InterruptedException
    {
        for (int i = 0; i < lines.length; i++)
        {
            System.out.println(lines[i]);
            Thread.currentThread().sleep(1000);
        }
    }
}
