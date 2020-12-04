/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java8;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
interface Drawable
{
    void draw();
    //^public abstract void draw();
    default void msg()
    {
        System.out.println("Default method...");
    }
//    default int cube(int y)
//    {
//        return y*y*y;
//        //Driver File: d.cube(3);
//    }
//    static int cube(int y)
//    {
//        return y*y*y;
//        //Driver File: Drawable.cube(3);
//    }
    public static int cube(int y)
    {
        return y*y*y;
        //Driver File: Drawable.cube(3);
    }
}
class Rectangle implements Drawable
{   @Override
    public void draw()
    {
        System.out.println("Drawing Rectangle....");
    }
}
public class TextInterfaceDefaultSlashStatic 
{
    public static void main(String[] args)
    {
        Drawable d = new Rectangle();
        d.draw();
        d.msg();
        System.out.println(Drawable.cube(3));
    }
}
