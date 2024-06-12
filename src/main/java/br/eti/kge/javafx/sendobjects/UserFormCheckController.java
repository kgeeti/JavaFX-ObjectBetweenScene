package br.eti.kge.javafx.sendobjects;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kge
 */
public class UserFormCheckController implements Initializable {

    
    @FXML
    Label labelNome;
    
    @FXML
    Label labelEmail;
    
    Scene currentStage;
            
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    
    
    public void onclick() {
        labelEmail.setText("Teste");
        
        currentStage = (Scene) labelNome.getScene();    // Pode ser qualquer objeto que faça parte da cena.
        
        Usuario userTest = (Usuario) currentStage.getUserData();
        System.out.println(userTest.toString());
    }
    
    
    
    
}
