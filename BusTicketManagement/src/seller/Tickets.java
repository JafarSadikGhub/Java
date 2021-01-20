/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 *
 * @author Sadiat Jahan Mimpa ID: 1612807042
 */
public class Tickets extends SelectPromptOption
{

    //Date date = new Date();
    //String time_t = new Timestamp(date.getTime()).toString();
    //String fileName = super.getCName() + time_t;
    public Tickets()
    {
        super();
    }

    public String toDate(long timestamp)
    {
        Date date = new Date(timestamp);
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public void makePrintableTicket(SelectPromptOption spo) throws IOException
    {
        String fileName = spo.getCName() + spo.getCContact() + toDate(System.currentTimeMillis()) + ".txt";
        System.out.println("FileName:  " + fileName);
        String dirName = "C:\\Users\\USER\\JavaPractice\\BusTicketManagement\\tickets";
        try
        {
            File dir = new File(dirName);
            File myFile = new File(dirName, fileName);
            if (myFile.createNewFile())
            {
                System.out.println("File Created: " + myFile.getName());
            } else
            {
                System.out.println("File already exists!");
            }
            if (myFile.exists())
            {
                System.out.println("Absolute Path: " + myFile.getAbsolutePath());
                System.out.println("Writable?: " + myFile.canWrite());
                System.out.println("Readable?: " + myFile.canRead());
                System.out.println("File size in bytes: " + myFile.length());
            } else
            {
                System.out.println("File Doesn't EXISTS!");
            }
            //Creating an object of FileWriter
            FileWriter myFileWriter = new FileWriter(myFile);
            myFileWriter.write("\t\t\t------------------------------------------------------------------\t\t\t\n\n"
                    + "\t\t\t\tJSR Bus Ticketing Serivce\t\t\t\t\n"
                    + "\t\t\t\tPassenger name: " + spo.getCName() + "\t\t\t\t"
                    + "\n\t\t\t\tContact no: " + spo.getCContact() + "\t\t\t\t\n"
                    + "\t\t\t\tDate Issued: " + toDate(System.currentTimeMillis()) + "\t\t\t\t\n"
                    + "\t\t\t\tBus Name: " + spo.getBusName() + " - " + spo.busCode + "\t\t\t\t\n"
                    + "\t\t\t\t" + spo.getCFrom() + " - " + spo.getCTo() + "\t\t\t\t\n"
                    + "\t\t\t\tTravel Date: " + spo.getDate() + "\t\t\t\t\n"
                    + "\t\t\t\tFare: Tk. " + spo.busFare + "\t\t\t\t\n"
                    + "\t\t\t\tSeat No: " + spo.seatNo + "\t\t\t\t\n\n"
                    + "\t\t\t------------------------------------------------------------------\t\t\t");
            myFileWriter.close();
            System.out.println("File size in bytes: " + myFile.length());
        } catch (IOException e)
        {
            System.out.println("Error: " + e);
        }
    }

}
