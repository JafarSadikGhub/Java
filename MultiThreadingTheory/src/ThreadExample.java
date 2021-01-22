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
public class ThreadExample extends Thread
{

    public void run()
    {
        System.out.println("The thread is running");
    }

    public static void main(String[] args)
    {
        ThreadExample t1 = new ThreadExample();
        t1.start();
    }
}
