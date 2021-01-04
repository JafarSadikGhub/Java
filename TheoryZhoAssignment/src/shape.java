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
abstract class shape{
    private float a;
    private float b;
    shape(float a,float b){
        this.a=a;
        this.b=b;
    }
    
    abstract float area();
    float getA(){
        return this.a;
    }

    float getB(){
        return this.b;
    }
    }
    
    
 class circle extends shape {
     
     //float c;
     circle(float a,float b){
         super(a,b);
        // this.c=c;
      
     }
    
    public float area(){
   float result=getA()*getB()*getB();
   return result;
    }
    @Override
    public String toString(){
        return "Area Of Circle="+area();
}
 }

     class Triangle extends shape{
         Triangle(float a,float b){
             super(a,b);
         }
        public float area(){
    
    float result=(float)(0.5*getB()*getA());
    return result;
}
        @Override
        public String toString(){
            return "Area Of Triangle="+area();
        }
    }
  public class Rectangle extends shape{
     Rectangle(float a,float b){
         super(a,b);
     }
     public float area(){
    float result=getA()*getB();
    return result;
}
     @Override
     public String toString(){
         return "Area Of Rectangle="+area();
     }
  }
 
  
 
    class Geometry {
    public static void main(String[] args) {
      Rectangle data=new Rectangle(10,12);
      circle data1 = new circle(Math.PI,11);
      
    }
    
}

