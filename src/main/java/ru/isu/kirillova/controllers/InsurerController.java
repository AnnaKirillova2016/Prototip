package ru.isu.kirillova.controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;


public class InsurerController {

    @FXML
    ListView actionChooser;

    @FXML
    private void initialize() {
        actionChooser.setItems(FXCollections.observableArrayList (
                "Совещание ", "Застроховать клиента","Сдать отчет"));
    }

}
