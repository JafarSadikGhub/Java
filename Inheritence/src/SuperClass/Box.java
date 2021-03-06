/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SuperClass;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class Box 
{
       double width;
       double height;
       double depth;
       
       Box(Box ob)
       {
           width = ob.width;
           height = ob.height;
           depth = ob.depth;
       }
       Box(double width, double height, double depth)
       {
           this.width = width;
           this.height = height;
           this.depth = depth;
       }
       Box()
       {
           width = -1;
           height = -1;
           depth = -1;
       }
       Box(double len)
       {
           width = height = depth = len;
       }
       double volume()
       {
           return width*height*depth;
       }
       
}
class BoxWeight extends Box
{
    double weight;
    BoxWeight(double w, double h, double d, double m)
    {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
    
}
class DemoBoxWeight
{
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        //Box mb = new Boxweight();
                
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " +vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
                
    }
}
