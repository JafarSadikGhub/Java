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
abstract class GeometricObject
{

    public abstract double getArea();
}

class Rectangle extends GeometricObject
{

    double height;
    double weight;

    public Rectangle(double height, double weight)
    {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    @Override
    public double getArea()
    {
        return height * weight;
    }

}

class Circle extends GeometricObject
{

    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}

public class BoundedTypeDemo
{

    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(2, 4);
        Circle circle = new Circle(4);
        System.out.println("Same Area?\n"
                + equalArea(circle, rectangle));

    }

    public static <E extends GeometricObject> boolean equalArea(E obj1, E obj2)
    {
        return obj1.getArea() == obj2.getArea();
    }
}
