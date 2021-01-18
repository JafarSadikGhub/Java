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
public class Product
{

    public String name;
    public double price;

    Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double newPrice) throws InvalidPriceException
    {
        this.price = newPrice;
    }

    @Override
    public String toString()
    {
        return "Name: " + this.name + "\nPrice: "
                + this.price;

    }
}
