
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JrBcrypted Md. Jafar Sadik ID: 1620660042
 */
public class DriverMain
{

    public static void main(String[] args) throws InvalidHeightOrWeightException, InvalidBloodGroupException, IOException
    {
        Address a1 = new Address("H12", "R15", "Mirpur");
        Person p1 = null;
        Person p2 = null;
        Person p3 = null;
        Person p4 = null;
        Person p5 = null;
        Person p6 = null;
        Person p7 = null;
        try
        {
            //Invalid data
            /*p3 = new Person("Moh", "Islam", "112222200",
                    "+8801760373337", "MALE", 22, a1, 5.7, 59.56, "A+");
             */
 /*
            p4 = new Person("Mohaiminul", "Islam", "112222200",
                    "+88017603337", "MALE", 22, a1, 5.7, 59.56, "X+");*/

 /*p5 = new Person("Mohaiminul", "Islam", "112222200",
                    "+8801760373337", "mALE", 22, a1, 5.7, 59.56, "X+");
             */
 /*p6 = new Person("Mohaiminul", "Islam", null,
                    "+8801760373337", "MALE", 22, a1, 5.7, 59.56, "X+");
             */
            //Valid data....
            p1 = new Person("Mohaiminul", "Islam", "112222200",
                    "+8801760373337", "MALE", 22, a1, 5.7, 59.56, "A+");
            p2 = new Person("Jafar", "Sadik", "2555555",
                    "+8801620373337", "MALE", 25, a1, 5.8, 57.56, "A+");

        } catch (Exception ex)
        {
            System.out.println("Exception Occured: " + ex);
        }

        // String path = "C:\\Users\\USER\\Desktop";
        String pathFile = "C:\\Users\\User\\Desktop\\amarfile.txt";
        saveToFile(p1, pathFile);
        saveToFile(p2, pathFile);
        readFile(pathFile);
    }

    public static void saveToFile(Person p, String pathFile) throws IOException
    {
        try
        {
            //File dir = new File(path);
            File myFile = new File(pathFile);
            myFile.createNewFile();
            FileWriter fw = new FileWriter(pathFile, true);
            fw.write(p.toString());
            fw.close();
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void readFile(String pathFile) throws FileNotFoundException, IOException
    {

        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(pathFile);
        } catch (FileNotFoundException e)
        {
            System.out.println("The source file does not exist. " + e);
        }
        LineNumberReader lineCounter = new LineNumberReader(new InputStreamReader(fis));
        String nextLine = null;

        int ignoredLines = 0;
        try
        {
            while ((nextLine = lineCounter.readLine()) != null)
            {
                System.out.println(nextLine);
                if ((nextLine.startsWith("=") && nextLine.endsWith("=")))
                {
                    //This line needs to be ignored
                    ignoredLines++;
                    //continue;
                }
            }
            int total = lineCounter.getLineNumber() - ignoredLines;
            System.out.println("Total number of line in this file " + total);
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
}
