package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.awt.*;

/**
 * Created by ak on 06.08.16.
 */
public class Model {

    public String turn = "x";



    public void changeTurn(){
        if(turn == "x"){
            turn = "o";
        }
        else{
            turn = "x";
        }
    }
    @FXML
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    public void checkWin(){

        if((btn1.getText()).equals(btn2.getText()) && ((btn1.getText()).equals(btn3.getText())) ||
           (btn4.getText()).equals(btn5.getText()) && ((btn4.getText()).equals(btn6.getText())) ||
           (btn7.getText()).equals(btn8.getText()) && ((btn7.getText()).equals(btn9.getText())) ||
           (btn1.getText()).equals(btn4.getText()) && ((btn1.getText()).equals(btn7.getText())) ||
           (btn2.getText()).equals(btn5.getText()) && ((btn2.getText()).equals(btn8.getText())) ||
           (btn3.getText()).equals(btn6.getText()) && ((btn3.getText()).equals(btn9.getText())) ||
           (btn1.getText()).equals(btn5.getText()) && ((btn1.getText()).equals(btn9.getText())) ||
           (btn7.getText()).equals(btn5.getText()) && ((btn7.getText()).equals(btn3.getText()))){
            Alert info = new Alert(Alert.AlertType.INFORMATION);
            info.setContentText("Winner: " + turn);
            info.showAndWait();

        }



    }
}
