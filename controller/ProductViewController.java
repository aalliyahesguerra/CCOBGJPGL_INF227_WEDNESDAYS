package controller;

import java.io.IOException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Product;


public class ProductViewController {

    
	
	@FXML
    private Button button1, cartbutton, profilebutton, favbutton;
    @FXML
    private ImageView productImage;

    @FXML
    private Label productDescription, productPrice, productName;
    
    @FXML
    Button nextbutton, previousbutton;

    @FXML
    RadioButton xsbutton, sbutton, mbutton, lbutton, xlbutton, xxlbutton;

    @FXML
    MenuBar homemenubar;

    @FXML
    Menu menuowners, categories;

    @FXML
    MenuItem Jeanne, Bianca, Nivek, Liyah, menmenuitem, womenmenuitem;


    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    public void initialize() {
        Image nextImage = new Image("/images/next.png");
        ImageView view = new ImageView(nextImage);
        view.setFitHeight(50);
        view.setPreserveRatio(true);
        nextbutton.setGraphic(view);

        Image previousImage = new Image("/images/back.png");
        ImageView view1 = new ImageView(previousImage);
        view1.setFitHeight(50);
        view1.setPreserveRatio(true);
        previousbutton.setGraphic(view1);
    }

    

    public void setProduct(Image image, String description, String name, double price){
        productImage.setImage(image);
        productDescription.setText(description);
        productName.setText(name);
        productPrice.setText(String.valueOf(price));
    }

    private List<Product> items;
    private int currentIndex;

    public void setItems(List<Product> items) {
        this.items = items;
        currentIndex = 0;
    }

    public void handlePrev() {
        if (currentIndex > 0) {
            currentIndex--;
            updateProduct();
        }
    }

    public void handleNext() {
        if (currentIndex < items.size() - 1) {
            currentIndex++;
            updateProduct();
        }
    }

    public void updateProduct() {
        Product currentItem = items.get(currentIndex);

        productImage.setImage(new Image(currentItem.getProductImage()));
        productDescription.setText(currentItem.getProductDescription());
        productName.setText(currentItem.getProductName());
        productPrice.setText(String.valueOf(currentItem.getProductPrice()));
        

    }
    
    public void getSize(ActionEvent event) {

        if (xsbutton.isSelected()) {

        } else if (sbutton.isSelected()) {

        } else if (mbutton.isSelected()) {

        }  else if (lbutton.isSelected()) {

        }  else if (xlbutton.isSelected()) {

        }  else if (xxlbutton.isSelected()) {

        }

    }
     
    // Goes to Checkout.fxml
    public void gotoCart(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Cart1.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
     public void gotoFavorites(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Favorites.fxml"));
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
        loader.setLocation(getClass().getResource("/view/Women.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();

    }

}