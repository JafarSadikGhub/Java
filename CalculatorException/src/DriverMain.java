
import java.util.Scanner;
public class DriverMain extends MethodClass
{
    public static double addition(double num1, double num2)
    {
        return num1+num2;
    }
    public static double subtraction(double num1, double num2)
    {
        return num1-num2;
    }
    public static double multiplication(double num1, double num2)
    {
        return num1*num2;
    }
    public static double division(double num1, double num2) throws DivideByZeroException
    {
        double result = 0;
        if(isDivideByZero(num2)==true)
        {
            throw new DivideByZeroException("Error! You cannot divide a number by zero!");
            
        }
        else
            result = num1 / num2;
        return result;
            
    }
    public static String message(char ch) throws InvalidInputException
    {
        if(isInvalidInput(ch) == false)
        {
            throw new InvalidInputException("Input Character is invalid");
        }
        else
            return "this line will never be printed";
        
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        char sign;
        System.out.println("Welcome to our custom mini calculator: ");
        while(true)
        {
            System.out.println("Press c to continue, x to exit: ");
            char p = input.next().charAt(0);
            if(p == 'c')
            {
               System.out.println("Enter a number:");
               num1 = input.nextDouble();
               System.out.println("Enter + for addition, - for subtraction, * for multiplication, / for division:");
               sign = input.next().charAt(0);
               System.out.println("Enter another number: ");
               num2 = input.nextDouble();
               if(sign == '+')
               {
                   System.out.println(addition(num1, num2));
               }
               else if(sign == '-')
               {
                   System.out.println(subtraction(num1, num2));
                
                
               }
               else if(sign == '*')
               {
                   System.out.println(multiplication(num1, num2));
                
               }
               else if(sign == '/')
               {
                   try
                   {
                       System.out.println(division(num1, num2));
                       
                   }
                   catch(Exception m)
                           {
                               System.out.println("\nException:" + m);
                           }
                
               }
               else
               {
                //somecode
                   try
                   {
                       System.out.println(message(sign));
                   }
                   catch (Exception m)
                           {
                               System.out.println("\nException: " + m);
                           }
               }   
            }
            
        }
    }
}
