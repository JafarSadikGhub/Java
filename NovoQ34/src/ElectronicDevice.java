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
public class ElectronicDevice extends Product
{

    public String model;
    public String warranty;

    ElectronicDevice(String name, double price, String model, String warranty)
    {
        super(name, price);
        this.model = model;
        this.warranty = warranty;
    }

    public void changePrice(double percentage)
    {
        super.price = super.price - percentage;
    }

    @Override
    public String toString()
    {
        return super.toString() + " \nModel: " + this.model + "\nWarranty: " + this.warranty;
    }
}
