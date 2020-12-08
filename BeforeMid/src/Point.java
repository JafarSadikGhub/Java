
import static java.lang.Math.*;

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
public class Point 
{
   int x;
   int y;
   Point(int x, int y)
   {
       this.x = x;
       this.y = y;
   }
   Point()
   {
       this.x = 0;
       this.y = 0;
   }
   public int getX()
   {
       return this.x;
   }
   public int getY()
   {
       return this.y;
   }
   public void setX(int x)
   {
       this.x = x;
   }
   public void setY(int y)
   {
       this.y = y;
   }
   public String toString()
   {
       return "(X, y): "+"(" + x + "," + y + ")";
   }
   public double distance(Point point)
   {
       double dis_x = this.x - point.x;
       double dis_y = this.y - point.y;
       double dist = sqrt(dis_x*dis_x + dis_y*dis_y);
       return dist;
   }
   
}
class Line
{
   private Point start;
   private Point end;
   Line(Point start, Point end)
   {
       this.start = start;
       this.end = end;
   }
   Line(int x1, int y1, int x2, int y2)
   {
       
   }
   public Point getStart()
   {
       return this.start;
   }
   public Point getEnd()
   {
       return this.end;
   }
   public void setStart(Point start)
   {
       this.start = start;
   }
   public void setEnd(Point end)
   {
       this.end = end;
   }
   
   public double length()
   {
       
       return start.distance(end);
   }
   
}
class Driver
{
    public static void main(String[] args)
    {
        Point p1 = new Point(5, 7);
        Point p2 = new Point(22,27);
        Line l1 = new Line(p1, p2);
        double dist = l1.length();
        System.out.println("Distance: " + dist);
        
    }
}