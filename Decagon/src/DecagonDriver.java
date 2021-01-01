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
public class DecagonDriver 
{
    public static void main(String[] args)
    {
        RGB r1 = new RGB(122, 255, 122);
        Decagon d1 = new Decagon(2, r1);
        Decagon d2 = new Decagon(8, r1);
        int comp = d1.compareArea(d2);
        System.out.println("Comparing, d1 calling d2 in param: " + comp);
        float areaD1 = d1.getArea();
        float areaD2 = d2.getArea();
        System.out.println("Area of d1: " + areaD1);
        System.out.println("Area of d2: " + areaD2);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        //System.out.println(r1);
    }
}
