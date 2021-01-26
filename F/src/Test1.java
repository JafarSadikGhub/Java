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
public class Test1
{

    static int x;
    int y;

    Test1()
    {
        x = 10;
        y = 20;
    }
}

class TestD
{

    public static void main(String[] args)
    {
        Test1 t = new Test1();
        t.x = 40;
        Test1 t2 = new Test1();
        t2.y = 100;
        System.out.println(t.x + " " + t.y);
    }
}
