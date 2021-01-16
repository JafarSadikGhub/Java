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

    public void makePrintableTicket(Tickets t) throws IOException
    {
        String fName = t.getFileName();
        File ticketName = new File(fName);
        PrintWriter out = new PrintWriter(fName);
        out.println("\t\t\t------------------------------------------------------------------\t\t\t\n"
                + "\t\t\t\tJSR Bus Ticketing Serivce\t\t\t\t\n"
                + "\t\t\t\tPassenger name: " + super.getCName() + "\t\t\t\t"
                + "\n\t\t\t\tContact no: " + super.getCContact() + "\t\t\t\t\n"
                + "\t\t\t\tDate Issued: " + this.time_t + "\t\t\t\t\n"
                + "\t\t\t\tBus Name: " + super.getBusName() + " - " + super.busCode + "\t\t\t\t\n"
                + "\t\t\t\t" + super.getCFrom() + " - " + super.getCTo() + "\t\t\t\t\n"
                + "\t\t\t\tTravel Date: " + super.getDate() + "\t\t\t\t\n"
                + "\t\t\t\tFare: Tk. " + this.busFare + "\t\t\t\t\n"
                + "\t\t\t\tSeat No: " + this.seatNo + "\t\t\t\t\n");

    }

}
