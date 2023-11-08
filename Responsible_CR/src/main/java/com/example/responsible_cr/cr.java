package com.example.responsible_cr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class cr {

    @FXML
    void add_notice(ActionEvent event) {

    }

    @FXML
    void add_routine(ActionEvent event) {

    }

    @FXML
    void add_vote(ActionEvent event) {

    }

    @FXML
    void edit_routine(ActionEvent event) {

    }

    @FXML
    void go_note(ActionEvent event) {

    }

    @FXML
    void go_notes(ActionEvent event) {

    }

    @FXML
    void go_notice(ActionEvent event) {

    }

    @FXML
    void go_routine(ActionEvent event) {

    }

    @FXML
    void go_vote(ActionEvent event) {

    }


    public void switch_scene(Parent root, EventObject event) throws IOException
    {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Responsible CR");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}