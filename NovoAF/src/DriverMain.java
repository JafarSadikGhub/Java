
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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

    public static void main(String[] args)
    {
        //Person p1 = new Person();
        String path = "C:\\Users\\USER\\Desktop";
        String pathFile = "C:\\Users\\USER\\Desktop\\amarfile.txt";
    }

    public void saveToFile(Person p, String pathFile) throws IOException
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

    public void readFile(String pathFile) throws FileNotFoundException, IOException
    {
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader(pathFile));
            String content = br.readLine();
            int line = 0;
            int ignoredLines = 0;
            while (content != null)
            {

                if ((nextLine.startsWith("/*") && nextLine.endsWith("*/"))
                        || (nextLine.trim().matches("[};]+")))
                {
                    //This line needs to be ignored
                    ignoredLines++
                    ';
  continue;
                }
                System.out.println(content);
                line++;
                content = br.readLine();
            }
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
