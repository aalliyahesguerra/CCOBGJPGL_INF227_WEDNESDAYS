package controller;


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
import javafx.stage.Stage;


public class ReceiptController implements Initializable {

    @FXML
    Button logoutbutton, rhomebutton;

 
    @FXML
    double mitem1amount, mitem2amount, mitem3amount, mitem4amount, mitem5amount, mitem6amount,
    witem1amount, witem2amount, witem3amount, witem4amount, witem5amount, witem6amount, 
    bitem1amount, bitem2amount, bitem3amount, bitem4amount, bitem5amount,
    jitem1amount, jitem2amount, jitem3amount, jitem4amount, jitem5amount, jitem6amount, 
    litem1amount, litem2amount, litem3amount, litem4amount, litem5amount,
    nitem1amount, nitem2amount, nitem3amount, nitem4amount, nitem5amount;
    
    @FXML
    Label mqty1, mqty2, mqty3, mqty4, mqty5, mqty6, mproduct1, mproduct2, mproduct3, mproduct4, mproduct5, mproduct6,
        mprice1, mprice2, mprice3, mprice4, mprice5, mprice6, mamount1, mamount2,mamount3, mamount4, mamount5, mamount6,
        
        wqty1, wqty2, wqty3, wqty4, wqty5, wqty6, wproduct1,wproduct2, wproduct3, wproduct4, wproduct5, wproduct6,
        wprice1, wprice2, wprice3, wprice4, wprice5, wprice6, wamount1, wamount2, wamount3, wamount4, wamount5, wamount6,
        
        bqty1, bqty2, bqty3, bqty4, bqty5, bproduct1, bproduct2, bproduct3, bproduct4, bproduct5, bproduct6,
        bprice1, bprice2, bprice3, bprice4, bprice5, bprice6, bamount1,bamount2, bamount3, bamount4, bamount5, 

        jqty1, jqty2, jqty3, jqty4, jqty5, jqty6, jproduct1, jproduct2, jproduct3, jproduct4, jproduct5, jproduct6,
        jprice1, jprice2, jprice3, jprice4, jprice5, jprice6, jamount1, jamount2, jamount3, jamount4, jamount5, jamount6,
        
        lqty1, lqty2, lqty3, lqty4, lqty5, lproduct1, lproduct2, lproduct3, lproduct4, lproduct5, 
        lprice1, lprice2, lprice3, lprice4, lprice5, lprice6, lamount1, lamount2, lamount3, lamount4, lamount5, lamount6,

        nqty1, nqty2, nqty3, nqty4, nqty5, nproduct1, nproduct2, nproduct3, nproduct4, nproduct5,
        nprice1, nprice2, nprice3, nprice4, nprice5, namount1, namount2, namount3, namount4, namount5,
    
        total;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ==== MEN COLLECTION ==== //
         if (HomeController.mclshirt.getProductStatus()) {
            mproduct1.setText(HomeController.mclshirt.getProductName());
            mqty1.setText(Double.toString(HomeController.mclshirt.getProductQuantity()));
            mprice1.setText(Double.toString(HomeController.mclshirt.getProductPrice()));
            mamount1.setText(Double
                    .toString(HomeController.mclshirt.getProductPrice() * HomeController.mclshirt.getProductQuantity()));

            mproduct1.setVisible(true);
            mqty1.setVisible(true);
            mprice1.setVisible(true);
            mamount1.setVisible(true);

            mitem1amount = HomeController.mclshirt.getProductPrice() * HomeController.mclshirt.getProductQuantity();

        }

        if (HomeController.mcvest.getProductStatus()) {
            mproduct2.setText(HomeController.mclshirt.getProductName());
            mqty2.setText(Double.toString(HomeController.mcvest.getProductQuantity()));
            mprice2.setText(Double.toString(HomeController.mcvest.getProductPrice()));
            mamount2.setText(Double
                    .toString(HomeController.mcvest.getProductPrice() * HomeController.mcvest.getProductQuantity()));

            mproduct2.setVisible(true);
            mqty2.setVisible(true);
            mprice2.setVisible(true);
            mamount2.setVisible(true);

            mitem2amount = HomeController.mcvest.getProductPrice() * HomeController.mcvest.getProductQuantity();


        }
     if (HomeController.mkcoverup.getProductStatus()) {
            mproduct3.setText(HomeController.mkcoverup.getProductName());
            mqty3.setText(Double.toString(HomeController.mkcoverup.getProductQuantity()));
            mprice3.setText(Double.toString(HomeController.mkcoverup.getProductPrice()));
            mamount3.setText(Double
                    .toString(HomeController.mkcoverup.getProductPrice() * HomeController.mkcoverup.getProductQuantity()));

            mproduct3.setVisible(true);
            mqty3.setVisible(true);
            mprice3.setVisible(true);
            mamount3.setVisible(true);

            mitem3amount = HomeController.mkcoverup.getProductPrice() * HomeController.mkcoverup.getProductQuantity();

    

        }
     if (HomeController.mdshorts.getProductStatus()) {
            mproduct4.setText(HomeController.mdshorts.getProductName());
            mqty4.setText(Double.toString(HomeController.mdshorts.getProductQuantity()));
            mprice4.setText(Double.toString(HomeController.mdshorts.getProductPrice()));
            mamount4.setText(Double
                    .toString(HomeController.mdshorts.getProductPrice() * HomeController.mdshorts.getProductQuantity()));

            mproduct4.setVisible(true);
            mqty4.setVisible(true);
            mprice4.setVisible(true);
            mamount4.setVisible(true);

            mitem1amount = HomeController.mdshorts.getProductPrice() * HomeController.mdshorts.getProductQuantity();
        }
     if (HomeController.mkjshorts.getProductStatus()) {
            mproduct5.setText(HomeController.mkjshorts.getProductName());
            mqty5.setText(Double.toString(HomeController.mkjshorts.getProductQuantity()));
            mprice5.setText(Double.toString(HomeController.mkjshorts.getProductPrice()));
            mamount5.setText(Double
                    .toString(HomeController.mkjshorts.getProductPrice() * HomeController.mkjshorts.getProductQuantity()));

            mproduct5.setVisible(true);
            mqty5.setVisible(true);
            mprice5.setVisible(true);
            mamount5.setVisible(true);

            mitem5amount = HomeController.mkjshorts.getProductPrice() * HomeController.mkjshorts.getProductQuantity();
    
        }
   if (HomeController.mcwshirt.getProductStatus()) {
            mproduct6.setText(HomeController.mcwshirt.getProductName());
            mqty6.setText(Double.toString(HomeController.mcwshirt.getProductQuantity()));
            mprice6.setText(Double.toString(HomeController.mcwshirt.getProductPrice()));
            mamount6.setText(Double
                    .toString(HomeController.mcwshirt.getProductPrice() * HomeController.mcwshirt.getProductQuantity()));

            mproduct6.setVisible(true);
            mqty6.setVisible(true);
            mprice6.setVisible(true);
            mamount6.setVisible(true);

            mitem6amount = HomeController.mcwshirt.getProductPrice() * HomeController.mcwshirt.getProductQuantity();
    
    
        }

        // ==== WOMEN COLLECTION ====//
     if (HomeController.wlshort.getProductStatus()) {
            wproduct1.setText(HomeController.wlshort.getProductName());
            wqty1.setText(Double.toString(HomeController.wlshort.getProductQuantity()));
            wprice1.setText(Double.toString(HomeController.wlshort.getProductPrice()));
            wamount1.setText(Double
                    .toString(HomeController.wlshort.getProductPrice() * HomeController.wlshort.getProductQuantity()));

            wproduct1.setVisible(true);
            wqty1.setVisible(true);
            wprice1.setVisible(true);
            wamount1.setVisible(true);

            witem1amount = HomeController.wlshort.getProductPrice() * HomeController.wlshort.getProductQuantity();
        }
    if (HomeController.waskort.getProductStatus()) {
            wproduct2.setText(HomeController.waskort.getProductName());
            wqty2.setText(Double.toString(HomeController.waskort.getProductQuantity()));
            wprice2.setText(Double.toString(HomeController.waskort.getProductPrice()));
            wamount2.setText(Double
                    .toString(HomeController.waskort.getProductPrice() * HomeController.waskort.getProductQuantity()));

            wproduct2.setVisible(true);
            wqty2.setVisible(true);
            wprice2.setVisible(true);
            wamount2.setVisible(true);

            witem2amount = HomeController.waskort.getProductPrice() * HomeController.waskort.getProductQuantity();
        }
   if (HomeController.wbjacket.getProductStatus()) {
            wproduct3.setText(HomeController.wbjacket.getProductName());
            wqty2.setText(Double.toString(HomeController.wbjacket.getProductQuantity()));
            wprice2.setText(Double.toString(HomeController.wbjacket.getProductPrice()));
            wamount3.setText(Double
                    .toString(HomeController.wbjacket.getProductPrice() * HomeController.wbjacket.getProductQuantity()));

            wproduct3.setVisible(true);
            wqty3.setVisible(true);
            wprice3.setVisible(true);
            wamount3.setVisible(true);

            witem3amount = HomeController.wbjacket.getProductPrice() * HomeController.wbjacket.getProductQuantity();
        }
    if (HomeController.wcblazer.getProductStatus()) {
            wproduct4.setText(HomeController.wcblazer.getProductName());
            wqty4.setText(Double.toString(HomeController.wcblazer.getProductQuantity()));
            wprice4.setText(Double.toString(HomeController.wcblazer.getProductPrice()));
            wamount4.setText(Double
                    .toString(HomeController.wcblazer.getProductPrice() * HomeController.wcblazer.getProductQuantity()));

            wproduct4.setVisible(true);
            wqty4.setVisible(true);
            wprice4.setVisible(true);
            wamount4.setVisible(true);

            witem4amount = HomeController.wcblazer.getProductPrice() * HomeController.wcblazer.getProductQuantity();
        }
      if (HomeController.wptrousers.getProductStatus()) {
            wproduct5.setText(HomeController.wptrousers.getProductName());
            wqty5.setText(Double.toString(HomeController.wptrousers.getProductQuantity()));
            wprice5.setText(Double.toString(HomeController.wptrousers.getProductPrice()));
            wamount5.setText(Double
                    .toString(HomeController.wptrousers.getProductPrice() * HomeController.wptrousers.getProductQuantity()));

            wproduct5.setVisible(true);
            wqty5.setVisible(true);
            wprice5.setVisible(true);
            wamount5.setVisible(true);

            witem4amount = HomeController.wptrousers.getProductPrice() * HomeController.wptrousers.getProductQuantity();
        }
    
        if (HomeController.wpdress.getProductStatus()) {
            wproduct6.setText(HomeController.wpdress.getProductName());
            wqty6.setText(Double.toString(HomeController.wpdress.getProductQuantity()));
            wprice6.setText(Double.toString(HomeController.wpdress.getProductPrice()));
            wamount6.setText(Double
                    .toString(HomeController.wpdress.getProductPrice() * HomeController.wpdress.getProductQuantity()));

            wproduct6.setVisible(true);
            wqty6.setVisible(true);
            wprice6.setVisible(true);
            wamount6.setVisible(true);

            witem6amount = HomeController.wpdress.getProductPrice() * HomeController.wpdress.getProductQuantity();
        }

        // === BIA'S COLLECTION === //
    if (HomeController.bbskort.getProductStatus()) {
            bproduct1.setText(HomeController.bbskort.getProductName());
            bqty1.setText(Double.toString(HomeController.bbskort.getProductQuantity()));
            bprice1.setText(Double.toString(HomeController.bbskort.getProductPrice()));
            bamount1.setText(Double
                    .toString(HomeController.bbskort.getProductPrice() * HomeController.bbskort.getProductQuantity()));

            bproduct1.setVisible(true);
            bqty1.setVisible(true);
            bprice1.setVisible(true);
            bamount1.setVisible(true);

            bitem1amount = HomeController.bbskort.getProductPrice() * HomeController.bbskort.getProductQuantity();
        } 
    if (HomeController.bcardigan.getProductStatus()) {
            bproduct2.setText(HomeController.bcardigan.getProductName());
            bqty2.setText(Double.toString(HomeController.bcardigan.getProductQuantity()));
            bprice2.setText(Double.toString(HomeController.bcardigan.getProductPrice()));
            bamount2.setText(Double
                    .toString(HomeController.bcardigan.getProductPrice() * HomeController.bcardigan.getProductQuantity()));

            bproduct2.setVisible(true);
            bqty2.setVisible(true);
            bprice2.setVisible(true);
            bamount2.setVisible(true);

            bitem2amount = HomeController.bcardigan.getProductPrice() * HomeController.bcardigan.getProductQuantity();
    
        }
    if (HomeController.bstop.getProductStatus()) {
            bproduct3.setText(HomeController.bstop.getProductName());
            bqty3.setText(Double.toString(HomeController.bstop.getProductQuantity()));
            bprice3.setText(Double.toString(HomeController.bstop.getProductPrice()));
            bamount3.setText(Double
                    .toString(HomeController.bstop.getProductPrice() * HomeController.bstop.getProductQuantity()));

            bproduct3.setVisible(true);
            bqty3.setVisible(true);
            bprice3.setVisible(true);
            bamount3.setVisible(true);

            bitem3amount = HomeController.bstop.getProductPrice() * HomeController.bstop.getProductQuantity();
    
        }
    if (HomeController.bwshort.getProductStatus()) {
            bproduct4.setText(HomeController.bwshort.getProductName());
            bqty4.setText(Double.toString(HomeController.bwshort.getProductQuantity()));
            bprice4.setText(Double.toString(HomeController.bwshort.getProductPrice()));
            bamount4.setText(Double
                    .toString(HomeController.bwshort.getProductPrice() * HomeController.bwshort.getProductQuantity()));

            bproduct4.setVisible(true);
            bqty4.setVisible(true);
            bprice4.setVisible(true);
            bamount4.setVisible(true);

            bitem4amount = HomeController.bwshort.getProductPrice() * HomeController.bwshort.getProductQuantity();
        }
    if (HomeController.bsunglasses.getProductStatus()) {
            bproduct5.setText(HomeController.bsunglasses.getProductName());
            bqty5.setText(Double.toString(HomeController.bsunglasses.getProductQuantity()));
            bprice5.setText(Double.toString(HomeController.bsunglasses.getProductPrice()));
            bamount5.setText(Double
                    .toString(HomeController.bsunglasses.getProductPrice() * HomeController.bsunglasses.getProductQuantity()));

            bproduct5.setVisible(true);
            bqty5.setVisible(true);
            bprice5.setVisible(true);
            bamount5.setVisible(true);

            bitem5amount = HomeController.bsunglasses.getProductPrice() * HomeController.bsunglasses.getProductQuantity();
}

// ========================= JEANNE'S COLLECTION ==================== //
    if (HomeController.jpdress.getProductStatus()) {
            jproduct1.setText(HomeController.jpdress.getProductName());
            jqty1.setText(Double.toString(HomeController.jpdress.getProductQuantity()));
            jprice1.setText(Double.toString(HomeController.jpdress.getProductPrice()));
            jamount1.setText(Double
                    .toString(HomeController.jpdress.getProductPrice() * HomeController.jpdress.getProductQuantity()));

            jproduct1.setVisible(true);
            jqty1.setVisible(true);
            jprice1.setVisible(true);
            jamount1.setVisible(true);

            jitem1amount = HomeController.jpdress.getProductPrice() * HomeController.jpdress.getProductQuantity();
        }

    if (HomeController.jbodysuit.getProductStatus()) {
            jproduct2.setText(HomeController.jbodysuit.getProductName());
            jqty2.setText(Double.toString(HomeController.jbodysuit.getProductQuantity()));
            jprice2.setText(Double.toString(HomeController.jbodysuit.getProductPrice()));
            jamount2.setText(Double
                    .toString(HomeController.jbodysuit.getProductPrice() * HomeController.jbodysuit.getProductQuantity()));

            jproduct2.setVisible(true);
            jqty2.setVisible(true);
            jprice2.setVisible(true);
            jamount2.setVisible(true);

            jitem2amount = HomeController.jbodysuit.getProductPrice() * HomeController.jbodysuit.getProductQuantity();
        }

     if (HomeController.jsunnies.getProductStatus()) {
            jproduct3.setText(HomeController.jsunnies.getProductName());
            jqty3.setText(Double.toString(HomeController.jsunnies.getProductQuantity()));
            jprice3.setText(Double.toString(HomeController.jsunnies.getProductPrice()));
            jamount3.setText(Double
                    .toString(HomeController.jsunnies.getProductPrice() * HomeController.jsunnies.getProductQuantity()));

            jproduct3.setVisible(true);
            jqty3.setVisible(true);
            jprice3.setVisible(true);
            jamount3.setVisible(true);

            jitem3amount = HomeController.jsunnies.getProductPrice() * HomeController.jsunnies.getProductQuantity();
    }
    if (HomeController.jsbag.getProductStatus()) {
            jproduct4.setText(HomeController.jsbag.getProductName());
            jqty4.setText(Double.toString(HomeController.jsbag.getProductQuantity()));
            jprice4.setText(Double.toString(HomeController.jsbag.getProductPrice()));
            jamount4.setText(Double
                    .toString(HomeController.jsbag.getProductPrice() * HomeController.jsbag.getProductQuantity()));

            jproduct4.setVisible(true);
            jqty4.setVisible(true);
            jprice4.setVisible(true);
            jamount4.setVisible(true);

            jitem4amount = HomeController.jsbag.getProductPrice() * HomeController.jsbag.getProductQuantity();
}
if (HomeController.jwskort.getProductStatus()) {
            jproduct5.setText(HomeController.jwskort.getProductName());
            jqty5.setText(Double.toString(HomeController.jwskort.getProductQuantity()));
            jprice5.setText(Double.toString(HomeController.jwskort.getProductPrice()));
            jamount5.setText(Double
                    .toString(HomeController.jwskort.getProductPrice() * HomeController.jwskort.getProductQuantity()));

            jproduct5.setVisible(true);
            jqty5.setVisible(true);
            jprice5.setVisible(true);
            jamount5.setVisible(true);

            jitem5amount = HomeController.jwskort.getProductPrice() * HomeController.jwskort.getProductQuantity();
}
    if (HomeController.jcup.getProductStatus()) {
            jproduct6.setText(HomeController.jcup.getProductName());
            jqty6.setText(Double.toString(HomeController.jcup.getProductQuantity()));
            jprice6.setText(Double.toString(HomeController.jcup.getProductPrice()));
            jamount6.setText(Double
                    .toString(HomeController.jcup.getProductPrice() * HomeController.jcup.getProductQuantity()));

            jproduct6.setVisible(true);
            jqty6.setVisible(true);
            jprice6.setVisible(true);
            jamount6.setVisible(true);

            jitem6amount = HomeController.jcup.getProductPrice() * HomeController.jcup.getProductQuantity();
    }
    //=================LIYAH'S COLLECTION======================//
    if (HomeController.lbpants.getProductStatus()) {
            lproduct1.setText(HomeController.lbpants.getProductName());
            lqty1.setText(Double.toString(HomeController.lbpants.getProductQuantity()));
            lprice1.setText(Double.toString(HomeController.lbpants.getProductPrice()));
            lamount1.setText(Double
                    .toString(HomeController.lbpants.getProductPrice() * HomeController.lbpants.getProductQuantity()));

            lproduct1.setVisible(true);
            lqty1.setVisible(true);
            lprice1.setVisible(true);
            lamount1.setVisible(true);

            litem1amount = HomeController.lbpants.getProductPrice() * HomeController.lbpants.getProductQuantity();
}
 if (HomeController.lpshorts.getProductStatus()) {
            lproduct2.setText(HomeController.lpshorts.getProductName());
            lqty2.setText(Double.toString(HomeController.lpshorts.getProductQuantity()));
            lprice2.setText(Double.toString(HomeController.lpshorts.getProductPrice()));
            lamount2.setText(Double
                    .toString(HomeController.lpshorts.getProductPrice() * HomeController.lpshorts.getProductQuantity()));

            lproduct2.setVisible(true);
            lqty2.setVisible(true);
            lprice2.setVisible(true);
            lamount2.setVisible(true);

            litem2amount = HomeController.lpshorts.getProductPrice() * HomeController.lpshorts.getProductQuantity();
}
if (HomeController.lljacket.getProductStatus()) {
            lproduct3.setText(HomeController.lljacket.getProductName());
            lqty3.setText(Double.toString(HomeController.lljacket.getProductQuantity()));
            lprice3.setText(Double.toString(HomeController.lljacket.getProductPrice()));
            lamount3.setText(Double
                    .toString(HomeController.lljacket.getProductPrice() * HomeController.lljacket.getProductQuantity()));

            lproduct3.setVisible(true);
            lqty3.setVisible(true);
            lprice3.setVisible(true);
            lamount3.setVisible(true);

            litem3amount = HomeController.lljacket.getProductPrice() * HomeController.lljacket.getProductQuantity();
    }
    if (HomeController.lljacket.getProductStatus()) {
            lproduct3.setText(HomeController.lljacket.getProductName());
            lqty3.setText(Double.toString(HomeController.lljacket.getProductQuantity()));
            lprice3.setText(Double.toString(HomeController.lljacket.getProductPrice()));
            lamount3.setText(Double
                    .toString(HomeController.lljacket.getProductPrice() * HomeController.lljacket.getProductQuantity()));

            lproduct3.setVisible(true);
            lqty3.setVisible(true);
            lprice3.setVisible(true);
            lamount3.setVisible(true);

            litem3amount = HomeController.lljacket.getProductPrice() * HomeController.lljacket.getProductQuantity();
}
    if (HomeController.lglasses.getProductStatus()) {
            lproduct4.setText(HomeController.lglasses.getProductName());
            lqty4.setText(Double.toString(HomeController.lglasses.getProductQuantity()));
            lprice4.setText(Double.toString(HomeController.lglasses.getProductPrice()));
            lamount4.setText(Double
                    .toString(HomeController.lglasses.getProductPrice() * HomeController.lglasses.getProductQuantity()));

            lproduct4.setVisible(true);
            lqty4.setVisible(true);
            lprice4.setVisible(true);
            lamount4.setVisible(true);

            litem4amount = HomeController.lglasses.getProductPrice() * HomeController.lglasses.getProductQuantity();
    }
    if (HomeController.lvest.getProductStatus()) {
            lproduct5.setText(HomeController.lvest.getProductName());
            lqty5.setText(Double.toString(HomeController.lvest.getProductQuantity()));
            lprice5.setText(Double.toString(HomeController.lvest.getProductPrice()));
            lamount5.setText(Double
                    .toString(HomeController.lvest.getProductPrice() * HomeController.lvest.getProductQuantity()));

            lproduct5.setVisible(true);
            lqty5.setVisible(true);
            lprice5.setVisible(true);
            lamount5.setVisible(true);

            litem5amount = HomeController.lvest.getProductPrice() * HomeController.lvest.getProductQuantity();
    }
    //====== NIVEK'S COLECTION=====//
    if (HomeController.nktee.getProductStatus()) {
            nproduct1.setText(HomeController.nktee.getProductName());
            nqty1.setText(Double.toString(HomeController.nktee.getProductQuantity()));
            nprice1.setText(Double.toString(HomeController.nktee.getProductPrice()));
            namount1.setText(Double
                    .toString(HomeController.nktee.getProductPrice() * HomeController.nktee.getProductQuantity()));

            nproduct1.setVisible(true);
            nqty1.setVisible(true);
            nprice1.setVisible(true);
            namount1.setVisible(true);

            nitem1amount = HomeController.nktee.getProductPrice() * HomeController.nktee.getProductQuantity();
    }
     if (HomeController.nshades.getProductStatus()) {
            nproduct2.setText(HomeController.nshades.getProductName());
            nqty2.setText(Double.toString(HomeController.nshades.getProductQuantity()));
            nprice2.setText(Double.toString(HomeController.nshades.getProductPrice()));
            namount2.setText(Double
                    .toString(HomeController.nshades.getProductPrice() * HomeController.nshades.getProductQuantity()));

            nproduct2.setVisible(true);
            nqty2.setVisible(true);
            nprice2.setVisible(true);
            namount2.setVisible(true);

            nitem2amount = HomeController.nshades.getProductPrice() * HomeController.nshades.getProductQuantity();
     }
     if (HomeController.ntrousers.getProductStatus()) {
            nproduct3.setText(HomeController.ntrousers.getProductName());
            nqty3.setText(Double.toString(HomeController.ntrousers.getProductQuantity()));
            nprice3.setText(Double.toString(HomeController.ntrousers.getProductPrice()));
            namount3.setText(Double
                    .toString(HomeController.ntrousers.getProductPrice() * HomeController.ntrousers.getProductQuantity()));

            nproduct3.setVisible(true);
            nqty3.setVisible(true);
            nprice3.setVisible(true);
            namount3.setVisible(true);

            nitem3amount = HomeController.ntrousers.getProductPrice() * HomeController.ntrousers.getProductQuantity();
    }
    if (HomeController.npshirt.getProductStatus()) {
            nproduct4.setText(HomeController.npshirt.getProductName());
            nqty4.setText(Double.toString(HomeController.npshirt.getProductQuantity()));
            nprice4.setText(Double.toString(HomeController.npshirt.getProductPrice()));
            namount4.setText(Double
                    .toString(HomeController.npshirt.getProductPrice() * HomeController.npshirt.getProductQuantity()));

            nproduct4.setVisible(true);
            nqty4.setVisible(true);
            nprice4.setVisible(true);
            namount4.setVisible(true);

            nitem4amount = HomeController.npshirt.getProductPrice() * HomeController.npshirt.getProductQuantity();
    }
    if (HomeController.ngsshort.getProductStatus()) {
            nproduct5.setText(HomeController.ngsshort.getProductName());
            nqty5.setText(Double.toString(HomeController.ngsshort.getProductQuantity()));
            nprice5.setText(Double.toString(HomeController.ngsshort.getProductPrice()));
            namount5.setText(Double
                    .toString(HomeController.ngsshort.getProductPrice() * HomeController.ngsshort.getProductQuantity()));

            nproduct5.setVisible(true);
            nqty5.setVisible(true);
            nprice5.setVisible(true);
            namount5.setVisible(true);

            nitem5amount = HomeController.ngsshort.getProductPrice() * HomeController.ngsshort.getProductQuantity();
}

 double final_amount= mitem1amount + mitem2amount + mitem3amount + mitem4amount + mitem5amount + mitem6amount +
    witem1amount + witem2amount + witem3amount + witem4amount + witem5amount + witem6amount +
    bitem1amount + bitem2amount + bitem3amount + bitem4amount + bitem5amount +
    jitem1amount + jitem2amount + jitem3amount + jitem4amount + jitem5amount + jitem6amount +
    litem1amount + litem2amount + litem3amount + litem4amount + litem5amount +
    nitem1amount + nitem2amount + nitem3amount + nitem4amount + nitem5amount;

     total.setText(Double.toString(final_amount));    
    }

     public void backtoHome(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/finalhomepage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

     public void logout(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}