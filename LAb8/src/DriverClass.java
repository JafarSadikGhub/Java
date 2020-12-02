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
public class DriverClass 
{
     public static void main(String[] args) {
        PassingAccountHolder mofiz = new PassingAccountHolder(101, 2000);
        PassingAccountHolder kuddus = new PassingAccountHolder(101, 2000);
        PassingAccountHolder abul = new PassingAccountHolder(102, 2000);
        PassingAccountHolder mokles = new PassingAccountHolder(103, 2000);
        boolean result  = mofiz.isEqual(kuddus);
         System.out.println("Mofiz = Kuddus? : " + result);
         result  = mokles.isEqual(abul);
         System.out.println("Mokles = Abul? : " + result);
         mokles = mokles.returningObject(103, 20000);
         System.out.println("Moklesbal: " + mokles.balance);
         System.out.println(mokles);
    }
}
