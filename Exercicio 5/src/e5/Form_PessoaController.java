/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
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
public class Form_PessoaController implements Initializable {

    @FXML
    private TextField txt_Nome;
    @FXML
    private TextField txt_Idade;
    @FXML
    private TextField txt_Profissao;
    @FXML
    private Button btn_Proximo;
    @FXML
    private Button btn_Salvar;
    @FXML
    private Button btn_Voltar;
    @FXML
    private TextArea txtarea_Pessoa;
    
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
    
    txtarea_Pessoa.setText(" ");
    
    }

    @FXML
    private void salvar(ActionEvent event) {
    
        if(i >= 1){ i++;}
        Map mapa = new HashMap();
        String nome = "nome";
        String idade = "idade";
        String profissao = "profissao";
        
        mapa.put(i, txt_Nome.getText()+ " - " + txt_Idade.getText()+ " - " + txt_Profissao.getText());
//        mapa.put(nome + i, txt_Nome.getText());
//        mapa.put(profissao + i, txt_Profissao.getText());
        txtarea_Pessoa.appendText((String) mapa.get(i) + "\n");
    
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
