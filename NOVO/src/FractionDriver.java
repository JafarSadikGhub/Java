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
public class FractionDriver 
{
   
    public static void main(String[] args) {
        Fraction data1;
        data1 = new Fraction(12,16);
        data1.setDenominator(10);
        data1.setNumerator(20);
        //int numerator = data1.numerator;
      //  data1.numerator=10;
        //int denominator=data1.denominator;
       // data1.denominator=20;
        System.out.println(data1.getNumerator());
        System.out.println(data1.getDenominator());
        data1.denominator=24;
        data1.numerator=12;
        data1.displayInformation();
       
        
        
    }
    
}

