package com.cse.oop.practice.complexnooperation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ComplexNoOperationSceneController {

    @FXML private Label OutputLabel;
    @FXML private TextField imgof1stcmplxNoTextField;
    @FXML private TextField imgof2stcmplxNoTextField;
    @FXML private TextField realof1stcmplxNoTextField;
    @FXML private TextField realof2ndcmplxNoTextField;


    ComplexNo c1,c2,c3;

    @FXML
    void AddCmplxNoButtonOnAction(ActionEvent event) {
        c1 = new ComplexNo(
                Integer.parseInt(realof1stcmplxNoTextField.getText()),
                Integer.parseInt(imgof2stcmplxNoTextField.getText())
        );
        c1 = new ComplexNo(
                Integer.parseInt(realof1stcmplxNoTextField.getText()),
                Integer.parseInt(realof2ndcmplxNoTextField.getText())
        );
        c3 = c1.add(c2);
        OutputLabel.setText(c3.toString());

    }

    @FXML
    void SubtractCmplxNoButtonOnMouseClick(MouseEvent event) {

        c1 = new ComplexNo(
                Integer.parseInt(realof1stcmplxNoTextField.getText()),
                Integer.parseInt(imgof1stcmplxNoTextField.getText())
        );
        c1 = new ComplexNo(
                Integer.parseInt(realof1stcmplxNoTextField.getText()),
                Integer.parseInt(imgof1stcmplxNoTextField.getText())
        );
        c3 = c1.sub(c2);
        OutputLabel.setText(c3.toString());
    }

}

