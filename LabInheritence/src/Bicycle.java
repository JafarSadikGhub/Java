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
public class Bicycle 
{
   private double weight;
   private double speed_per_gear;
   private double gear_no;
   Bicycle(double weight, double speed_per_gear, double gear_no)
   {
       this.weight = weight;
       this.speed_per_gear = speed_per_gear;
       this.gear_no = gear_no;
   }
   Bicycle()
   {
       this.weight = 2;
       this.speed_per_gear = 2;
       this.gear_no = 2;
   }
   double calculate()
   {
       return 0.4 * this.weight * this.speed_per_gear * this.gear_no;
       
   }
   void compare(Bicycle o)
   {
       if(this.calculate()>o.calculateMaxSpeed())
           
       {
           System.out.println("faster.");
       }
       else if(this.calculate()<o.calculateMaxSpeed())
       {
           System.out.println("slower.");
       }
       
   }
}
class Main
{
    public static void main(String[] args)
    {
        Bicycle bike1 = new Bicycle(12, 4, 7);
        Bicycle bike2 = new Bicycle();
       
        bike1.compare(bike2);
                
    }
}