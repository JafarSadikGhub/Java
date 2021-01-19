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

        CSVWriter writer = new CSVWriter(new FileWriter(myCSVFile, true));

//        List<String[]> data = new ArrayList<>();
//        data.add(new String[]
//        {
//            spo.getDate(), spo.getSeatNo(), spo.getCName(), spo.getCContact()
//        });
        String[] record = (spo.getDate() + "," + spo.getSeatNo() + "," + spo.getCName() + "," + spo.getCContact()).split(",");

        //writer.writeAll(data);
        writer.writeNext(record);
        //writer.writeNext();
        writer.flush();
        System.out.println("Data entered");
    }
}
