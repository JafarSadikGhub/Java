/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createfilefromanotherexternalmethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author JrBcrypted Md. Jafar Sadik ID: 1620660042
 */
public class AnotherMethodClass
{

    AnotherMethodClass()
    {

    }

    public void writeFile() throws IOException
    {
        try
        {
            File myFile = new File("amarfile.txt");
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
            myFileWriter.write("Created from program!\nNew Line.");
            myFileWriter.close();
            System.out.println("File size in bytes: " + myFile.length());
        } catch (IOException e)
        {
            System.out.println("Error");
        }
    }

}

class MainDr
{

    public static void main(String[] args) throws IOException
    {
        AnotherMethodClass am = new AnotherMethodClass();
        am.writeFile();
    }
}
