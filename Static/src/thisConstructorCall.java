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
class B
{
    thisConstructorCall obj1;
    thisConstructorCall obj2;
    B(thisConstructorCall obj1)// thisConstructorCall obj2)
    {
        this.obj1 = obj1;
        //this.obj2 = obj2;
    }
    void display()
    {
        System.out.println(obj1.data + " " + obj1.data2);
    }
}

public class thisConstructorCall
{
     int data = 10;
     int data2 =20;
     thisConstructorCall()
     {
         B b = new B(this);
         b.display();
                 
         
     }
     public static void main(String[] args) {
        thisConstructorCall t = new thisConstructorCall();
    }
}

