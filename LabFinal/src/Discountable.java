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
public interface Discountable 
{
   double discountedPrice(double price);
}
class PercentageDiscount implements Discountable
{
    private double percentage;
    PercentageDiscount(double percentage)
    {
        this.percentage = percentage;
    }
//    @Override
//    public double discountedPrice(double price)
//    {
//        
//    }
    public double getPercentage()
    {
        return this.percentage;
    }
    public void setPercentage(double percentage)
    {
        this.percentage = percentage;
    }
    @Override
    public double discountedPrice(double price)
    {
        double result = price * percentage;
        return result;
    }
}
 class ThresholdDiscount implements Discountable
{
    private double threshold, discount;
    ThresholdDiscount(double threshold, double discount)
    {
        this.threshold = threshold;
        this.discount = discount;
    }
   public double getThreshold()
    {
        return this.threshold;
    }
   public double getDiscount()
   {
       return this.discount;
   }
   public void setThreshold(double threshold)
   {
       this.threshold = threshold;
   }
   public void setDiscount(double discount)
   {
       this.discount = discount;
   }
   public double discountedPrice(double price)
   {
       double disc;
       if(price>=threshold)
       {
           disc = threshold * 0.5;
       }
       else 
           disc = this.discount;
       return disc;
   }
   
}
class MainClass
{
    public static void main(String[] args)
    {
        PercentageDiscount pd1 = new PercentageDiscount(0.5);
        System.out.println("Discount for PercentageDiscount class: " + pd1.discountedPrice(500));
        ThresholdDiscount td1 = new ThresholdDiscount(500, 0.5);
        System.out.println("Discount for Threshold class: " + td1.discountedPrice(501));
    }
}