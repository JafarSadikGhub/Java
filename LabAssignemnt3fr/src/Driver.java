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
public class Driver 
{ 
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(3,5);
       //Printing the fractions...
        System.out.println("First Fraction:  " +  f1);
        System.out.println("Second Fraction:  " +  f2);
        //Calling the add method
        f1.add(f2);
        //Calling the sub method
        f1.sub(f2);
        //Calling the multiplication method
        f1.multiplication(f2);
        //Calling the division method
        f1.division(f2);
        
        
    }

}
