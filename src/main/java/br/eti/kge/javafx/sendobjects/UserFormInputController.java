package br.eti.kge.javafx.sendobjects;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kge
 */
public class UserFormInputController implements Initializable {

    @FXML
    TextField txtNome;
    
    @FXML
    TextField txtEmail;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    public void btnEnviarObjAction() throws IOException {
        
        // Prepara Objeto
        
        Usuario u = new Usuario(txtNome.getText(), txtEmail.getText());
        System.out.println(u.toString());
        
        // Prepara o stage
        FXMLLoader fxmlLoad = new FXMLLoader();
        fxmlLoad.setLocation(getClass().getResource("userFormCheck.fxml"));
        
        Parent mainParent = fxmlLoad.load();
        Scene mainScene = new Scene(mainParent);

        
        //Scene currentScene = txtNome.getScene();    // Pode ser qualquer objeto que faça parte da cena.
        
        // Desta maneira troca-se apenas a cena.
        // Stage stage = (Stage) currentScene.getWindow();
        // stage.setScene(mainScene);
        
        // Desta maneira adiciona um novo stage (palco)
        Stage stage = new Stage();
        
        
        //stage.setUserData(u);
        mainScene.setUserData(u);
        
        stage.setScene(mainScene);
        stage.setTitle("Form Check Usuario");
        stage.show();
        
    }
    
}
