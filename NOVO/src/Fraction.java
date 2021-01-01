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
    private int numerator;
    private int denominator;

   Fraction(int n,int d){
        this.numerator=n;
        this.denominator=d;
       
        
        
    }
    
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setNumerator(int numerator){
        this.numerator=numerator;
    }
      public void setDenominator(int denominator){
       this.denominator=denominator; 
    }
    
    
    
    void add(Fraction fraction)
    {
       //int num = 12*5 + 16*4;
       int num = ((this.numerator * fraction.denominator) + 
               (this.denominator * fraction.numerator));
       int den = this.denominator * fraction.numerator;
        System.out.println(num + " / " + den);
    }
    int sub(float num,float dem){
        return numerator-denominator;
    }
    int mul(float num,float dem){
    return numerator*denominator;
    }
    int div(float num,float dem){
        return numerator/denominator;
    }
    void displayInformation(){
        System.out.println("Add: "+(numerator+denominator));
        System.out.println("Subtraction: "+(numerator-denominator));
        System.out.println("Multiplication: "+(numerator*denominator));
        System.out.println("Division: "+(numerator/denominator));
    }
}
