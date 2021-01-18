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
public class ClothingItem extends Product
{

    public String fabricType;

    ClothingItem(String name, double price, String fabricType)
    {
        super(name, price);
        this.fabricType = fabricType;
    }

    void changePrice(double percentage)
    {
        super.price = super.price + percentage;
    }

    @Override
    public String toString()
    {
        return super.toString() + " \nFabric Type: " + this.fabricType;
    }

}
