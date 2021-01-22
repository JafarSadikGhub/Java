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
public class RunnableExample implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("Thread is running for runnable implementation"); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args)
    {
        RunnableExample runnable = new RunnableExample();
        Thread t1 = new Thread(runnable);
        t1.start();

    }

}
