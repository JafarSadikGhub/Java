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

/**
 *
 * @author JrBcrypted Md. Jafar Sadik ID: 1620660042
 */
public class Tickets extends SelectPromptOption
{

    Date date = new Date();
    String time_t = new Timestamp(date.getTime()).toString();
    String fileName = super.getCName() + time_t;

    public Tickets()
    {
        super();
    }

    public String getFileName()
    {
        return this.fileName;
    }

    public void makePrintableTicket(SelectPromptOption spo) throws IOException
    {
//        String fName = getFileName();
//        File ticketName = new File("D:\\tickets\\user.txt");
//        ticketName.mkdirs();
//
//        /*if (ticketName.createNewFile())
//        {
//            System.out.println("File Created: " + ticketName.getName());
//        } else
//        {
//            System.out.println("File already exists!");
//        }*/
//        ticketName.createNewFile();
//        System.out.println("\t\t\t------------------------------------------------------------------\t\t\t\n\n"
//                + "\t\t\t\tJSR Bus Ticketing Serivce\t\t\t\t\n"
//                + "\t\t\t\tPassenger name: " + spo.getCName() + "\t\t\t\t"
//                + "\n\t\t\t\tContact no: " + spo.getCContact() + "\t\t\t\t\n"
//                + "\t\t\t\tDate Issued: " + this.time_t + "\t\t\t\t\n"
//                + "\t\t\t\tBus Name: " + spo.getBusName() + " - " + spo.busCode + "\t\t\t\t\n"
//                + "\t\t\t\t" + spo.getCFrom() + " - " + spo.getCTo() + "\t\t\t\t\n"
//                + "\t\t\t\tTravel Date: " + spo.getDate() + "\t\t\t\t\n"
//                + "\t\t\t\tFare: Tk. " + spo.busFare + "\t\t\t\t\n"
//                + "\t\t\t\tSeat No: " + spo.seatNo + "\t\t\t\t\n\n"
//                + "\t\t\t------------------------------------------------------------------\t\t\t");
//
//        PrintWriter out = new PrintWriter(ticketName);
//        out.println("\t\t\t------------------------------------------------------------------\t\t\t\n"
//                + "\t\t\t\tJSR Bus Ticketing Serivce\t\t\t\t\n"
//                + "\t\t\t\tPassenger name: " + super.getCName() + "\t\t\t\t"
//                + "\n\t\t\t\tContact no: " + super.getCContact() + "\t\t\t\t\n"
//                + "\t\t\t\tDate Issued: " + this.time_t + "\t\t\t\t\n"
//                + "\t\t\t\tBus Name: " + super.getBusName() + " - " + super.busCode + "\t\t\t\t\n"
//                + "\t\t\t\t" + super.getCFrom() + " - " + super.getCTo() + "\t\t\t\t\n"
//                + "\t\t\t\tTravel Date: " + super.getDate() + "\t\t\t\t\n"
//                + "\t\t\t\tFare: Tk. " + this.busFare + "\t\t\t\t\n"
//                + "\t\t\t\tSeat No: " + this.seatNo + "\t\t\t\t\n");
//        out.close();
//    }

        try
        {
            File myFile = new File("amarfileTest.txt");
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
            FileWriter myFileWriter = new FileWriter("amarfile.txt");
            myFileWriter.write("Created from program!\nNew Line.HelloProgram");
            myFileWriter.close();
            System.out.println("File size in bytes: " + myFile.length());
        } catch (IOException e)
        {
            System.out.println("Error");
        }
    }

}
