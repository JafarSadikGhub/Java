/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileRead 
{
    public static void main(String[] args)
    {
        BufferedReader br = null;
        BufferedReader br2 = null;
        
        try
        {
            //Creating a buffering character input stream
            //that uses a default sized input buffer
            //Creating a new File Reader
            //Given the name of the file to read from
            
            br = new BufferedReader(new FileReader("amarfile.txt"));
            //Reading the file using readLine() method
            System.out.println("Reading the file using readline() method");
            String content = br.readLine();
            while(content != null)
            {
                System.out.println(content);
                content = br.readLine();
            }
            br2 = new BufferedReader(new FileReader("amarfile.txt"));
            int number = 0;
            char ch;
            while((number = br2.read()) !=-1)
            {
                ch = (char)number;
                System.out.print(ch);
            }
            
            
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
    }
  
}
