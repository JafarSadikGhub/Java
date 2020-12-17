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
import javafx.scene.layout.StackPane;
public class ButtonInPane extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Button btnOK = new Button("OK");
        StackPane pane = new StackPane();
        pane.getChildren().add(btnOK);
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        Application.launch(args);
    }
    
}
