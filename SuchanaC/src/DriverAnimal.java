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
public class DriverAnimal
{

    public static void main(String[] args)
    {
        Animal a1 = new Animal();
        String st;
        st = "suchana";
        String ty = "mammal";

        //input
        a1.setSpecies("Homo Doggo");
        a1.setFood("Meat");
        a1.setType(ty);
        //Output
        System.out.println(a1.getSpecies());
        System.out.println(a1.getFood());
        System.out.println(a1.getType());

    }
}
