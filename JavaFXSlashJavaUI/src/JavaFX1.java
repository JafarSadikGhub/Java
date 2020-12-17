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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class JavaFX1 extends Application
{
   @Override
   public void start(Stage primaryStage)
   {
       Button btOK = new Button();
       btOK.setText("OK");
       Scene scene = new Scene(btOK, 200, 250);
       primaryStage.setTitle("JavaFX1");
       primaryStage.setScene(scene);
       primaryStage.show();
   }
    public static void main(String[] args)
    {
        Application.launch(args);
    }
   
}
