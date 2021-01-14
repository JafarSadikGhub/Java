
package DriverPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import seller.BusInformation;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class DriverClass 
{
      public static void getBusInformationList()
      {
          List<BusInformation> busList = null;
          Scanner scanner = null;
          BufferedReader reader = null;
          try
          {
              reader = new BufferedReader(new FileReader("BusList.csv"));
              Map<String, Integer> busHeader = new HashMap<String, Integer>();
              String line = null;
              int index = 0;
              line = reader.readLine();
              
              if(line != null)
              {
                  StringTokenizer str = new StringTokenizer(line, ",");
                  int headerCount = str.countTokens();
                  for (int i = 0; i < headerCount; i++)
                  {
                      String headerKey = str.nextToken();
                      busHeader.put(headerKey.toUpperCase(), new Integer(i));
                  }
              }
              busList = new ArrayList<BusInformation>();
              while((line =reader.readLine()) != null)
              {
                    BusInformation bus = new BusInformation();
                    scanner = new Scanner(line);
                    scanner.useDelimiter(",");
                    
                    while(scanner.hasNext())
                    {
                        String data = scanner.next();
                        if(index == busHeader.get("From"))
                            bus.setFrom(data);
                        else if(index == busHeader.get("To"))
                            bus.setTo(data);
                        else if(index == busHeader.get("Route"))
                            bus.setRoute(data);
                        else if(index == busHeader.get("BusID"))
                            bus.setBusID(data);
                        else if(index == busHeader.get("BusName"))
                            bus.setBusName(data);
                        else if(index == busHeader.get("Time"))
                            bus.setTime(data);
                        else if(index == busHeader.get("Fare"))
                            bus.setFare(data);
                        
                        index++;
                    }
                    index = 0;
                    busList.add(bus);
              }
              reader.close();
              
          } catch(Exception e)
          {
              StringWriter stack = new StringWriter();
              e.printStackTrace(new PrintWriter(stack));
          } finally
          {
              scanner.close();
          }
          System.out.println("list--" + busList);
      }
      public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("BusList.csv"));
          String line= " ";
          String csvSplitBy = ",";
        while ((line = br.readLine()) != null) {
            
    // use comma as separator
       String[] cols = line.split(csvSplitBy);
       System.out.println("Coulmn 4= " + cols[1] + " , Column 5=" + cols[1]);
}
         //getBusInformationList();
       /* Scanner input = new Scanner(System.in);
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
        }*/
        
    }
}
