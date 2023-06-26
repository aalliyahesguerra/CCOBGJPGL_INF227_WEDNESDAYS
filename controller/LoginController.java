package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.Initializable;

public class LoginController implements Initializable {

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    ImageView ikea, cover;

    @FXML
    Button loginbutton, signupbutton;

    @FXML
    Label mywarninglabel;

    @FXML
    CheckoutController checkoutController = null;

    FXMLLoader loader = null;

   
    public void login(ActionEvent event) throws IOException {

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();



        if (mytextfield.getText().length() == 0) {
            mytextfield.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            new animatefx.animation.Shake(mytextfield).play();
        }
        if (mypasswordfield.getText().length() == 0) {
            mypasswordfield.setStyle("-fx-border-color:red ; -fx-border-width: 2px; ");
            new animatefx.animation.Shake(mypasswordfield).play();
        }

        if (username.equals("a") && password.equals("a")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/finalhomepage.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            loginbutton.getStyleClass().add("pulse");
             scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

             } 
            else if (!username.equals("a") || !password.equals("a")){
            new animatefx.animation.Shake(mytextfield).play(); 
            new animatefx.animation.Shake(mypasswordfield).play();
             
             // mywarninglabel.setVisible(true);
            }
        }
    

    public void signup(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/SignUp.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
}