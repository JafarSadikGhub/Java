

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
import java.util.ArrayList;
import java.util.Scanner;
class ScammingFileException extends Exception
{
    ScammingFileException(String s)
    {
        super(s);
    }
}
 class CorruptedFilesException extends Exception
{
   CorruptedFilesException(String s)
   {
       super(s);
   }
}
class VirusFilesException extends Exception
{
    VirusFilesException(String s)
    {
        super(s);
    }    
}
class TextLengthLimitExceedsException extends Exception
{
    TextLengthLimitExceedsException(String s)
    {
        super(s);
    }
}
class InvalidInputDateException extends Exception
{
    InvalidInputDateException(String s)
    {
        super(s);
    }
}
class ExceptionConditionImplementations
{
    private static String[] scamFiles = {"scamfile1.pdf", "scamfile2.dll", "scamfile3.cfx", "scamfile4.exe"};
    private static String[] corruptedFiles = {"borkenFile.mp4", "brokenFile.mp3", "corruptedFile.3gp"};
    private static String[] virusFiles = {"virus1.exe", "virus2.dll", "virus3.cmd"};
    static int dd, mm;
    static String yyyy;
    public static String dateString;
    
   
    public static boolean isScamFile(String scamCheck)
    {
      boolean ret = false;
        for (int i = 0; i < scamFiles.length; i++)
        {
            if (scamFiles[i] == null ? scamCheck == null : scamFiles[i].equals(scamCheck))
            {
                
               // break;
                ret = true;
                break;
            }
            
            
        }
        return ret;
    }
    public static boolean isCorruptedFile(String corruptedCheck)
    {
      boolean ret = false;
        for (int i = 0; i < corruptedFiles.length; i++)
        {
            if (corruptedFiles[i] == null ? corruptedCheck == null : corruptedFiles[i].equals(corruptedCheck))
            {
                ret = true;
                break;
                
            }
            
            
        }
        return ret;
    }
    public static boolean isVirusFile(String virusCheck)
    {
      boolean ret = false;
        for (int i = 0; i < virusFiles.length; i++)
        {
            if (virusFiles[i] == null ? virusCheck == null : virusFiles[i].equals(virusCheck))
            {
                ret = true;
                break;
                
            }
           
            
        }
        return ret;
    }
    public static boolean doesTextLengthLimitExceed(String text)
    {
        boolean ret;
        if(text.length()>220)
        {
            ret = true;
        }
        else
            ret = false;
        return ret;
    }
    public static boolean isValidDate(int dd, int mm, String yyyy)
    {
        boolean ret = false;
        //boolean dateValid = false;
        //boolean monthValid 
        if((dd>=1 && dd<=31) && (mm>=1 && mm<=12) && yyyy.length()==4)
        {
            dateString = dd + "-" + mm + "-" + yyyy;
            ret = true;
            
        }
        else
            ret = false;
        
        return ret;
    }
}
    
    