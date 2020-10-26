/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5;

import java.io.IOException;
import java.net.URL;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.*;
import static java.util.Collections.list;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author info-aux01
 */
public class Form_CarroController implements Initializable {

    @FXML
    private TextField txt_Modelo;
    @FXML
    private Button btn_Proximo;
    @FXML
    private Button btn_Salvar;
    @FXML
    private TextField txt_Marca;
    @FXML
    private TextField txt_Cor;
    
    public int i = 1;
    @FXML
    private TextArea txtarea_carros;
    @FXML
    private Button btn_Voltar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         List<String> list=new ArrayList<String>();
         
    }    


    @FXML
    private void salvar(ActionEvent event) {
        
    List<String> list = new ArrayList<String>();
        
        if(i >= 1){ i++;}
        
        
        String modelo = txt_Modelo.getText();
        String marca = txt_Marca.getText();
        String cor = txt_Cor.getText();
                
        list.add(modelo +" - "+ marca +" - "+ cor);
       
        txtarea_carros.appendText(list.get(0));
        txtarea_carros.appendText("\n");        
    }

    @FXML
    private void limpar(ActionEvent event) {
        txtarea_carros.setText("");
    }

    @FXML
    private void voltar(ActionEvent event) throws IOException {
    
    Node node=(Node) event.getSource();
    Stage stage=(Stage) node.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));/* Exception */
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    
    }

    
}
