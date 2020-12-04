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
abstract class Bank 
{
    abstract int getRateOfInterest();
}
class SBI extends Bank
{
    @Override
    int getRateOfInterest()
    {
        return 8;
    }
}
class PNB extends Bank
{
    @Override
    int getRateOfInterest()
    {
        return 7;
    }
}
class TestBank
{
    public static void main(String[] args)
    {
        Bank b;
        b = new SBI();
        System.out.println("Rate of interest is : " + b.getRateOfInterest() + " %");
        b = new PNB();
        System.out.println("Rate of interest is : " + b.getRateOfInterest() + " %");
    }
}
