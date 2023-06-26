package controller;

import model.*;
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
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import alert.AlertMaker;
import java.util.List;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class JeanneController implements Initializable {
    @FXML
    Label jname1, jname2, jname3, jname4, jname5, jname6, jprice1, jprice2, jprice3, jprice4, jprice5, jprice6;

    @FXML
    ImageView jimg1, jimg2, jimg3, jimg4, jimg5, jimg6;

    @FXML
    private Stage stage;

    @FXML
    ImageView productImage;

    @FXML
    Label description;

    @FXML
    MenuBar homemenubar;

    @FXML
    MenuItem Jeanne, Bianca, Liyah, Nivek, menmenuitem, womenmenuitem;

    @FXML
    Pane jpane1, jpane2, jpane3, jpane4, jpane5, jpane6;

    @FXML
    Button jcartbutton, jcartbutton1, jcartbutton2, jcartbutton3, jcartbutton4, jcartbutton5, jcartbutton6,
     jfavbutton, jfavbutton1, jfavbutton2, jfavbutton3, jfavbutton4, jfavbutton5, jfavbutton6, 
    wednesdaysbutton, profileButton;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    // @FXML
    // FavoritesController favoritesController = null;

    // static JPoloDress jpdress = new JPoloDress();
    static JBodySuit jbodysuit = new JBodySuit();
    static JSunnies jsunnies = new JSunnies();
    static JSlingBag jsbag = new JSlingBag();
    static JWhiteSkort jwskort = new JWhiteSkort();
    static JCoverUp jcup = new JCoverUp();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== Polo Dress ================== //
        jname1.setText(HomeController.jpdress.getProductName());
        jprice1.setText(Double.toString(HomeController.jpdress.getProductPrice()));
        // HomeController.jpdress.setProductImage("images/dressOP.png");
        Image jpdressImage = new Image(HomeController.jpdress.getProductImage());
        jimg1.setImage(jpdressImage);
        jimg1.setOnMouseClicked(this::handleMouseClick);

        // ============== Bodysuit ================== //
        jname2.setText(HomeController.jbodysuit.getProductName());
        jprice2.setText(Double.toString(HomeController.jbodysuit.getProductPrice()));
        // HomeController.jbodysuit.setProductImage("images/bodysuitOP.png");
        Image jbodysuitImage = new Image(HomeController.jbodysuit.getProductImage());
        jimg2.setImage(jbodysuitImage);
        jimg2.setOnMouseClicked(this::handleMouseClick);

        // ============== Sunnies ================== //

        jname3.setText(HomeController.jsunnies.getProductName());
        jprice3.setText(Double.toString(HomeController.jsunnies.getProductPrice()));
        // HomeController.jsunnies.setProductImage("images/sunniesOP.png");
        Image jsunniesImage = new Image(HomeController.jsunnies.getProductImage());
        jimg3.setImage(jsunniesImage);
        jimg3.setOnMouseClicked(this::handleMouseClick);

        // ============== Sling Bag ================== //

        jname4.setText(HomeController.jsbag.getProductName());
        jprice4.setText(Double.toString(HomeController.jsbag.getProductPrice()));
        // HomeController.jsbag.setProductImage("images/slingbagOP.png");
        Image jsbagImage = new Image(HomeController.jsbag.getProductImage());
        jimg4.setImage(jsbagImage);
        jimg4.setOnMouseClicked(this::handleMouseClick);

        // ============== White Skort ================== //

        jname5.setText(HomeController.jwskort.getProductName());
        jprice5.setText(Double.toString(HomeController.jwskort.getProductPrice()));
        // HomeController.jwskort.setProductImage("images/whiteskortOP.png");
        Image jwskortImage = new Image(HomeController.jwskort.getProductImage());
        jimg5.setImage(jwskortImage);
        jimg5.setOnMouseClicked(this::handleMouseClick);

        // ============== Cover Up ================== //;
        jname6.setText(HomeController.jcup.getProductName());
        jprice6.setText(Double.toString(HomeController.jcup.getProductPrice()));
        // HomeController.jcup.setProductImage("images/coverupOP.png");
        Image jcupImage = new Image(HomeController.jcup.getProductImage());
        jimg6.setImage(jcupImage);

        jimg6.setOnMouseClicked(this::handleMouseClick);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("WEDNESDAYS!", "Item Added");
        System.out.println("buy");
        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(jcartbutton1)) {
            System.out.println("jpdress1");
            HomeController.jpdress.setProductStatus(true);
            HomeController.jpdress.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.jpane1);

        } else if (sourceButton == jcartbutton2) {
            System.out.println("jbodysuit");
            HomeController.jbodysuit.setProductStatus(true);
            HomeController.jbodysuit.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.jpane2);

        } else if (sourceButton == jcartbutton3) {
            System.out.println("jsunnies");
            HomeController.jsunnies.setProductStatus(true);
            HomeController.jsunnies.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.jpane3);

        } else if (sourceButton == jcartbutton4) {
            System.out.println("jsbag");
            HomeController.jsbag.setProductStatus(true);
            HomeController.jsbag.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.jpane4);

        } else if (sourceButton == jcartbutton5) {
            System.out.println("jwskort");
            HomeController.jwskort.setProductStatus(true);
            HomeController.jwskort.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.jpane5);

        } else if (sourceButton == jcartbutton6) {
            System.out.println("jcup");
            HomeController.jcup.setProductStatus(true);
            HomeController.jcup.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.jpane6);

        }

        HomeController.cart.showItems();
        

    }
     public void addtoFavorites(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("WEDNESDAYS!", "Item Added to Favorites");
        System.out.println("favorites");
        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(jfavbutton1)) {
            HomeController.favorites.addItem(HomeController.favoritesController.jpane1);

        } 

        else if (sourceButton.equals(jfavbutton2)) {
            HomeController.favorites.addItem(HomeController.favoritesController.jpane2);

        } 

        else if (sourceButton.equals(jfavbutton3)) {
            HomeController.favorites.addItem(HomeController.favoritesController.jpane3);

        } 

        else if (sourceButton.equals(jfavbutton4)) {
            HomeController.favorites.addItem(HomeController.favoritesController.jpane4);

        } 
        else if (sourceButton.equals(jfavbutton5)) {
            HomeController.favorites.addItem(HomeController.favoritesController.jpane5);

        } 
        else if (sourceButton.equals(jfavbutton6)) {
            HomeController.favorites.addItem(HomeController.favoritesController.jpane6);

        } 

        HomeController.favorites.showItems();
    }

    // ====================================================================================================

    public void gotoHome(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/finalhomepage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void gotoCart(ActionEvent event) throws IOException {

        // If view shop button is pressed, go to home controller
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Cart1.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void gotoProfile(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Profile.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void gotoJeannes(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/JeaneCollection.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }

    public void gotoBias(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/BiaCollection.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }

    public void gotoLiyahs(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/LiyahCollection.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }

    public void gotoNiveks(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/NebsCollection.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }

    public void gotoMens(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/men.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }

    public void gotoWomens(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Women.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }
    public void gotoFavorites(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Favorites.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }
    

    public void handleMouseClick(MouseEvent event) {
        ImageView imageView = (ImageView) event.getSource();
        // imageView.setScaleX(1.2); // Increase X-axis scale
        // imageView.setScaleY(1.2); // Increase Y-axis scale
        String desc = "";
        String pname = "";
        double pprice = 0.0;
        
        switch (imageView.getId()) {
            case "jimg1":
                desc = HomeController.jpdress.getProductDescription();
                pname = HomeController.jpdress.getProductName();
                pprice = HomeController.jpdress.getProductPrice();               
                break;
            case "jimg2":
                desc = HomeController.jbodysuit.getProductDescription();
                pname = HomeController.jbodysuit.getProductName();
                pprice = HomeController.jbodysuit.getProductPrice();                   
                break;
            case "jimg3":
                desc = HomeController.jsunnies.getProductDescription();
                pname = HomeController.jsunnies.getProductName();
                pprice = HomeController.jsunnies.getProductPrice();    
                break;
            case "jimg4":
                desc = HomeController.jsbag.getProductDescription();
                pname = HomeController.jsbag.getProductName();
                pprice = HomeController.jsbag.getProductPrice();    
                break;
            case "jimg5":
                desc = HomeController.jwskort.getProductDescription();
                pname = HomeController.jwskort.getProductName();
                pprice = HomeController.jwskort.getProductPrice();    
                break;
            case "jimg6":
                desc = HomeController.jcup.getProductDescription();
                pname = HomeController.jcup.getProductName();
                pprice = HomeController.jcup.getProductPrice();  
            
        }

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/productpreview.fxml"));
            Parent root = loader.load();

            ProductViewController itemDetailsController = loader.getController();
            List<Product> items = new ArrayList<>();
            items.add(HomeController.jpdress);
            items.add(HomeController.jbodysuit);
            items.add(HomeController.jsunnies);
            items.add(HomeController.jsbag);
            items.add(HomeController.jwskort);
            items.add(HomeController.jcup);

            itemDetailsController.setItems(items);
            itemDetailsController.setProduct(imageView.getImage(), desc, pname, pprice);
            

            Stage productStage = new Stage();
            productStage.setScene(new Scene(root));
            productStage.show();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


}
