package DriverPackage;

import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import seller.SelectPromptOption;

/**
 *
 * @author JrBcrypted Md. Jafar Sadik ID: 1620660042
 */
public class DriverClass
{

    public static void main(String[] args) throws IOException, FileNotFoundException, CsvValidationException
    {

        //getBusInformationList();
        Scanner input = new Scanner(System.in);
        String adminPWD = " ";
        String fixedPWD = "qwerty1234";
        String cName, cContact, cFrom, cTo, date, time;
        SelectPromptOption spo = new SelectPromptOption();

        while (true)
        {
            System.out.println("\t\t-----------\nWelcome to our System."
                    + "\nPress 'A' to enter the admin panel,"
                    + "\npress 'T' to buy a ticket, press 'X' to exit anytime:\n\t\t----------");
            char inputOption = input.next().charAt(0);
            input.nextLine();

            if (inputOption == 'A' || inputOption == 'a')
            {
                System.out.println("Welcome to the admin Panel!"
                        + "\nPlease enter your password to confirm your access: ");
                adminPWD = input.nextLine();
                if (adminPWD.equals(fixedPWD))
                {
                    System.out.println("Access granted!");
                    //Some code, will implement later;
                } else
                {
                    System.out.println("Wrong Input!\nYou are exiting this program.");
                    //  System.exit(0);
                    break;
                }

            } else if (inputOption == 'T' || inputOption == 't')
            {
                System.out.println("Welcome to the tickets option!\nPlease enter your name: ");
                cName = input.nextLine();
                spo.setCName(cName);

                System.out.println("Your contact number: ");
                cContact = input.nextLine();

                System.out.println("From Where you want to start journey?\nType any one from below: ");
                spo.readFileFrom();
                String from = input.nextLine();
                spo.setCFrom(from);

                System.out.println("Where you want to go?\nType one of the below: ");
                spo.readFileTo();
                String to = input.nextLine();
                spo.setCTo(to);

                System.out.println("Enter your time?\nType one of the below:  ");
                spo.readFileTime();
                time = input.nextLine();
                spo.setTime(time);

                System.out.println("Please Select the bus. Type one of the below: ");
                spo.readFileBusName();
                String bus = input.nextLine();
                spo.setBusName(bus);

                spo.readFileBusFare();

                System.out.println("Please Enter a date you want to travel: ");
                date = input.nextLine();
                spo.setDate(date);

                String confirm = null;
                confirm = input.nextLine();
                if (confirm.equals("y") || confirm.equals("Y"))
                {
                    //Code for print ticket
                } else
                {
                    break;
                }

//                System.out.println("Enter your date: ");
//                date = input.nextLine();
//                spo.setDate(date);
            } else if (inputOption == 'X' || inputOption == 'x')
            {
                break;
            } else
            {
                break;
            }
        }

    }
}
