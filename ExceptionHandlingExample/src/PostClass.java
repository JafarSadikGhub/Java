
import java.util.Scanner;

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
 public class PostClass extends ExceptionConditionImplementations
    {
        public static void validatePost(String text, int d, int m, String y) throws TextLengthLimitExceedsException, InvalidInputDateException
        {
            if(doesTextLengthLimitExceed(text)== true)
                throw new TextLengthLimitExceedsException("The text lenght cannot be greater than 220 characters.");
             else if(isValidDate(d, m, y) == false)
            {
                throw new InvalidInputDateException("Failed! Date Format is not valid!");
            }
            else
                System.out.println("Posted successfully!\n[Post Text]: " + text + "\nDate Posted: " + dateString);
        }
        public static void validatePost(String text, String file, int d, int m, String y) throws TextLengthLimitExceedsException, ScammingFileException,
                CorruptedFilesException, VirusFilesException, VirusFilesException, InvalidInputDateException
        {
            if(doesTextLengthLimitExceed(text)== true)
            {
                throw new TextLengthLimitExceedsException("The text lenght cannot be greater than 220 characters.");
            }
                
            else if(isScamFile(file)== true)
            {
                throw new ScammingFileException("Failed! The file seems to contain something that is scam!");
            }
            else if(isVirusFile(file) == true)
            {
                throw new VirusFilesException("Failed! The file seems to contain some virus.");
            }
            else if(isCorruptedFile(file) == true)
            {
                throw new CorruptedFilesException("Failed! The file seems to be corrupted or broken!");
            }
            else if(isValidDate(d, m, y) == false)
            {
                throw new InvalidInputDateException("Failed! Date Format is not valid!");
            }
            else
                System.out.println("Posted Successfully!\n[Post Text]: "+ text +"\nAttached File: " + file + "\nDate Posted: " + dateString);
            
              
        }
                
        
        
        public static void main(String[] args)
        {
             String inp, text, fileName, yyyy;
             int dd, mm;
             Scanner input = new Scanner(System.in);
             while(true)
             {
                 System.out.println("\n-----------------------------------\n"
                         + "Welcome to the System!\nPlease Press '1' only to Post the text with date."
                     + "\nPress '2' Post the text with attachment file and date.\nPress 'x' to exit this prompt!"
                         + "\n-----------------------------------\n");
                 inp = input.nextLine();
                 if("1".equals(inp))
                 {
                     System.out.println("\nEnter the Post Text: ");
                     text = input.nextLine();
                     //input.nextLine();
                     System.out.println("\nEnter the day of the Post date: ");
                     dd = input.nextInt();
                     System.out.println("\nEnter the month number: ");
                     mm = input.nextInt();
                     System.out.println("\nEnter the year(yyyy): ");
                     yyyy = input.next();
                     input.nextLine();
                     
                     try
                     {
                        validatePost(text, dd, mm, yyyy);    
                     }
                     catch(Exception e)
                     {
                         System.out.println("\nException Occured: " +e);
                     }
                     
                 }
                 else if("2".equals(inp))
                 {
                     System.out.println("\nEnter the Post Text: ");
                     text = input.nextLine();
                     System.out.println("\nEnter the day of the Post date: ");
                     dd = input.nextInt();
                     System.out.println("\nEnter the month number: ");
                     mm = input.nextInt();
                     System.out.println("\nEnter the year(yyyy): ");
                     yyyy = input.next();
                     System.out.println("\nEnter the filename you want to attach: ");
                     fileName = input.next();
                     
                     
                     try
                     {
                        validatePost(text, fileName, dd, mm, yyyy);    
                     }
                     catch(Exception e)
                     {
                         System.out.println("\nException Occured: " +e);
                     }
                 }
                 else if("x".equals(inp))
                 {
                    break;   
                 }
                 
             }
        }
                
    }
/* text1 (less than 220 characters): The Quick Brown Fox Jumps over the lazy dog */
/* text2 (greater than 220 characters): The Quick Brown Fox Jumps over the lazy dog
The Quick Brown Fox Jumps over the lazy dog The Quick Brown Fox Jumps over the lazy dog The Quick Brown Fox Jumps over the lazy dog 
The Quick Brown Fox Jumps over the lazy dog
The Quick Brown Fox Jumps over the lazy dog The Quick Brown Fox Jumps over the lazy dog The Quick Brown Fox Jumps over the lazy dog
The Quick Brown Fox Jumps over the lazy dog
The Quick Brown Fox Jumps over the lazy dog The Quick Brown Fox Jumps over the lazy dog The Quick Brown Fox Jumps over the lazy dog
The Quick Brown Fox Jumps over the lazy dog
The Quick Brown Fox Jumps over the lazy dog The Quick Brown Fox Jumps over the lazy dog The Quick Brown Fox Jumps over the lazy dog
*/
    
    
    





