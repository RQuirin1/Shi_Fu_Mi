package fr.btsciel.shifumi;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public ComboBox userChoice;

    public ComboBox user2Choice;

    public CheckBox soloPlay;

    public CheckBox duoPlay;
    public TextField IAChoice;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        soloPlay.setSelected(false);
        duoPlay.setSelected(false);
        soloPlay.setOnAction(playSolo());
        duoPlay.setOnAction(playDuo());
    }

    private EventHandler<ActionEvent> playDuo() {
        if (soloPlay.isSelected()){
            duoPlay.setDisable(true);
        }else {
            duoPlay.setDisable(false);
        }
    }

    private EventHandler<ActionEvent> playSolo() {
        if(soloPlay.isSelected()){
            duoPlay.setSelected(true);
        }
    }


}