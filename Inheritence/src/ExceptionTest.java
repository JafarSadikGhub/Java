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
public class ExceptionTest {
public static void main(String[] args) {
System.out.println(exceptionTest());
}
public static int exceptionTest()
{
int i=6;
try{
throw new NullPointerException();
}
catch(Exception e)
{
i=10;
return i;
}
finally
{
i=20;
System.out.println("In finally block");
}
}
}
