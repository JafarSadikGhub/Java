/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SeleniumDev;

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testing.annotations.Test;

public class CheckCopyrightText 
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C://Program Files//Java//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        //Accessing to the website...
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        
        //Enable Scrolling...
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 4500)");
        
        //Using relative xpath..
        //WebElement e = driver.findElement(By.xpath("//div[@class='sfc']"));
        WebElement e = driver.findElement(By.xpath("/html/body/div[7]/p"));
        String actualText = e.getText();
        System.out.println(actualText);
        String expectedText = "All rights reserved, Software Freedom Conservancy";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("");
        
        
    }
    
}
