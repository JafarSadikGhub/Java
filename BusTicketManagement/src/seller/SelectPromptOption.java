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
    String cName, cContact, date, time;
    //String inputOption;
    String cFrom, cTo;

    public SelectPromptOption()
    {

    }
    //setter

    public void setCName(String cName)
    {
        this.cName = cName;
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

//        SelectPromptOption(int index)
//        {
//            SelectPromptOption.index = index;
//        }
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

}
