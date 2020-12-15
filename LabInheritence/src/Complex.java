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
public class Complex {

    double real;
    double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex add(Complex num1, Complex num2)
    {
        Complex val = new Complex(0.0, 0.0);

        val.real = num1.real + num2.real;
        val.imaginary = num1.imaginary + num2.imaginary;

        return(val);
    }
}
