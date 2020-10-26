/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author info-aux01
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button btn_List;
    @FXML
    private Button btn_Set;
    @FXML
    private Button btn_Pessoas;
    @FXML
    private Pane main_Pane;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void abrirList(ActionEvent event) throws IOException {
    Node node=(Node) event.getSource();
    Stage stage=(Stage) node.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("form_Carro.fxml"));/* Exception */
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }

    @FXML
    private void abrirSet(ActionEvent event) throws IOException {
    Node node=(Node) event.getSource();
    Stage stage=(Stage) node.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("form_Cidade.fxml"));/* Exception */
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    
    }

    @FXML
    private void abrirMap(ActionEvent event) throws IOException {
    Node node=(Node) event.getSource();
    Stage stage=(Stage) node.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("form_Pessoa.fxml"));/* Exception */
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
        
    }
        
    }
