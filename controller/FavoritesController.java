package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.util.ArrayList;
import javafx.scene.layout.Pane;

public class FavoritesController implements Initializable {

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    Pane    mpane1, mpane2, mpane3, mpane4, mpane5, mpane6,
            wpane1, wpane2, wpane3, wpane4, wpane5, wpane6,
            bpane1, bpane2, bpane3, bpane4, bpane5,
            jpane1, jpane2, jpane3, jpane4, jpane5, jpane6,
            lpane1, lpane2, lpane3, lpane4, lpane5,
            npane1, npane2, npane3, npane4, npane5;


    @FXML
    VBox myvbox;

    @FXML
    Label   mname1, mname2, mname3, mname4, mname5, mname6, mprice1, mprice2, mprice3, mprice4, mprice5, mprice6,
            wname1, wname2, wname3, wname4, wname5, wname6, wprice1, wprice2, wprice3, wprice4, wprice5, wprice6,
            jname1, jname2, jname3, jname4, jname5, jname6, jprice1, jprice2, jprice3, jprice4, jprice5, jprice6,
            bname1, bname2, bname3, bname4, bname5, bname6, bprice1, bprice2, bprice3, bprice4, bprice5, bprice6,
            lname1, lname2, lname3, lname4, lname5, lname6, lprice1, lprice2, lprice3, lprice4, lprice5, lprice6,
            nname1, nname2, nname3, nname4, nname5, nprice1, nprice2, nprice3, nprice4, nprice5,
            total;

    @FXML
    ImageView mimg1, mimg2, mimg3, mimg4, mimg5, mimg6, wimg1, wimg2, wimg3, wimg4, wimg5, wimg6,
            jimg1, jimg2, jimg3, jimg4, jimg5, jimg6, bimg1, bimg2, bimg3, bimg4, bimg5, bimg6,
            limg1, limg2, limg3, limg4, limg5, nimg1, nimg2, nimg3, nimg4, nimg5;

   @FXML
   Button ccartbutton, cprofileButton;
   
    @FXML
    MenuBar homemenubar;

    public void addItem(Pane pane) {
        
        myvbox.getChildren().add(pane);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // =========== MEN COLLECTION ===========//
        mname1.setText(HomeController.mclshirt.getProductName());
        mprice1.setText(Double.toString(HomeController.mclshirt.getProductPrice()));
        Image mclshirtImage = new Image(HomeController.mclshirt.getProductImage());
        mimg1.setImage(mclshirtImage);

        mname2.setText(HomeController.mcvest.getProductName());
        mprice2.setText(Double.toString(HomeController.mcvest.getProductPrice()));
        Image mcvestImage = new Image(HomeController.mcvest.getProductImage());
        mimg2.setImage(mcvestImage);

        mname3.setText(HomeController.mkcoverup.getProductName());
        mprice3.setText(Double.toString(HomeController.mkcoverup.getProductPrice()));
        Image mkcoverupImage = new Image(HomeController.mkcoverup.getProductImage());
        mimg3.setImage(mkcoverupImage);

        mname4.setText(HomeController.mdshorts.getProductName());
        mprice4.setText(Double.toString(HomeController.mdshorts.getProductPrice()));
        Image mdshortsImage = new Image(HomeController.mdshorts.getProductImage());
        mimg4.setImage(mdshortsImage);

        mname5.setText(HomeController.mkjshorts.getProductName());
        mprice5.setText(Double.toString(HomeController.mkjshorts.getProductPrice()));
        Image mkjshortsImage = new Image(HomeController.mkjshorts.getProductImage());
        mimg5.setImage(mkjshortsImage);

        mname6.setText(HomeController.mcwshirt.getProductName());
        mprice6.setText(Double.toString(HomeController.mcwshirt.getProductPrice()));
        Image mcwshirtImage = new Image(HomeController.mcwshirt.getProductImage());
        mimg6.setImage(mcwshirtImage);

        // =========== WOMEN COLLECTION ===========//

        wname1.setText(HomeController.wlshort.getProductName());
        wprice1.setText(Double.toString(HomeController.wlshort.getProductPrice()));
        Image wlshortImage = new Image(HomeController.wlshort.getProductImage());
        wimg1.setImage(wlshortImage);

        wname2.setText(HomeController.waskort.getProductName());
        wprice2.setText(Double.toString(HomeController.waskort.getProductPrice()));
        Image waskortImage = new Image(HomeController.waskort.getProductImage());
        wimg2.setImage(waskortImage);

        wname3.setText(HomeController.wbjacket.getProductName());
        wprice3.setText(Double.toString(HomeController.wbjacket.getProductPrice()));
        Image wbjacketImage = new Image(HomeController.wbjacket.getProductImage());
        wimg3.setImage(wbjacketImage);

        wname4.setText(HomeController.wcblazer.getProductName());
        wprice4.setText(Double.toString(HomeController.wcblazer.getProductPrice()));
        Image wcBlazerImage = new Image(HomeController.wcblazer.getProductImage());
        wimg4.setImage(wcBlazerImage);

        wname5.setText(HomeController.wptrousers.getProductName());
        wprice5.setText(Double.toString(HomeController.wptrousers.getProductPrice()));
        Image wpTrousersImage = new Image(HomeController.wptrousers.getProductImage());
        wimg5.setImage(wpTrousersImage);

        wname6.setText(HomeController.wpdress.getProductName());
        wprice6.setText(Double.toString(HomeController.wpdress.getProductPrice()));
        Image wDress = new Image(HomeController.wpdress.getProductImage());
        wimg6.setImage(wDress);

        // ========= JEANNE COLLECTION ==========//
        jname1.setText(HomeController.jpdress.getProductName());
        jprice1.setText(Double.toString(HomeController.jpdress.getProductPrice()));
        Image jpdressImage = new Image(HomeController.jpdress.getProductImage());
        jimg1.setImage(jpdressImage);

        jname2.setText(HomeController.jbodysuit.getProductName());
        jprice2.setText(Double.toString(HomeController.jbodysuit.getProductPrice()));
        Image jbodysuitImage = new Image(HomeController.jbodysuit.getProductImage());
        jimg2.setImage(jbodysuitImage);

        jname3.setText(HomeController.jsunnies.getProductName());
        jprice3.setText(Double.toString(HomeController.jsunnies.getProductPrice()));
        Image jsunniesImage = new Image(HomeController.jsunnies.getProductImage());
        jimg3.setImage(jsunniesImage);

        jname4.setText(HomeController.jsbag.getProductName());
        jprice4.setText(Double.toString(HomeController.jsbag.getProductPrice()));
        Image jsbagImage = new Image(HomeController.jsbag.getProductImage());
        jimg4.setImage(jsbagImage);

        jname5.setText(HomeController.jwskort.getProductName());
        jprice5.setText(Double.toString(HomeController.jwskort.getProductPrice()));
        Image jwskortImage = new Image(HomeController.jwskort.getProductImage());
        jimg5.setImage(jwskortImage);

        jname6.setText(HomeController.jcup.getProductName());
        jprice6.setText(Double.toString(HomeController.jcup.getProductPrice()));
        Image jcupImage = new Image(HomeController.jcup.getProductImage());
        jimg6.setImage(jcupImage);

        // ========= BIA COLLECTION ==========//
        bname1.setText(HomeController.bbskort.getProductName());
        bprice1.setText(Double.toString(HomeController.bbskort.getProductPrice()));
        Image bbskortImage = new Image(HomeController.bbskort.getProductImage());
        bimg1.setImage(bbskortImage);

        bname2.setText(HomeController.bcardigan.getProductName());
        bprice2.setText(Double.toString(HomeController.bcardigan.getProductPrice()));
        Image bcardiganImage = new Image(HomeController.bcardigan.getProductImage());
        bimg2.setImage(bcardiganImage);

        bname3.setText(HomeController.bstop.getProductName());
        bprice3.setText(Double.toString(HomeController.bstop.getProductPrice()));
        Image bstopImage = new Image(HomeController.bstop.getProductImage());
        bimg3.setImage(bstopImage);

        bname4.setText(HomeController.bsunglasses.getProductName());
        bprice4.setText(Double.toString(HomeController.bsunglasses.getProductPrice()));
        Image bsunglassesImage = new Image(HomeController.bsunglasses.getProductImage());
        bimg4.setImage(bsunglassesImage);

        bname5.setText(HomeController.bwshort.getProductName());
        bprice5.setText(Double.toString(HomeController.bwshort.getProductPrice()));
        Image bwshortImage = new Image(HomeController.bwshort.getProductImage());
        bimg5.setImage(bwshortImage);

        // ========= JUJUSTROLL HAHAHAHA ==========//
        lname1.setText(HomeController.lbpants.getProductName());
        lprice1.setText(Double.toString(HomeController.lbpants.getProductPrice()));
        Image lbPantstImage = new Image(HomeController.lbpants.getProductImage());
        limg1.setImage(lbPantstImage);

        lname2.setText(HomeController.lpshorts.getProductName());
        lprice2.setText(Double.toString(HomeController.lpshorts.getProductPrice()));
        Image lbShortsImage = new Image(HomeController.lpshorts.getProductImage());
        limg2.setImage(lbShortsImage);

        lname3.setText(HomeController.lljacket.getProductName());
        lprice3.setText(Double.toString(HomeController.lljacket.getProductPrice()));
        Image lJacketImage = new Image(HomeController.lljacket.getProductImage());
        limg3.setImage(lJacketImage);

        lname4.setText(HomeController.lglasses.getProductName());
        lprice4.setText(Double.toString(HomeController.lglasses.getProductPrice()));
        Image lGlassesImage = new Image(HomeController.lglasses.getProductImage());
        limg4.setImage(lGlassesImage);

        lname5.setText(HomeController.lvest.getProductName());
        lprice5.setText(Double.toString(HomeController.lvest.getProductPrice()));
        Image lVestImage = new Image(HomeController.lvest.getProductImage());
        limg5.setImage(lVestImage);

        // ======== NEBS COLLECTION =========//
        nname1.setText(HomeController.nktee.getProductName());
        nprice1.setText(Double.toString(HomeController.nktee.getProductPrice()));
        Image nkteeImage = new Image(HomeController.nktee.getProductImage());
        nimg1.setImage(nkteeImage);

        nname2.setText(HomeController.nshades.getProductName());
        nprice2.setText(Double.toString(HomeController.nshades.getProductPrice()));
        Image nshadesImage = new Image(HomeController.nshades.getProductImage());
        nimg2.setImage(nshadesImage);

        nname3.setText(HomeController.ntrousers.getProductName());
        nprice3.setText(Double.toString(HomeController.ntrousers.getProductPrice()));
        Image ntrousersImage = new Image(HomeController.ntrousers.getProductImage());
        nimg3.setImage(ntrousersImage);

        nname4.setText(HomeController.npshirt.getProductName());
        nprice4.setText(Double.toString(HomeController.npshirt.getProductPrice()));
        Image npshirtImage = new Image(HomeController.npshirt.getProductImage());
        nimg4.setImage(npshirtImage);

        nname5.setText(HomeController.ngsshort.getProductName());
        nprice5.setText(Double.toString(HomeController.ngsshort.getProductPrice()));
        Image ngsshortImage = new Image(HomeController.ngsshort.getProductImage());
        nimg5.setImage(ngsshortImage);

       
        clearItems();

        showItems(HomeController.favorites.getItemList());
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
        loader.setLocation(getClass().getResource("/view/Women.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage) homemenubar.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();
    }
    public void gotoFavorites(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Favorites.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void gotoCart(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Cart1.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            myvbox.getChildren().add(p);
        }
    }

    public void clearItems() {
        myvbox.getChildren().removeAll(myvbox.getChildren());
    }

}
