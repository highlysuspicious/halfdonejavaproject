package com.example.responsible_cr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.EventObject;
import java.util.Scanner;

public class changepass {

    login ob;
     public Stage stage;
     public Scene scene;
    @FXML
    private PasswordField passwordField;

    @FXML
    public Parent root;

    @FXML
    private PasswordField passwordField1;

    @FXML
    private TextField usernameField;

    @FXML
    private Label wrong;

    @FXML
    void change(ActionEvent event) throws IOException {

        String id = usernameField.getText();
        String pass = passwordField.getText();
        String cpass = passwordField1.getText();
        System.out.println(id + pass + cpass);

        if(pass.equals(cpass))
        {
        File infoFile2 = new File("D:/Responsible_CR/src/main/resources/com/example/responsible_cr/files/student/" + id + "/info.txt");
        if (infoFile2.exists()) {

            Scanner sc = new Scanner(infoFile2);
            sc.useDelimiter("\n");

            String n = sc.next();
            n = sc.next();


            System.out.println(n);
            writeTwoLines("D:/Responsible_CR/src/main/resources/com/example/responsible_cr/files/student/" + id + "/info.txt",id,pass);
            wrong.setText("password changed successfully");


        }

        else {wrong.setText("user doesnot exist");}}
        else {
            wrong.setText("password doesnt match");
        }

    }
    public static void writeTwoLines(String filePath, String firstString, String secondString) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(firstString + "\n");
            writer.write(secondString + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void GOTOLOGIN(ActionEvent event) throws IOException
    {root = FXMLLoader.load(HelloApplication.class.getResource("fxml/login.fxml"));
        switch_scene(root,event);}

    public void switch_scene(Parent root, EventObject event) throws IOException
    {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Responsible CR");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    }



