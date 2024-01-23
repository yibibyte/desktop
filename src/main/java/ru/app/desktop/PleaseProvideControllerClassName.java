package ru.app.desktop; /**
 * Sample Skeleton for 'Untitled' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.AnchorPane;

public class PleaseProvideControllerClassName {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="anchor"
    private AnchorPane anchor; // Value injected by FXMLLoader

    @FXML // fx:id="buttonOne"
    private Button buttonOne; // Value injected by FXMLLoader

    @FXML // fx:id="buttonTHree"
    private Button buttonTHree; // Value injected by FXMLLoader

    @FXML // fx:id="buttonTwo"
    private Button buttonTwo; // Value injected by FXMLLoader

    @FXML // fx:id="menuBar"
    private MenuBar menuBar; // Value injected by FXMLLoader

    @FXML // fx:id="myLable"
    private Label myLable; // Value injected by FXMLLoader

    @FXML // fx:id="textField1"
    private TextField textField1; // Value injected by FXMLLoader

    @FXML // fx:id="textFiled2"
    private TextField textFiled2; // Value injected by FXMLLoader

    @FXML
    void fafafa(DragEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'Untitled'.";
        assert buttonOne != null : "fx:id=\"buttonOne\" was not injected: check your FXML file 'Untitled'.";
        assert buttonTHree != null : "fx:id=\"buttonTHree\" was not injected: check your FXML file 'Untitled'.";
        assert buttonTwo != null : "fx:id=\"buttonTwo\" was not injected: check your FXML file 'Untitled'.";
        assert menuBar != null : "fx:id=\"menuBar\" was not injected: check your FXML file 'Untitled'.";
        assert myLable != null : "fx:id=\"myLable\" was not injected: check your FXML file 'Untitled'.";
        assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'Untitled'.";
        assert textFiled2 != null : "fx:id=\"textFiled2\" was not injected: check your FXML file 'Untitled'.";

    }

}
