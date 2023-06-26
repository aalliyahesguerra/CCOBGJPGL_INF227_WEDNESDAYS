package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.beans.property.SetProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ProfileController {

    
    public static LinkedList<String> info = new LinkedList<>();

    Queue<String> fname = new LinkedList<>();
    Queue<String> lname = new LinkedList<>();
    Queue<String> email = new LinkedList<>();
    Queue<String> bday = new LinkedList<>();
    Queue<Integer> mnumber = new LinkedList<>();
    Queue<String> gender = new LinkedList<>();
    private int size;
    
    @FXML
    Label nameLabel, emailLabel, genderLabel,phonenumLabel, birthdateLabel;

    @FXML
    Menu profilemenu;

    @FXML
    MenuBar profilemenubar;

    @FXML
    MenuItem Home, Logout;

    @FXML
    Button wednesdaysbutton;

    @FXML
    HomeController homeController = null;

    Object[] row = new Object[6];  


    public void displayProfileName(String fullname) {
        nameLabel.setText(fullname);

    }
    public void displayEmail(String email) {
        emailLabel.setText(email);
    }
    public void displayGender(String gender){
        genderLabel.setText(gender);
    }
    public void displayPhoneNum(String phonenum){
        phonenumLabel.setText(phonenum);
    }
    public void displayBirthdate(LocalDate birthday){
        String formattedDate = birthday.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        birthdateLabel.setText(formattedDate);
    }

    // public void Edit(ActionEvent event){
    //     int selected = nameLabel.getUserData(fullname);

    // }

    public void gotoLogin(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Login.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) profilemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();

    }



    public void gotoHome (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/finalhomepage.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) profilemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
            
    }
    
}



