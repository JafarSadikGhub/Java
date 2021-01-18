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
public class Driver
{

    public static boolean isInvalidPrice(double price)
    {
        boolean ret = true;
        if (price > 0)
        {
            ret = false;
        } else
        {
            ret = true;
        }
        return ret;
    }

    public static void main(String[] args)
    {
        ClothingItem cLi = new ClothingItem("hoodie", 700, "100% Cotton");
        ElectronicDevice eDe = new ElectronicDevice("Smartphone", 70000,
                "OP7P", "2yrs");
        System.out.println("Old price of Electronic device" + eDe.getPrice());
        eDe.changePrice(45.0);
        System.out.println("New Price after discount: " + eDe.getPrice());
        System.out.println("Old price of cloth" + cLi.getPrice());
        cLi.changePrice(67.0);
        System.out.println("New Price after tax: " + cLi.getPrice());

    }

}
