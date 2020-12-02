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
public class Fraction 
{
         private int denominator;
         private int numerator;
         Fraction(int numerator, int denominator)
         {
             this.numerator = numerator;
             this.denominator = denominator;
         }
         public int getNumerator()
         {
             return this.numerator;
         }
         public int getDenominator()
         {
             return this.denominator;
         }
         public void setNumerator(int numerator)
         {
             this.numerator = numerator;
         }
         public void setDenominator(int denominator)
         {
             this.denominator = denominator;
         }
         @Override
         public String toString()
         {
             return numerator + "/ " + denominator;
         }
         public void add(Fraction fraction)
         {
             int num = (numerator * fraction.denominator) + (denominator * fraction.numerator);
             int den = denominator * fraction.denominator;
             System.out.println("Addition: " + num + "/" + den);
             //Fraction result = new Fraction(num, den);
             
             
         }
         public void sub(Fraction fraction)
         {
             int num = (numerator * fraction.denominator) - (denominator * fraction.numerator);
             int den = denominator * fraction.denominator;
             System.out.println("Subtraction: " + num +"/" + den);
         }
         public void multiplication(Fraction fraction)
         {
             int num = numerator * fraction.numerator;
             int den = denominator * fraction.denominator;
             System.out.println("Multiplication: " + num + "/" + den);
         }
         public void division(Fraction fraction)
         {
             int num = (numerator * fraction.denominator);
             int den = (denominator * fraction.numerator);
             System.out.println("Division: " + num + "/" + den);
         }
}
