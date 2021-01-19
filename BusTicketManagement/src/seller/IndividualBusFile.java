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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JrBcrypted Md. Jafar Sadik ID: 1620660042
 */
public class IndividualBusFile
{

    public IndividualBusFile()
    {
    }

    public static void createNewBus(SelectPromptOption spo) throws IOException
    {
        //Instantiating the CSVWriter class
        String busName = spo.getBusCode() + ".csv";
        String dirName = "C:\\Users\\USER\\JavaPractice\\BusTicketManagement\\Busses";
        File dir = new File(dirName);
        File myCSVFile = new File(dirName, busName);

        CSVWriter writer = new CSVWriter(new FileWriter(myCSVFile));
        //Writing data to a csv file
        String line1[] =
        {
            "Date", "Seat", "Passenger Name", "Contact"
        };
        String line2[] =
        {
            // "1", "Krishna", "2548", "2012-01-01", "IT"
            spo.getDate(), spo.getSeatNo(), spo.getCName(), spo.getCContact()
        };
//        String line3[] =
//        {
//            "2", "Vishnu", "4522", "2013-02-26", "Operations"
//        };
//        String line4[] =
//        {
//            "3", "Raja", "3021", "2016-10-10", "HR"
//        };
//        String line5[] =
//        {
//            "4", "Raghav", "6988", "2012-01-01", "IT"
//        };
        //Writing data to the csv file
        writer.writeNext(line1);
        writer.writeNext(line2);

        //Flushing data from writer to file
        writer.flush();
        System.out.println("Data entered");
    }
}
