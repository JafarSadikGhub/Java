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
public class Static1 
{
        String id;
        String name;
        static String institute = "NSU";
        Static1(String id, String name)
        {
            this.id = id;
            this.name = name;
            //this.institute = institute;
        }
        @Override
        public String toString()
        {
            return "id: " + this.id + " name: " + this.name + " institute: " + institute;
        }
        public static void main(String[] args) {
        Static1 jafar = new Static1("162", "jafar");
        Static1 ash = new Static1("161", "ash");
        System.out.println(jafar);
        System.out.println(ash);
        
    }
        
        
}
