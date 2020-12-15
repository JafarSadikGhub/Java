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
public class Mid
{
   
    public static void main(String[] arg) {
        String str = "Rafsina;Osman-Riya";
        int index1 = str.indexOf(";") + 1;
        int index2 = str.indexOf("-");
        String mid = str.substring(index1, index2);
        System.out.println(mid);

}
}
