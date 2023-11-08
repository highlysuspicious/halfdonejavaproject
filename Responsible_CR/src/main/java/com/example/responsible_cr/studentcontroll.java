package com.example.responsible_cr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;
import java.util.EventObject;

public class studentcontroll  {
    @FXML
    private Label done;
    @FXML
    private TextField code;

    @FXML
    private Label success;
    @FXML
    public Label noteLabel;
    @FXML
    public Label routineLabel;
    @FXML
    public Label noticeLabel;

    changepass cp=new changepass();

    public Stage stage;
    public Scene scene;
  public Parent root;
    @FXML
    public void  shownotes(ActionEvent event) throws IOException {
        root = FXMLLoader.load(HelloApplication.class.getResource("fxml/notes.fxml"));
        String content = readTextFile("D://Responsible_CR//src//main//resources//com//example//responsible_cr//files//notes.txt");
        System.out.println(content);
      // noteLabel=new Label(content);
      // noteLabel.setVisible(true);

//        System.out.println(noteLabel.getText());

        switch_scene(root,event);
    }
    @FXML
    public void  gotonotice(ActionEvent event) throws IOException {
        root = FXMLLoader.load(HelloApplication.class.getResource("fxml/notice.fxml"));
       // String content = readTextFile("D://Responsible_CR//src//main//resources//com//example//responsible_cr//files//notes.txt");
        //System.out.println(content);
        // noteLabel=new Label(content);
        // noteLabel.setVisible(true);

//        System.out.println(noteLabel.getText());

        switch_scene(root,event);
    }
    @FXML
    public void  gotosharenote(ActionEvent event) throws IOException {
        root = FXMLLoader.load(HelloApplication.class.getResource("fxml/sharenotes.fxml"));
        // String content = readTextFile("D://Responsible_CR//src//main//resources//com//example//responsible_cr//files//notes.txt");
        //System.out.println(content);
        // noteLabel=new Label(content);
        // noteLabel.setVisible(true);

//        System.out.println(noteLabel.getText());
        switch_scene(root,event);
    }
    @FXML
    public void  addnote(ActionEvent event) throws IOException {
        String p=code.getText();
        System.out.println(p);
        appendStringToFile("D://Responsible_CR//src//main//resources//com//example//responsible_cr//files//notes.txt",p);
        done.setText("Notes added succesfully");
    }
    @FXML
    public void  gotortn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(HelloApplication.class.getResource("fxml/showroutine.fxml"));
        // String content = readTextFile("D://Responsible_CR//src//main//resources//com//example//responsible_cr//files//notes.txt");
        //System.out.println(content);
        // noteLabel=new Label(content);
        // noteLabel.setVisible(true);

//        System.out.println(noteLabel.getText());
        switch_scene(root,event);
    }

    @FXML
    public void exitact(ActionEvent e) {
        System.exit(0); // Exit the program when the button is clicked
    }

    @FXML
    public void changepassword(ActionEvent event) throws IOException
    { root = FXMLLoader.load(HelloApplication.class.getResource("fxml/forgotpass.fxml"));
    switch_scene(root,event);}
    @FXML
    public void  showroutinef(ActionEvent event) throws IOException {   root = FXMLLoader.load(HelloApplication.class.getResource("fxml/notes.fxml"));
        String content = readTextFile("D://Responsible_CR//src//main//resources//com//example//responsible_cr//files//routine.txt");
        System.out.println(content);
        // noteLabel=new Label(content);
        // noteLabel.setVisible(true);
        routineLabel.setText(content);
//        System.out.println(noteLabel.getText());
        // switch_scene(root,event);
    }
    @FXML
    public void  shownotesf(ActionEvent event) throws IOException {   root = FXMLLoader.load(HelloApplication.class.getResource("fxml/notes.fxml"));
        String content = readTextFile("D://Responsible_CR//src//main//resources//com//example//responsible_cr//files//notes.txt");
        System.out.println(content);
        // noteLabel=new Label(content);
        // noteLabel.setVisible(true);
noteLabel.setText(content);
//        System.out.println(noteLabel.getText());
       // switch_scene(root,event);
    }@FXML
    public void  shownoticef(ActionEvent event) throws IOException {
        root = FXMLLoader.load(HelloApplication.class.getResource("fxml/notes.fxml"));
        String content = readTextFile("D://Responsible_CR//src//main//resources//com//example//responsible_cr//files//notice.txt");
        System.out.println(content);
        // noteLabel=new Label(content);
        // noteLabel.setVisible(true);
        noticeLabel.setText(content);
//        System.out.println(noteLabel.getText());
        // switch_scene(root,event);
    }
    @FXML
    public void  closing(ActionEvent event) throws IOException {   root = FXMLLoader.load(HelloApplication.class.getResource("fxml/students.fxml"));
       // String content = readTextFile("D://Responsible_CR//src//main//resources//com//example//responsible_cr//files//notes.txt");
       // System.out.println(content);
        // noteLabel=new Label(content);
        // noteLabel.setVisible(true);
       // noteLabel.setText(content);
//        System.out.println(noteLabel.getText());
         switch_scene(root,event);
    }
    @FXML
    public void  showroutine(ActionEvent event) throws IOException {   root = FXMLLoader.load(HelloApplication.class.getResource("fxml/routineshow.fxml"));
        String content = readTextFile("D://Responsible_CR//src//main//resources//com//example//responsible_cr//files//notes.txt");
        System.out.println(content);
        // noteLabel=new Label();
//        System.out.println(noteLabel.getText());
        switch_scene2(root,event,content);
    }
    public String readTextFile(String filename) throws IOException {
        System.out.println("hello");
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        reader.close();
        return content.toString();
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
    public void switch_scene2(Parent root, EventObject event,String content) throws IOException
    {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        scene = new Scene(root);

        stage.setTitle("Responsible CR");

        stage.setScene(scene);
        noteLabel.setText(content);
        stage.setResizable(false);
        stage.show();
    }

    public static void appendStringToFile(String filePath, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true)); // 'true' for appending
            writer.newLine(); // Move to a new line
            writer.write(content); // Write the string
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
