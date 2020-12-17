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
import javafx.application.Application;
import javafx.stage.Stage;
public class Test extends Application
{
   public Test()
   {
       System.out.println("Test constructor invoked.");
   }
   @Override
   public void start(Stage primaryStage)
   {
       System.out.println("Start method is invoked");
   }
    public static void main(String[] args)
    {
        System.out.println("Launch method is invoked");
        Application.launch(args);
    }
}
