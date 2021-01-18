
import java.io.File;
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
public class Quiz4
{

    public static void main(String[] args)
    {
        ClothingItem cLi = new ClothingItem("hoodie", 700, "100% Cotton");
        ElectronicDevice eDe = new ElectronicDevice("Smartphone", 70000,
                "OP7P", "2yrs");
        ClothingItem cLi1 = new ClothingItem("Jacket", 12000, "100% Lather");
        ElectronicDevice eDe1 = new ElectronicDevice("Smartphone", 122000,
                "IPhone12ProMax", "2yrs");
        String cliString = cLi.toString() + "\n" + cLi1.toString();
        String edeString = eDe.toString() + "\n" + eDe1.toString();
        System.out.println(cliString);
        try
        {
            File myFile1 = new File("clothingItems.txt");
            myFile1.createNewFile();
            FileWriter myFile1Writer = new FileWriter("clothingItems.txt");
            myFile1Writer.write(cliString);
            myFile1Writer.close();
            File myFile2 = new File("electronicdevices.txt");
            myFile2.createNewFile();
            FileWriter myFile2Writer = new FileWriter("electronicdevices.txt");
            myFile2Writer.write(edeString);
            myFile2Writer.close();
        } catch (IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
