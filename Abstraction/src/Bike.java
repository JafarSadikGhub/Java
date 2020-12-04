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
abstract class Bike 
{
    abstract void run();
}
class Honda extends Bike
{
    @Override
    void run()
    {
        System.out.println("Running safely...");
    }
    public static void main(String[] args)
    {
        Bike obj = new Honda();
        obj.run();
    }
}
