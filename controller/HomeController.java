package controller;

import model.*;
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
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

public class HomeController implements Initializable {

    static MLinenLongSleeves mclshirt = new MLinenLongSleeves();
    static MCrochetTankTop mcvest = new MCrochetTankTop();
    static MKnittedCoverUp mkcoverup = new MKnittedCoverUp();
    static MDenimShorts mdshorts = new MDenimShorts();
    static MPinkSweatshorts mkjshorts = new MPinkSweatshorts();
    static MCutworkShirt mcwshirt = new MCutworkShirt();

    static BBlackSkort bbskort = new BBlackSkort();
    static BCardigan bcardigan = new BCardigan();
    static BSleevelessTop bstop = new BSleevelessTop();
    static BSunglasses bsunglasses = new BSunglasses();
    static BWhiteShort bwshort = new BWhiteShort();

    static LBaggyPants lbpants = new LBaggyPants();
    static LPinkShorts lpshorts = new LPinkShorts();
    static LLeatherJacket lljacket = new LLeatherJacket();
    static LGlasses lglasses = new LGlasses();
    static LVest lvest = new LVest();

    static JPoloDress jpdress = new JPoloDress();
    static JBodySuit jbodysuit = new JBodySuit();
    static JSunnies jsunnies = new JSunnies();
    static JSlingBag jsbag = new JSlingBag();
    static JWhiteSkort jwskort = new JWhiteSkort();
    static JCoverUp jcup = new JCoverUp();

    static WLinenShort wlshort = new WLinenShort();
    static WAssymetricSkort waskort = new WAssymetricSkort();
    static WBomberJacket wbjacket = new WBomberJacket();
    static WCroppedBlazer wcblazer = new WCroppedBlazer();
    static WPalazzoTrousers wptrousers = new WPalazzoTrousers();
    static WPrintedDress wpdress = new WPrintedDress();

    static NKoreanTee nktee = new NKoreanTee();
    static NShades nshades = new NShades();
    static NTrousers ntrousers = new NTrousers();
    static NPoloShirt npshirt = new NPoloShirt();
    static NGraySweatShorts ngsshort = new NGraySweatShorts();

    @FXML
    Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, hpprice1, hpprice2, hpprice3,
            hpprice4, hpprice5, hpprice6, hpprice7, hpprice8, hpprice9, hpprice10, hpprice11, hpprice12, hpprice13,
            hpprice14, hpprice15, hpprice16, hpprice17, hpprice18;

    @FXML
    ImageView hpimg1, hpimg2, hpimg3, hpimg4, hpimg5, hpimg6, hpimg7, hpimg8, hpimg9, hpimg10, hpimg11, hpimg12,
            hpimg13, hpimg14, hpimg15, hpimg16, hpimg17, hpimg18;

    @FXML
    ImageView cover;

    @FXML
    Button profilebutton, cartButton, favButton,
        biancaspicks, nivekspicks, liyahspicks, jeannespicks;
;

    @FXML
    MenuBar homemenubar;

    @FXML
    Menu menuowners, categories;

    @FXML
    MenuItem Jeanne, Bianca, Nivek, Liyah, menmenuitem, womenmenuitem;

    @FXML
    LoginController loginController = null;
    JeanneController jeanneController = null;

    @FXML
    static Parent homeRoot = null;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    @FXML
    static CheckoutController checkoutController = null;
    static FavoritesController favoritesController = null;

    static Cart cart = new Cart();
    static Favorites favorites = new Favorites();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // -------- Men's Collection--------//
        mclshirt.setProductName("Linen Long Sleeves");
        mclshirt.setProductPrice(1200.00);
        mclshirt.setProductImage("images/longsleeves4.png");
        mclshirt.setProductDescription
        ("Shirt in a cotton and linen blend. Button-up front.");

        mcvest.setProductName("Crochet Tank Top");
        mcvest.setProductPrice(1000.00);
        mcvest.setProductImage("images/tanktop4.png");
        mcvest.setProductDescription
        ("Sleveless knit vest made of an open-textured fabric. Round neck.");

        mkcoverup.setProductName("Knitted Cover Up");
        mkcoverup.setProductPrice(1300.00);
        mkcoverup.setProductImage("images/coverup3.png");
        mkcoverup.setProductDescription
        ("Made of a spun cotton blend. Front snap-button fastening, Ribbed trims");

        mdshorts.setProductName("Denim Shorts");
        mdshorts.setProductPrice(1400.00);
        mdshorts.setProductImage("images/whitemaong4.png");
        mdshorts.setProductDescription
        ("Faded bermuda shorts made of cotton. Five pockets. ");

        mkjshorts.setProductName("Pink Sweatshorts");
        mkjshorts.setProductPrice(1500.00);
        mkjshorts.setProductImage("images/sweatshorts2.png");
        mkjshorts.setProductDescription
        ("Made of spun cotton fabric. Fron pockets and rear patch pocket");

        mcwshirt.setProductName("Cutwork Shirt");
        mcwshirt.setProductPrice(1100.00);
        mcwshirt.setProductImage("images/eyelettop1.png");
        mcwshirt.setProductDescription
        ("Relaxed fit shirt made of a open textured fabric and with ripped effect");

        // -------- Bia's Collection--------//
        bbskort.setProductName("Black Skort");
        bbskort.setProductPrice(1000.00);
        bbskort.setProductImage("images/b.BlackShortsHome.png");
        bbskort.setProductDescription
        ("Featuring linen-blend material, wrap design, and garterized back for a fresh look");

        bcardigan.setProductName("Pink Cardigan");
        bcardigan.setProductPrice(599.00);
        bcardigan.setProductImage("images/b.CardiganHome.png");
        bbskort.setProductDescription
        ("Featuring a button-front closure, high rise, pleating, and slant front pockets");

        bstop.setProductName("Sleeveless Top");
        bstop.setProductPrice(499.00);
        bstop.setProductImage("images/b.TopHome.png");
        bbskort.setProductDescription
        ("A fleece fabric for a chic, featuring a V-neckline, sleeveless cut and cropped");

        bwshort.setProductName("White Short");
        bwshort.setProductPrice(399.00);
        bwshort.setProductImage("images/b.whiteshorts1.png");
        bbskort.setProductDescription
        ("High rise, pleating, and slant front pockets");

        bsunglasses.setProductName("Sunglasses");
        bsunglasses.setProductPrice(299.00);
        bsunglasses.setProductImage("images/b.SunniesHome.png");
        bbskort.setProductDescription
        ("A pair of cream sunglasses featuring a classic rectangular frame");

        // ============== Liyah's Collection ================== //

        lbpants.setProductName("Baggy Pants");
        lbpants.setProductPrice(499.00);
        lbpants.setProductImage("images/l.BaggyPantsHome.png");
        lbpants.setProductDescription
        ("Mid waist trousers with an elastic waistband. Front welt pockets.");

        lpshorts.setProductName("Pink Shorts");
        lpshorts.setProductPrice(499.00);
        lpshorts.setProductImage("images/l.shortsHome.png");
        lpshorts.setProductDescription
        ("Stylish A-line silhouette shorts with tucks for a neat style.");

        lljacket.setProductName("Leather Jacket");
        lljacket.setProductPrice(399.00);
        lljacket.setProductImage("images/l.JacketHome.png");
        lljacket.setProductDescription
        ("A faux leather jacket featuring a basic collar, button front, and dropped long sleeves.");

        lglasses.setProductName("Glasses");
        lglasses.setProductPrice(299.00);
        lglasses.setProductImage("images/l.SunniesHome.png");
        lglasses.setProductDescription
        ("A pair of metal sunglasses featuring thin oval frames, tinted lenses, and clear nose pads.");

        lvest.setProductName("Vest");
        lvest.setProductPrice(399.00);
        lvest.setProductImage("images/l.VestHome.png");
        lvest.setProductDescription
        ("A sweater knit vest with a v-neckline, sleevesless cut, and ribbed trim.");

        // ============== Jeanne's Collection ================== //

        jpdress.setProductName("Polo Dress");
        jpdress.setProductPrice(1499.00);
        jpdress.setProductImage("images/j.PoloDressHome.png");
        jpdress.setProductDescription
        ("Collared long sleeved dress made of cotton.");

        jbodysuit.setProductName("Bodysuit");
        jbodysuit.setProductPrice(800.00);
        jbodysuit.setProductImage("images/j.BodysuitHome.png");
        jbodysuit.setProductDescription
        ("A round neckline, sleeveless cut,& snap-button closures.");

        jsunnies.setProductName("Sunnies");
        jsunnies.setProductPrice(499.00);
        jsunnies.setProductImage("images/j.SunniesHome.png");
        jsunnies.setProductDescription
        ("Angular and ultramodern, sunnies is a staple for city tripping");

        jsbag.setProductName("Sling Bag");
        jsbag.setProductPrice(1700.00);
        jsbag.setProductImage("images/j.SlingBagHome.png");
        jsbag.setProductDescription
        ("Pink Crossbody bag. Adjustable strap with metal pieces on the ends.");


        jwskort.setProductName("White Skort");
        jwskort.setProductPrice(800.00);
        jwskort.setProductImage("images/j.WhiteSkortHome.png");
        jwskort.setProductDescription
        ("These shorts made to look like a skirt are beautiful and allow easy movement.");

        jcup.setProductName("Striped Cover Up");
        jcup.setProductPrice(1200.00);
        jcup.setProductImage("images/j.CoverUpHome.png");
        jcup.setProductDescription
        ("Collared shirt in a linen and cotton blend fabric. Button-up front with turn-up sleeves");

        // ============== Nebs Collection ================== //

        nktee.setProductName("Korean Tee");
        nktee.setProductPrice(1200.00);
        nktee.setProductImage("images/n.ShirtHome.png");
        nktee.setProductDescription
        ("Oversize T-shirt with a round neckline and sleeves falling below the elbow.");

        nshades.setProductName("Shades");
        nshades.setProductPrice(500.00);
        nshades.setProductImage("images/n.SunniesHome.png");
        nshades.setProductDescription
        ("A yellow tinted shades for everyday wear, can be worn indoors and outdoors. ");

        ntrousers.setProductName("Black Pants");
        ntrousers.setProductPrice(1500.00);
        ntrousers.setProductImage("images/n.PantsHome.png");
        ntrousers.setProductDescription
        ("Slim fit trousers featuring an adjustable elastic waistband with inner drawstrings");

        npshirt.setProductName(" Polo Shirt");
        npshirt.setProductPrice(1800.00);
        npshirt.setProductImage("images/n.TopHome.png");
        npshirt.setProductDescription
        ("Collared polo shirt made of cotton with a mercerised finish.");

        ngsshort.setProductName("Gray Sweatshort");
        ngsshort.setProductPrice(900.00);
        ngsshort.setProductImage("images/n.ShortHome.png");
        ngsshort.setProductDescription
        ("Bermuda shorts featuring an adjustable drawstring waist, front pockets and back patch pocket detail.");

        // ============== Women's Collection ================== //

        wlshort.setProductName("Linen Short");
        wlshort.setProductPrice(800.00);
        wlshort.setProductImage("images/linenshort1.png");
        wlshort.setProductDescription
        ("High-waist Bermuda shorts made in a linen blend fabric. Front darts. ");

        waskort.setProductName("Pink Skort");
        waskort.setProductPrice(750.00);
        waskort.setProductImage("images/skort1.png");
        waskort.setProductDescription
        ("High-waist Bermuda shorts made in a linen blend fabric. Front darts. ");

        

        wbjacket.setProductName("Bomber Jacket");
        wbjacket.setProductPrice(2000.00);
        wbjacket.setProductImage("images/bomberjacket2.png");
        wbjacket.setProductDescription
        ("Round neck bomber jacket with long sleeves and padded shoulders. Front welt pockets. ");


        wcblazer.setProductName("Blazer");
        wcblazer.setProductPrice(1800.00);
        wcblazer.setProductImage("images/blazer2.png");
        wcblazer.setProductDescription
        ("Cropped blazer with a lapel collar and long sleeves with shoulder pads. False chest welt pocket.");

        wptrousers.setProductName("White Pants");
        wptrousers.setProductPrice(999.00);
        wptrousers.setProductImage("images/whitepants1.png");
        wptrousers.setProductDescription
        ("High-waist trousers featuring an adjustable elastic waistband with drawstrings. Side pockets.");

        wpdress.setProductName("White Pants");
        wpdress.setProductPrice(999.00);
        wpdress.setProductImage("images/dress3.png");
        wpdress.setProductDescription
        ("Dress made of a linen blend. Straight neckline and thin adjustable straps. ");

        FXMLLoader loader = null;

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Cart1.fxml"));

            loader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();

        try {
            loader = new FXMLLoader(getClass().getResource("/view/favorites.fxml"));

            loader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Clears all items in Checkout.fxml
        favoritesController = loader.getController();
    }
    

    
    public void gotoHome(ActionEvent event) throws IOException {

        // If view shop button is pressed, go to home controller
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/finalhomepage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    // Goes to Checkout.fxml
    public void gotoCart(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Cart1.fxml"));
        Parent root = loader.load();
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/favorites.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void gotoBia(ActionEvent event) throws IOException {
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/BiaCollection.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void gotoLiyah(ActionEvent event) throws IOException {
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/LiyahCollection.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
     public void gotoNivek(ActionEvent event) throws IOException {
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/NebsCollection.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
     public void gotoJeanne(ActionEvent event) throws IOException {
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/JeanneCollection.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}

}
