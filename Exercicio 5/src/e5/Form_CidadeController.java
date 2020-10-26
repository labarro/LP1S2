/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author info-aux01
 */
public class Form_CidadeController implements Initializable {

    @FXML
    private Button btn_Proximo;
    @FXML
    private Button btn_Salvar;
    @FXML
    private Button btn_Voltar;
    @FXML
    private TextField txt_Nome;
    @FXML
    private TextField txt_Estado;
    @FXML
    private TextField txt_Pais;
    @FXML
    private TextArea txtarea_Cidade;
    
    public int i;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void limpar(ActionEvent event) {
    
    txtarea_Cidade.setText(" ");
    
    }

    @FXML
    private void salvar(ActionEvent event) {
    
        
        if(i >= 1){ i++;}
        
        String nome;
        String estado;
        String pais;
                
        Set<String> cidades = new LinkedHashSet<String>();
        cidades.add(txt_Nome.getText()+" - "+txt_Estado.getText()+" - "+txt_Pais.getText());

        txtarea_Cidade.appendText(cidades.toString());
        txtarea_Cidade.appendText("\n");
        
    
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
