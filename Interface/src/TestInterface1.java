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
interface Drawable
{
    void draw();
    //^Same as- public abstract draw();
}
class Rectangle implements Drawable
{
    @Override
    public void draw()
    {
        System.out.println("Drawing Rectangle...");
    }
}
class Circle implements Drawable
{
    @Override
    public void draw()
    {
        System.out.println("Drawing Circle....");
    }
}
public class TestInterface1 
{
     public static void main(String[] args)
    {
        Drawable d = new Circle();
        d.draw();
    }
}
