/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seller;

import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JrBcrypted Md. Jafar Sadik ID: 1620660042
 */
public class AddNewBus extends Bus
{

    public AddNewBus(String busID, String busName, String startingLocation, String destination, int fare, String startingTime, String busRoute)
    {
        super(busID, busName, startingLocation, destination, fare, startingTime, busRoute);
    }

    public void addNewBus() throws IOException
    {
        File busList = new File("BusList.csv");
        CSVWriter writer = new CSVWriter(new FileWriter(busList, true),
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.RFC4180_LINE_END);

        String[] record = (this.getStartingLocation() + "," + this.getDestination() + "," + this.getBusRoute() + ","
                + this.getBusID() + "," + this.getBusName() + ","
                + this.getStartingTime() + "," + this.getFare()).split(",");
        writer.writeNext(record);
        writer.flush();
        System.out.println("New Bus Added");

    }

    public void takeInput()
    {
        String start;
        String end;
        String route;
        String name;
        String time;
        String id;
        int fare;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the starting location for new bus: ");
        start = input.nextLine();
        setStartingLocation(start);

        System.out.println("Please enter the destination for new bus: ");
        end = input.nextLine();
        setDestination(end);

        System.out.println("Please enter the route number for new bus: ");
        route = input.nextLine();
        setBusRoute(route);

        System.out.println("Please enter the bus ID for new bus: ");
        id = input.nextLine();
        setBusID(id);

        System.out.println("Please enter the bus name: ");
        name = input.nextLine();
        setBusName(name);

        System.out.println("Enter the time that the bus will leave for the destination: ");
        time = input.nextLine();
        setStartingTime(time);

        System.out.println("Enter the ticket price: ");
        fare = input.nextInt();
        setFare(fare);

    }
}
