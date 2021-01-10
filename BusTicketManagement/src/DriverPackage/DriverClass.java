/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DriverPackage;

import java.util.Scanner;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class DriverClass 
{
      public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String adminPWD = " ";
        String fixedPWD = "qwerty1234";
        String cName, cContact, cFrom, cTo, date, time;
        while(true)
        {
            System.out.println("\t\t-----------\nWelcome to our System.\nPress 'A' to enter the admin panel,\npress 'T' to buy a ticket, press 'X' to exit anytime:\n\t\t----------");
            char inputOption = input.next().charAt(0);
            input.nextLine();
            
            if(inputOption == 'A' || inputOption == 'a')
            {
                System.out.println("Welcome to the admin Panel!\nPlease enter your password to confirm your access: ");
                adminPWD = input.nextLine();
                if(adminPWD.equals(fixedPWD))
                {
                    System.out.println("Access granted!");
                    //Some code, will implement later;
                }
                else
                {
                    System.out.println("Wrong Input!\nYou are exiting this program.");
                  //  System.exit(0);
                    break;
                }
                
            }
            else if(inputOption == 'T' || inputOption == 't')
            {
                System.out.println("Welcome to the tickets option!\nPlease enter your name: ");
                cName = input.nextLine();
                System.out.println("Your contact number: ");
                cContact = input.nextLine();
                System.out.println("From Where you want to start journey?");
                cFrom = input.nextLine();
                System.out.println("To?");
                cTo = input.nextLine();
                System.out.println("Enter your date: ");
                date = input.nextLine();
                System.out.println("Enter your time: ");
                time = input.nextLine();
                
                
            }
            else if(inputOption == 'X' || inputOption == 'x')
            {
                break;
            }
            else
                break;
        }
        
    }
}
