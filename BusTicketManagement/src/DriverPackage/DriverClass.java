package DriverPackage;

import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import seller.AddNewBus;
import seller.Bus;
import seller.IndividualBusFile;
import seller.Revenue;
import seller.SelectPromptOption;
import seller.Tickets;

/**
 *
 * @authors Md. Jafar Sadik ID: 1620660042 Sadiat Jahan Mimpa 1612807042 Rafsina
 * Osman Riya 1611446042
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
        IndividualBusFile ibf = new IndividualBusFile();
        Tickets t1 = new Tickets();
        String busID = "", busName = "", destination = "", startingTime = "", busRoute = "";
        int fare = 0;
        String startingLocation = "";

        AddNewBus anb = new AddNewBus(busID, busName, startingLocation, destination, fare, startingTime, busRoute);

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
                    while (true)
                    {
                        System.out.println("Press 1 to add new bus, press 2 to get revenue information of busses."
                                + "\nPress 0 to exit this admin panel");
                        String in = input.nextLine();
                        if (in.equals("1"))
                        {
                            System.out.println("Here");
                            anb.takeInput();
                            anb.addNewBus();

                        } else if (in.equals("2"))
                        {
                            int rev = Revenue.getRevenue();
                            System.out.println("Total Revenue so far: " + rev);

                        } else if (in.equals("0"))
                        {
                            break;
                        }
                    }

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
                spo.setCContact(cContact);

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
                spo.readFileBusCode();

                System.out.println("Please Enter a date you want to travel: ");
                date = input.nextLine();
                spo.setDate(date);
                System.out.println("Select the seat number(1-50): ");
                String seat = input.nextLine();
                spo.setSeatNo(seat);

                String confirm = null;
                System.out.println("\nConfirm[Y / N] ?");
                confirm = input.nextLine();

                if (confirm.equals("y") || confirm.equals("Y"))
                {
                    t1.makePrintableTicket(spo);
                    IndividualBusFile.createNewBus(spo);
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
