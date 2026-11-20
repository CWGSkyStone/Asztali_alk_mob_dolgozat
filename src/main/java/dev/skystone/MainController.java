/*
* File: MainController.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II-N
* Date: 2026-11-20
* Github: https://github.com/CWGSkyStone213/
* Licenc: MIT
*/


package dev.skystone;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController {

    @FXML
    private TableView<Crop> crop_table;

    @FXML
    private TableColumn<Crop, Boolean> forage_col;

    @FXML
    private TableColumn<Crop, Integer> id_col;

    @FXML
    private TableColumn<Crop, String> name_col;

    @FXML
    private TableColumn<Crop, Integer> quantity_col;

    @FXML
    private void initialize(){
        initCols();
        CropRepository crop_repo = new CropRepository();
        crop_table.getItems().addAll(crop_repo.findAll());
    }

    private void initCols(){
        id_col.setCellValueFactory(new PropertyValueFactory<>("id"));
        name_col.setCellValueFactory(new PropertyValueFactory<>("name"));
        forage_col.setCellValueFactory(new PropertyValueFactory<>("forage"));
        quantity_col.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }

    @FXML
    void onClickAboutButton(ActionEvent event) {
        showAbout();
    }

    private void showAbout(){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Névjegy");
        alert.setHeaderText("Crops GUI");
        alert.setContentText("Szerző: Szabó József\nVerzió: 1.0.0");
        alert.initOwner(App._stage);
        alert.showAndWait();
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        Platform.exit();
    }
}
