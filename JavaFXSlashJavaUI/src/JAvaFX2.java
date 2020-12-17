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
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.*;

public class JAvaFX2 extends Application 
{
    @Override
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new Button("OK"), 200, 250);
        primaryStage.setTitle("JavaFX2");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"), 100, 100));
        stage.show();
    }
     public static void main(String[] args)
    {
        Application.launch(args);
    }
}

