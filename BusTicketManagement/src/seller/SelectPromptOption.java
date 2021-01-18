/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seller;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JrBcrypted Md. Jafar Sadik ID: 1620660042
 */
public class SelectPromptOption
{
    // private String from, to;

    private static int index;

    Scanner input = new Scanner(System.in);
    String adminPWD = " ";
    String fixedPWD = "qwerty1234";
    String cName, cContact, date, time, busName, busCode;
    String busFare;
    //String inputOption;
    String cFrom, cTo, seatNo;

    public SelectPromptOption()
    {

    }
    //setter

    public void setCName(String cName)
    {
        this.cName = cName;
    }

    public void setSeatNo(String seatNo)
    {
        this.seatNo = seatNo;
    }

    public void setBusName(String busName)
    {
        this.busName = busName;
    }

    public void setCContact(String cContact)
    {
        this.cContact = cContact;
    }

    public void setCFrom(String cFrom)
    {
        this.cFrom = cFrom;
    }

    public void setCTo(String cTo)
    {
        this.cTo = cTo;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    //getters
    public String getCName()
    {
        return this.cName;
    }

    public String getCContact()
    {
        return this.cContact;
    }

    public String getDate()
    {
        return this.date;
    }

    public String getCFrom()
    {
        return this.cFrom;
    }

    public String getCTo()
    {
        return this.cTo;
    }

    public String getBusName()
    {
        return this.busName;
    }

    public String getSeatNo()
    {
        return this.seatNo;
    }

    public void readFileFrom() throws IOException
    {
        ArrayList<String> busInfoCol = new ArrayList<>();
        int size = busInfoCol.size();
        BufferedReader br = new BufferedReader(new FileReader("BusList.csv"));
        String line = " ";
        String csvSplitBy = ",";
        int sl = 0;
        System.out.println("here");
        while ((line = br.readLine()) != null)
        {
            // use comma as separator
            //System.out.println("here1");
            String[] cols = line.split(csvSplitBy);
            String content = null;
            if (!busInfoCol.contains(cols[index]))
            {
                busInfoCol.add(cols[index]);
            }

        }
        size = busInfoCol.size();
        for (int i = 0; i < size; i++)
        {
            System.out.println(i + 1 + ". " + busInfoCol.get(i));
        }
    }

    public void readFileTo()
            throws FileNotFoundException, IOException, CsvValidationException
    {
        CSVReader reader = new CSVReader(new FileReader("BusList.csv"));
        String[] nextLine;
        int columnIndexOfFrom = 0;
        ArrayList<String> busInfoTo = new ArrayList<>();
        int size = busInfoTo.size();
        while ((nextLine = reader.readNext()) != null)
        {
            String contentTo = null;
            if (nextLine[columnIndexOfFrom].matches(this.cFrom))
            {
                if (!busInfoTo.contains(nextLine[1]))
                {
                    busInfoTo.add(nextLine[1]);
                }
            }

        }
        size = busInfoTo.size();
        for (int i = 0; i < size; i++)
        {
            System.out.println(i + 1 + ". " + busInfoTo.get(i));
        }

    }

    public void readFileTime()
            throws FileNotFoundException, IOException, CsvValidationException
    {
        CSVReader reader = new CSVReader(new FileReader("BusList.csv"));
        String[] nextLine;
        int columnIndexOfFrom = 0;
        int columnIndexOfTo = 1;
        ArrayList<String> busInfoTime = new ArrayList<>();
        int size = busInfoTime.size();
        while ((nextLine = reader.readNext()) != null)
        {
            String contentTo = null;
            if ((nextLine[columnIndexOfFrom].matches(this.cFrom)) && (nextLine[columnIndexOfTo].matches(this.cTo)))
            {
                if (!busInfoTime.contains(nextLine[5]))
                {
                    busInfoTime.add(nextLine[5]);
                }
            }

        }
        size = busInfoTime.size();
        for (int i = 0; i < size; i++)
        {
            System.out.println(i + 1 + ". " + busInfoTime.get(i));
        }

    }

    public void readFileBusName()
            throws FileNotFoundException, IOException, CsvValidationException
    {
        CSVReader reader = new CSVReader(new FileReader("BusList.csv"));
        String[] nextLine;
        int columnIndexOfFrom = 0;
        int columnIndexOfTo = 1;
        int columnIndexOfTime = 5;
        ArrayList<String> busInfoBusName = new ArrayList<>();
        int size = busInfoBusName.size();
        while ((nextLine = reader.readNext()) != null)
        {
            String contentTo = null;
            if ((nextLine[columnIndexOfFrom].matches(this.cFrom))
                    && (nextLine[columnIndexOfTo].matches(this.cTo))
                    && (nextLine[columnIndexOfTime].matches(this.time)))
            {
                if (!busInfoBusName.contains(nextLine[4]))
                {
                    busInfoBusName.add(nextLine[4]);
                    //System.out.println("here");
                }
            }

        }
        size = busInfoBusName.size();
        for (int i = 0; i < size; i++)
        {
            System.out.println(i + 1 + ". " + busInfoBusName.get(i));
        }

    }

    public void readFileBusFare()
            throws FileNotFoundException, IOException, CsvValidationException
    {
        CSVReader reader = new CSVReader(new FileReader("BusList.csv"));
        String[] nextLine;
        int columnIndexOfFrom = 0;
        int columnIndexOfTo = 1;
        int columnIndexOfTime = 5;
        int columnIndexOfBusName = 4;
        ArrayList<String> busInfoBusFare = new ArrayList<>();
        int size = busInfoBusFare.size();
        while ((nextLine = reader.readNext()) != null)
        {
            String contentTo = null;
            if ((nextLine[columnIndexOfFrom].matches(this.cFrom))
                    && (nextLine[columnIndexOfTo].matches(this.cTo))
                    && (nextLine[columnIndexOfTime].matches(this.time))
                    && (nextLine[columnIndexOfBusName].matches(this.busName)))
            {
                if (!busInfoBusFare.contains(nextLine[6]))
                {
                    busInfoBusFare.add(nextLine[6]);
                    //System.out.println("here");
                }
            }

        }
        size = busInfoBusFare.size();
        for (int i = 0; i < size; i++)
        {
            this.busFare = busInfoBusFare.get(i);
            System.out.println("Fare: " + busInfoBusFare.get(i) + "\nConfirm[Y / N] ?");

        }

    }

    public void readFileBusCode()
            throws FileNotFoundException, IOException, CsvValidationException
    {
        CSVReader reader = new CSVReader(new FileReader("BusList.csv"));
        String[] nextLine;
        int columnIndexOfFrom = 0;
        int columnIndexOfTo = 1;
        int columnIndexOfTime = 5;
        int columnIndexOfBusName = 4;
        ArrayList<String> busInfoBusCode = new ArrayList<>();
        int size = busInfoBusCode.size();
        while ((nextLine = reader.readNext()) != null)
        {
            String contentTo = null;
            if ((nextLine[columnIndexOfFrom].matches(this.cFrom))
                    && (nextLine[columnIndexOfTo].matches(this.cTo))
                    && (nextLine[columnIndexOfTime].matches(this.time))
                    && (nextLine[columnIndexOfBusName].matches(this.busName)))
            {
                if (!busInfoBusCode.contains(nextLine[3]))
                {
                    busInfoBusCode.add(nextLine[3]);
                    //System.out.println("here");
                }
            }

        }
        size = busInfoBusCode.size();
        for (int i = 0; i < size; i++)
        {
            this.busCode = busInfoBusCode.get(i);
            //System.out.println("Fare: " + busInfoBusCode.get(i) + "\nConfirm[Y / N] ?");

        }

    }

}
