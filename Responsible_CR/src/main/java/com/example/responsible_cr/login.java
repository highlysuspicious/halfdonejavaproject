package com.example.responsible_cr;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.EventObject;
import java.util.List;
import java.util.Scanner;

public class login {

    @FXML
    private TextField usernameField;
    @FXML
    public Label wrong;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button cancelButton;
    public Stage stage = new Stage();
    public Scene scene;
    public  Parent root;
    public Parent root2;


    public void initialize() {

    }
    public void student_login(ActionEvent event) throws IOException {

        String u = usernameField.getText();
        String p = passwordField.getText();
        System.out.println(u);
        System.out.println(p);

        File infoFile2 = new File("D:/Responsible_CR/src/main/resources/com/example/responsible_cr/files/student/"+u+"/info.txt");
        if (infoFile2.exists()) {

            Scanner sc = new Scanner(infoFile2);
            sc.useDelimiter("\n");

            String n = sc.next();
            n = sc.next();


            System.out.println(n);

            if (n.equals(p)) {

                root = FXMLLoader.load(HelloApplication.class.getResource("fxml/students.fxml"));
                switch_scene(root,event);
            }
            else {wrong.setText("sorry,wrong password,try again");}


        }
        else
        { wrong.setText("user does not exist");}
    }

    public void faculty_login(ActionEvent event) throws IOException {
        String u = usernameField.getText();
        String p = passwordField.getText();
        System.out.println(u);
        System.out.println(p);

        File infoFile2 = new File("D:/Responsible_CR/src/main/resources/com/example/responsible_cr/files/faculty/"+u+"/info.txt");
        if (infoFile2.exists()) {
            Scanner sc = new Scanner(infoFile2);
            sc.useDelimiter("\n");

            String n = sc.next();
            n = sc.next();


            System.out.println(n);

            if (n.equals(p)) {

                root = FXMLLoader.load(HelloApplication.class.getResource("fxml/faculty.fxml"));
                switch_scene(root,event);
            }

        }
    }

    public void cr_login(ActionEvent event) throws IOException {
        String u = usernameField.getText();
        String p = passwordField.getText();
        System.out.println(u);
        System.out.println(p);

        File infoFile2 = new File("D:/Responsible_CR/src/main/resources/com/example/responsible_cr/files/cr/"+u+"/info.txt");
        if (infoFile2.exists()) {
            Scanner sc = new Scanner(infoFile2);
            sc.useDelimiter("\n");

            String n = sc.next();
            n = sc.next();


            System.out.println(n);

            if (n.equals(p)) {

                root = FXMLLoader.load(HelloApplication.class.getResource("fxml/cr.fxml"));
                switch_scene(root,event);
            }

        }
    }




    public void switch_scene(Parent root, EventObject event) throws IOException
    {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Responsible CR");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    @FXML
      public void forgotpass(ActionEvent event) throws IOException
      {root = FXMLLoader.load(HelloApplication.class.getResource("fxml/forgotpass.fxml"));
      switch_scene(root,event);}
}
