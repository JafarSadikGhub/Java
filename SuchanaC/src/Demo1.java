
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JrBcrypted Md. Jafar Sadik ID: 1620660042
 */
public class Demo1
{
    //main method;

    public static void main(String[] args)
    {
        System.out.println("Hello, world");
        int a;
        double b;
        double c;
        Scanner rd = new Scanner(System.in);
        a = rd.nextInt();
        b = rd.nextDouble();
        c = a + b;
        //String str, str1;
        char ch;
        String str = rd.next(); // Suchana
        rd.nextLine();
        String str1 = rd.nextLine(); // Suchana Suchi
        ch = rd.next().charAt(0);
        String result = "Your Result: " + c;

        System.out.println(result);
        //System.out.println("Your result: " + c);

    }
}
