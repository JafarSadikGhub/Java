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
import static java.lang.Math.sqrt;
import java.util.*;
public class Decagon 
{
   private float side;
   private RGB color;
   Decagon(float side, RGB color)
   {
       this.side = side;
       this.color = color;
   }
   public float getArea()
   {
       float area = (float) ((5/2)*(this.side * this.side)*sqrt(5 + 2 * sqrt(5)));
       return area;
   }
   public float getLengthOfSide()
   {
       return this.side;
   }
   public RGB getColor()
   {
       return this.color;
   }
   public void setColor(RGB color)
   {
       this.color = color;
   }
   public void setSide(float side)
   {
       this.side = side;
   }
   public int compareArea(Decagon anotherDecagon)
   {
       if (this.getArea() > anotherDecagon.getArea())
       {
           return 1;
       }
       else if(this.getArea()< anotherDecagon.getArea())
       {
           return -1;
       }
       else return 0;
   }
   @Override
   public String toString()
   {
       return "Length of side: <" + this.side  + "> units,\nColor: [" + this.color + "]";
   }
}
