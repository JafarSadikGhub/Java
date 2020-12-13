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
public class Shape 
{
  private String name;
  Shape(String name)
  {
      this.name = name;
  }
  @Override
  public String toString()
  {
      return "Name: " + name;
  }
}
class Rectangle extends Shape
{
    private double side1;
    private double side2;
    Rectangle(String name, double side1, double side2)
    {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        
    }
    public double area()
    {
        return side1 * side2;
    }
    public double perimeter()
    {
        return 2 * (side1 + side2);
    }
    @Override
    public String toString()
    {
        return "Area: " + area() + "Perimeter: " + perimeter();
    }
}
class Square extends Rectangle
{
    
    Square(String name, double side1, double side2)
    {
        super(name, side1, side2);
    }
    public String toString()
    {
        return "Area: " + area() + "Perimeter: " + perimeter();
    }
    
    
}
class Main1
{
    public static void main(String[] args)
    {
        Rectangle s1 = new Rectangle("Rectangle", 12.5, 13.7);
        Square sq1 = new Square( "Square", 5, 5);
        System.out.println(s1);
        System.out.println(sq1);
        
    }
}