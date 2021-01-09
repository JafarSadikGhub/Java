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
import javafx.scene.control.*;
import  javafx.scene.layout.*;
import javafx.stage.Stage;
import java.sql.*;

public class FindGrade extends Application
{
   private Statement stmt;
   private TextField tfSSN = new TextField();
   private TextField tfCourseId = new TextField();
   private Label lblStatus = new Label();
   
   @Override
   public void start(Stage primaryStage)
   {
       initializeDB();
       Button btShowGrade = new Button("Show Grade");
       HBox hBox = new HBox(5);
       hBox.getChildren().addAll(new Label("SSN"), tfSSN, new Label("Course ID"), tfCourseId, (btShowGrade));
       
       VBox  vBox = new VBox(10);
       vBox.getChildren().addAll(hBox, lblStatus);
       
       tfSSN.setPrefColumnCount(6);
       tfCourseId.setPrefColumnCount(6);
       btShowGrade.setOnAction(e -> showGrade());
       Scene scene = new Scene(vBox, 420, 80);
       primaryStage.setTitle("FindGrade");
       primaryStage.setScene(scene);
       primaryStage.show();
       
   }
   private void initializeDB()
   {
       try{
           
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Loaded");
           
           Connection connection = DriverManager.getConnection
                   ("jdbc:mysql://localhost:3306/testjavadb" , "root", "");
           System.out.println("Database Connceted");
           
           stmt = connection.createStatement();
       } catch(Exception ex)
       {
           ex.printStackTrace();
       }
   }
   private void showGrade()
   {
       String ssn = tfSSN.getText();
       String courseId = tfCourseId.getText();
       try{
           String queryString = "select firstName, mi, " + "lastName, title, grade from Student, Enrollment, Course " +
                   "where Student.ssn = '" + ssn + "' and Enrollment.courseId " + "= '" + courseId + "' and Enrollment.courseId = Course.courseId " +
                   " and Enrollment.ssn = Student.ssn";
                   
           ResultSet rset = stmt.executeQuery(queryString);
           
           if(rset.next())
           {
               String lastName = rset.getString(1);
               String mi = rset.getString(2);
               String firstName = rset.getString(3);
               String title = rset.getString(4);
               String grade = rset.getString(5);
               
               lblStatus.setText(firstName + " " + mi +
                                                " " + lastName + "'s grade on course " + title + " is " + grade);
           }
           else 
           {
                        lblStatus.setText("Not found");
           }
       
       } catch(SQLException ex)
       {
           ex.printStackTrace();
       }
   }
    public static void main(String[] args)
    {
        Application.launch(args);
    }

}