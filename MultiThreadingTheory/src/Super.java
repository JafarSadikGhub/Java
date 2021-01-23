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
import java.io.*;

class Super
{

    void show() throws IOException
    {
        System.out.println("parent");
    }
}

class Sub extends Super
{

    @Override
    void show() throws IOException
    {
        System.out.println("child");
    }

    public static void main(String[] args) throws IOException
    {
        Super s = new Sub();
        s.show();
    }
}
