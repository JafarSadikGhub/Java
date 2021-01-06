
class DivideByZeroException extends Exception
{
    DivideByZeroException(String s)
    {
        super(s);
    }
}
class InvalidInputException extends Exception
{
    InvalidInputException(String s)
    {
        super(s);
    }
}

class MethodClass
{
    public static boolean isDivideByZero(double num2)
    {
        boolean returnResult = false;
        if(num2 == 0)
        {
            returnResult = true;
        }
        else 
            returnResult = false;
        return returnResult;
            
    }
    public static boolean isInvalidInput(char charInput)
    {
        boolean returnResult1 = true;
        if(charInput!= '+' || charInput!= '-' || charInput!= '*' || charInput!= '/')
        {
            returnResult1 = false;
        }
        else 
            returnResult1 = true;
        return returnResult1;
    }
    
            
}

