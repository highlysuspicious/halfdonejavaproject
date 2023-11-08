package com.example.responsible_cr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;



public class HelloController {
    @FXML
    private Label welcomeText;
    public Stage stage = new Stage();
    public void student_login(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 1280, 760);
        stage.setTitle("Responsible");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public static void create_stage(FXMLLoader fxmlLoader) throws IOException
    {
        Scene scene1 = new Scene(fxmlLoader.load());
        Stage stage1=new Stage();
        stage1.setTitle("responcible");
        stage1.setScene(scene1);
        stage1.setResizable(false);
        stage1.show();
    }

}