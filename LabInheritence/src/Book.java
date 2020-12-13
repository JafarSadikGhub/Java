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
public class Book
{
   String ISBN;
   String title, author;
   double price;
   Book(String ISBN, String title, String author, double price)
   {
       this.ISBN = ISBN;
       this.title = title;
       this.author = author;
       this.price = price;
   }
   
}
class EBook extends Book
{
    String downloadURL, sizeMB;
    EBook(String ISBN, String title, String author, double price, String downloadURL, String sizeMB)
    {
        super(ISBN, title, author, price);
        this.downloadURL = downloadURL;
        this.sizeMB = sizeMB;
    }
    @Override
    public String toString()
    {
        return "ISBN: " + ISBN + " Title: " + title + " \nAuthor: " + author +
                " Price: " + price + " \nDownload URL: " + downloadURL +
                " Size (MB): " + sizeMB;
    }
}    
class PaperBook extends Book
{
    String shippingWeight;
    int inStock;
    PaperBook(String ISBN, String title, String author, double price, String shippingWeight, int inStock)
    {
        super(ISBN, title, author, price);
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
                
    }
    @Override
    public String toString()
    {
        return "ISBN: " + ISBN + " Title: " + title + " \nAuthor: " + author +
                " Price: " + price + " \nShipping Weight: " + shippingWeight +
                " In Stock: " + inStock;
    }
}
class Main
{
    public static void main(String[] args)
    {
        EBook e1 = new EBook("10SS500076", "The Godfather", "Forgot", 250, "www.godfather.com", "4.3");
        PaperBook p1 = new PaperBook("1000077SSD", "The outsider", "Stephan King", 250, "300 gram", 5);
        System.out.println("Ebook: \n" + e1);
        System.out.println("\nPaperBook: \n" + p1);
    }
}