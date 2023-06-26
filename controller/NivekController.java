package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import alert.AlertMaker;

public class NivekController implements Initializable {
    @FXML
    Label nname1, nname2, nname3, nname4, nname5, nprice1, nprice2, nprice3, nprice4, nprice5;

    @FXML
    ImageView nimg1, nimg2, nimg3, nimg4, nimg5;

    @FXML
    Button ncartbutton, ncartbutton1, ncartbutton2, ncartbutton3, ncartbutton4, ncartbutton5,
        nfavbutton, nfavbutton1, nfavbutton2, nfavbutton3, nfavbutton4, nfavbutton5,
        wednesdaysbutton,profileButton;

    @FXML
    Pane npane1, npane2, npane3, npane4, npane5, npane6;

    @FXML
    MenuItem Jeanne, Bianca, Liyah, Nivek, menmenuitem, womenmenuitem;

    @FXML
    private Stage stage;

    @FXML
    ImageView productImage;

    @FXML
    Label description;

    @FXML
    MenuBar homemenubar;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    @FXML
     FavoritesController favoritesController = null;

    static NKoreanTee nktee = new NKoreanTee();
    static NShades nshades = new NShades();
    static NTrousers ntrousers = new NTrousers();
    static NPoloShirt npshirt = new NPoloShirt();
    static NGraySweatShorts ngsshort = new NGraySweatShorts();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== Korean Tee ================== //
        nname1.setText(HomeController.nktee.getProductName());
        nprice1.setText(Double.toString(HomeController.nktee.getProductPrice()));
        Image nkteeImage = new Image(HomeController.nktee.getProductImage());
        nimg1.setImage(nkteeImage);
        nimg1.setOnMouseClicked(this::handleMouseClick);

        // ============== Shades ================== //
        nname2.setText(HomeController.nshades.getProductName());
        nprice2.setText(Double.toString(HomeController.nshades.getProductPrice()));
        Image nshadesImage = new Image(HomeController.nshades.getProductImage());
        nimg2.setImage(nshadesImage);
        nimg2.setOnMouseClicked(this::handleMouseClick);

        // ============== Trouser ================== //
        nname3.setText(HomeController.ntrousers.getProductName());
        nprice3.setText(Double.toString(HomeController.ntrousers.getProductPrice()));
        Image ntrousersImage = new Image(HomeController.ntrousers.getProductImage());
        nimg3.setImage(ntrousersImage);
        nimg3.setOnMouseClicked(this::handleMouseClick);

        // ============== Polo Shirt ================== //

        nname4.setText(HomeController.npshirt.getProductName());
        nprice4.setText(Double.toString(HomeController.npshirt.getProductPrice()));
        Image npshirtImage = new Image(HomeController.npshirt.getProductImage());
        nimg4.setImage(npshirtImage);
        nimg4.setOnMouseClicked(this::handleMouseClick);

        // ============== Gray Sweat Short ================== //
        nname5.setText(HomeController.ngsshort.getProductName());
        nprice5.setText(Double.toString(HomeController.ngsshort.getProductPrice()));
        Image ngsshortImage = new Image(HomeController.ngsshort.getProductImage());
        nimg5.setImage(ngsshortImage);
        nimg5.setOnMouseClicked(this::handleMouseClick);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(ncartbutton1)) {
            HomeController.nktee.setProductStatus(true);
            HomeController.nktee.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.npane1);

        } else if (sourceButton == ncartbutton2) {
            HomeController.nshades.setProductStatus(true);
            HomeController.nshades.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.npane2);

        } else if (sourceButton == ncartbutton3) {
            HomeController.ntrousers.setProductStatus(true);
            HomeController.ntrousers.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.npane3);

        } else if (sourceButton == ncartbutton4) {
            HomeController.npshirt.setProductStatus(true);
            HomeController.npshirt.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.npane4);

        } else if (sourceButton == ncartbutton5) {
            HomeController.ngsshort.setProductStatus(true);
            HomeController.ngsshort.setProductQuantity(1);
            HomeController.cart.addItem(HomeController.checkoutController.npane5);

        }

        HomeController.cart.showItems();

    }

    public void addtoFavorites(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("WEDNESDAYS!", "Item Added to Favorites");
        System.out.println("favorites");
        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(nfavbutton1)) {
            
            HomeController.favorites.addItem(HomeController.favoritesController.npane1);

        } 

        else if (sourceButton.equals(nfavbutton2)) {
            HomeController.favorites.addItem(HomeController.favoritesController.npane2);
            
        }
        else if (sourceButton.equals(nfavbutton3)) {
            HomeController.favorites.addItem(HomeController.favoritesController.npane3);
        
        }
        else if (sourceButton.equals(nfavbutton4)) {
            HomeController.favorites.addItem(HomeController.favoritesController.npane4);
            
        }
        else if (sourceButton.equals(nfavbutton5)) {
            HomeController.favorites.addItem(HomeController.favoritesController.npane5);
            
        }
       
    HomeController.favorites.showItems();
    }

    // Goes to Checkout.fxml
    public void gotoCart(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Cart1.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

     public void gotoHome(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/finalhomepage.fxml"));
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
        loader.setLocation(getClass().getResource("/view/JeanneCollection.fxml"));
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
        loader.setLocation(getClass().getResource("/view/women.fxml"));
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
            case "nimg1":
                desc = HomeController.nktee.getProductDescription();
                pname = HomeController.nktee.getProductName();
                pprice = HomeController.nktee.getProductPrice();
                break;
            case "nimg2":
                desc = HomeController.nshades.getProductDescription();   
                pname = HomeController.nshades.getProductName();
                pprice = HomeController.nshades.getProductPrice();
                break;
            case "nimg3":
                desc = HomeController.ntrousers.getProductDescription();      
                pname = HomeController.ntrousers.getProductName();
                pprice = HomeController.ntrousers.getProductPrice();     
                break;
            case "nimg4":
                desc = HomeController.npshirt.getProductDescription();    
                pname = HomeController.npshirt.getProductName();
                pprice = HomeController.npshirt.getProductPrice();           
                break;
            case "nimg5":
                desc = HomeController.ngsshort.getProductDescription();    
                pname = HomeController.ngsshort.getProductName();
                pprice = HomeController.ngsshort.getProductPrice();       
        }

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/productpreview.fxml"));
            Parent root = loader.load();

            ProductViewController itemDetailsController = loader.getController();
            List<Product> items = new ArrayList<>();
            items.add(HomeController.nktee);
            items.add(HomeController.nshades);
            items.add(HomeController.ntrousers);
            items.add(HomeController.npshirt);
            items.add(HomeController.ngsshort);

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
