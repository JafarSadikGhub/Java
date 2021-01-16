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
import java.util.Scanner;

class Conversation
{

    public static void main(String[] args)
    {

        Chat chat = new Chat();

        new Thread1(chat).start();
        new Thread2(chat).start();
        new Thread3(chat).start();
    }
}

class Chat
{

    volatile boolean aliveUser1 = true;

    public void terminateUser1()
    {
        this.aliveUser1 = false;
    }

    volatile boolean aliveUser2 = true;

    public void terminateUser2()
    {
        this.aliveUser2 = false;
    }

    volatile boolean aliveUser3 = true;

    public void terminateUser3()
    {
        this.aliveUser3 = false;
    }

    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    String str1, str2, str3;
    int flag = 0;

    public synchronized void getTalk1() throws InterruptedException
    {
        if (flag == 1)
        {
            wait();
        }
        System.out.print("User1: ");
        str1 = sc1.nextLine();
        if (str1.equalsIgnoreCase("stop"))
        {
            System.out.println("\nUser1 has left the chat.");
            terminateUser1();
        }
        flag = 1;
        notifyAll();
    }

    public synchronized void getTalk2() throws InterruptedException
    {
        if (flag == 0)
        {
            wait();
        }
        System.out.print("User2: ");
        str2 = sc2.nextLine();
        if (str2.equalsIgnoreCase("stop"))
        {
            System.out.println("\nUser2 has left the chat. This chat has been finished ");
            terminateUser2();
            System.exit(0);

        }

        flag = 0;
        notifyAll();
    }

    public synchronized void getTalk3() throws InterruptedException
    {
        if (flag == 3 || flag == 1)
        {
            wait();
        }
        System.out.print("User3: ");
        str3 = sc3.nextLine();
        if (str3.equalsIgnoreCase("stop"))
        {
            System.out.println("\nUser3 has left the chat.");
            terminateUser3();
        }

        flag = 3;
        notifyAll();
    }

}

class Thread1 extends Thread
{

    Chat chat;

    public Thread1(Chat chat)
    {
        this.chat = chat;
    }

    public void run()
    {
        try
        {
            while (chat.aliveUser1)
            {
                chat.getTalk1();
            }
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread
{

    Chat chat;

    public Thread2(Chat chat)
    {
        this.chat = chat;
    }

    public void run()
    {
        try
        {
            while (chat.aliveUser2)
            {
                chat.getTalk2();
            }
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class Thread3 extends Thread
{

    Chat chat;

    public Thread3(Chat chat)
    {
        this.chat = chat;
    }

    public void run()
    {
        try
        {
            while (chat.aliveUser3)
            {
                chat.getTalk3();
            }
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
