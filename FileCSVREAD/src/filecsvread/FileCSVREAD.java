/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecsvread;

import com.opencsv.CSVReader;
import java.io.FileReader;

/**
 *
 * @author JrBcrypted
 */
public class FileCSVREAD {
  public static void main(String[] args) {
    try {
      //csv file containing data
      String strFile = "BusList.csv";
      CSVReader reader = new CSVReader(new FileReader(strFile));
      String [] nextLine;
      int lineNumber = 0;
      while ((nextLine = reader.readNext()) != null) {
        lineNumber++;
        System.out.println("Line # " + lineNumber);

        // nextLine[] is an array of values from the line
        System.out.println(nextLine[4] + "etc...");
      }
    } catch(Exception e)
    {
        System.out.println("Le baba Exception");
  }
}
}