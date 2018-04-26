package ru.isu.kirillova.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class MainController {
    @FXML
    void openInsurerWindow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().
                getResource("views/insurer.fxml"));
        stage.setTitle("I'm  Insurer");
        stage.setScene(new Scene(root, 800, 400));
        stage.show();
    }


    @FXML
    void openInsurantWindow(ActionEvent event) throws IOException {
        Stage stag = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().
                getResource("views/insurant.fxml"));
        stag.setTitle("I'm  Insurant");
        stag.setScene(new Scene(root, 300, 275));
        stag.show();
    }


    @FXML
    void openOwnerWindow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().
                getResource("views/owner.fxml"));
        stage.setTitle("I'm  Owner");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }


    @FXML
    void openBeneficiaryWindow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().
                getResource("views/beneficiary.fxml"));
        stage.setTitle("I'm  Beneficiary");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }

    @FXML
    void openEmployeeWindow (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().
                getResource("views/employee.fxml"));
        stage.setTitle("I'm  Employee");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }

    @FXML
    void openAppraiserWindow (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().
                getResource("views/appraiser.fxml"));
        stage.setTitle("I'm  Appraiser");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }

}

