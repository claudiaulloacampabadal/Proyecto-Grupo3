/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Maria Celeste
 */
public class FXMLMainMenuController implements Initializable {

    @FXML
    private Button btnPatients;
    @FXML
    private Button btnDoctorsAndSpecial;
    @FXML
    private Button btnDisease;
    @FXML
    private Button btnAppointment;
    @FXML
    private Button btnMedicalAttention;
    @FXML
    private Button btnPayment;
    @FXML
    private Button btnReports;
    @FXML
    private Button btnExit;
    @FXML
    private Button btnHome;
    @FXML
    private Button btnConfiguration;
    @FXML
    private Label lbClinica;
    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;

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
        bp.setTop(null); bp.setCenter(null); bp.setBottom(null); 
        //bp.setLeft(null);
        bp.setRight(null);
        bp.setCenter(root);
    }


    @FXML
    private void btnPatientsOnAction(ActionEvent event) {
    }

    @FXML
    private void btnDoctorsOnAction(ActionEvent event) {
    }

    @FXML
    private void btnDiseaseOnAction(ActionEvent event) {
    }

    @FXML
    private void btnAppointmentOnAction(ActionEvent event) {
    }

    @FXML
    private void btnMedicalAttentionOnAction(ActionEvent event) {
    }

    @FXML
    private void btnPaymentOnAction(ActionEvent event) {
    }

    @FXML
    private void btnReportOnAction(ActionEvent event) {
        
    }

    @FXML
    private void btnExitOnAction(ActionEvent event) {
        System.exit(-1);
    }

    @FXML
    private void btnHomeOnAction(ActionEvent event) {
         this.lbClinica.setText("Clínica CFM");
        this.bp.setCenter(ap);
    }

    @FXML
    private void btnConfigurationOnAction(ActionEvent event) {
    }
    
}
