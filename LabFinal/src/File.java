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
public class File 
{
    public static void main(String[] args)
    {
        try{
            BufferedReader kijaniki=new BufferedReader(new FileReader("amarfile.txt"));  
            System.out.println("Reading the file: ");
            String st = kijaniki.readLine();
            while(st != null)
            {
                System.out.println(st);
                st = kijaniki.readLine();
            }
        }
        catch(IOException e)
        {
            System.out.println("Ooops! Seems the file you are looking for, doesn't exist!");
        
    }
}
}