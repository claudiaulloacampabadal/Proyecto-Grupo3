/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.DocumentException;
import domain.PDF;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Claudia
 */
public class FXMLPatientsReportsController implements Initializable {

    @FXML
    private Button generatePDF;
    @FXML
    private BorderPane bp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     public static void loadPage(URL ui, BorderPane bp){
        Parent root = null;
        try {
            root = FXMLLoader.load(ui); 
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainMenuController.class.getName());
        }
        //cleaning nodes
        //bp.setTop(null);
        bp.setCenter(null); 
        //bp.setBottom(null); 
        //bp.setLeft(null);
        //bp.setRight(null);
        bp.setCenter(root);
    }
     
     private void btnGeneratePDF(ActionEvent event) throws DocumentException, BadElementException, IOException {
         PDF pdf =  new PDF();
         
         PDF.generateReport("Reporte", "Reporte", toString());
         
    }
}
