/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seller;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author JrBcrypted Md. Jafar Sadik ID: 1620660042
 */
public class Revenue
{

    public static int getRevenue() throws FileNotFoundException, IOException, CsvValidationException
    {
        CSVReader reader = new CSVReader(new FileReader("C:\\Users\\USER\\JavaPractice\\BusTicketManagement\\All_tickets\\All_tickets.csv"));
        String[] nextLine;
        int index = 4;
        int totalRevenue = 0;
        //ArrayList<String> busInfoBusCode = new ArrayList<>();
        //int size = busInfoBusCode.size();
        while ((nextLine = reader.readNext()) != null)
        {

            totalRevenue = totalRevenue + Integer.parseInt(nextLine[index]);

        }
        return totalRevenue;
    }
}
