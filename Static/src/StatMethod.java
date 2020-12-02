/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//If you apply static keyword with any method, it is known
//as static method.
//
//A static method belongs to the class rather than the
//object of a class.
//
//A static method can be invoked without the need for
//creating an instance of a class.
//
//A static method can access static data member and can
//change the value of it.

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class StatMethod
{
    static int cube(int x)
    {
        return x*x*x;
    }
    public static void main(String[] args) {
        int reuslt = StatMethod.cube(5);
        StatMethod ob1 = new StatMethod();
        int cube = ob1.cube(10);
        System.out.println(reuslt);
        System.out.println(cube);
    }
}
