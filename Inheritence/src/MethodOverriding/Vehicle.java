/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MethodOverriding;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
class Vehicle
{
     void run()
     {
         System.out.println("Vehicle is running...");
     }
}
class Bike extends Vehicle
{
    @Override
    //Both protected and default is allowed here.
    //But the child class method cannot be more restrictive than the parents class
    //If the run() in vehicle class was protected and the run() in bike class was default, then we would stuck at a CT error.
    // because default is more restrictive than protected class
   protected void run()
    {
        System.out.println("Bike is running...");
    }
    public static void main(String[] args) {
        Bike ob = new Bike();
        ob.run();
    
    }
    
}
