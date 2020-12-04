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
abstract class Shape
{
    abstract void draw();
}
class Rectangle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing rectangle...");
    }
}
class Circle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing Circle...");
    }
}

public class TestAbstraction1 
{
    public static void main(String[] args)
    {
        Shape s = new Rectangle();
        s.draw();
    }
}
