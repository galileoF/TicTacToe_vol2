package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;

import static groovyjarjarantlr.build.ANTLR.root;
import static org.apache.xmlbeans.impl.schema.StscState.start;

public class Controller {

    @FXML
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    private Model model = new Model();
    @FXML
    private void setPic(ActionEvent event) {
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btn1.setText(model.turn);
                model.changeTurn();
                btn1.setDisable(true);
                model.checkWin();
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btn2.setText(model.turn);
                model.changeTurn();
                btn2.setDisable(true);
                model.checkWin();
            }
        });

        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btn3.setText(model.turn);
                model.changeTurn();
                btn3.setDisable(true);
                model.checkWin();
            }
        });

        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btn4.setText(model.turn);
                model.changeTurn();
                btn4.setDisable(true);
                model.checkWin();
            }
        });

        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btn5.setText(model.turn);
                model.changeTurn();
                btn5.setDisable(true);
                model.checkWin();
            }
        });

        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btn6.setText(model.turn);
                model.changeTurn();
                btn6.setDisable(true);
                model.checkWin();
            }
        });

        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btn7.setText(model.turn);
                model.changeTurn();
                btn7.setDisable(true);
                model.checkWin();
            }
        });

        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btn8.setText(model.turn);
                model.changeTurn();
                btn8.setDisable(true);
                model.checkWin();
            }
        });

        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btn9.setText(model.turn);
                model.changeTurn();
                btn9.setDisable(true);
                model.checkWin();
            }
        });
    }


    @FXML
    private void closeGame(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    private void startGame(ActionEvent event) {

    }


}




