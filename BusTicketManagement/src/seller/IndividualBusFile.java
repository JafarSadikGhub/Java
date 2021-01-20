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

        CSVWriter writer = new CSVWriter(new FileWriter(myCSVFile, true),
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.RFC4180_LINE_END);

        String busName1 = "All_tickets.csv";
        String dirName1 = "C:\\Users\\USER\\JavaPractice\\BusTicketManagement\\All_tickets";
        File dir1 = new File(dirName1);
        File myCSVFile1 = new File(dirName1, busName1);

        CSVWriter writer1 = new CSVWriter(new FileWriter(myCSVFile1, true),
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.RFC4180_LINE_END);

//        List<String[]> data = new ArrayList<>();
//        data.add(new String[]
//        {
//            spo.getDate(), spo.getSeatNo(), spo.getCName(), spo.getCContact()
//        });
        String[] record = (spo.getDate() + "," + spo.getSeatNo() + "," + spo.getCName() + "," + spo.getCContact()).split(",");
        String[] record1 = (spo.getBusCode() + "," + spo.getBusName() + "," + spo.getDate() + "," + spo.getSeatNo()
                + "," + spo.getBusFare()).split(",");
        //writer.writeAll(data);
        writer.writeNext(record);
        //writer.writeNext();
        writer.flush();
        writer1.writeNext(record1);
        writer1.flush();
        System.out.println("Data entered");
    }
}
