/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import domain.Archives.ArchiveTXT;
import domain.TDA.BST;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Maria Celeste
 */
public class PDF {
    
     //pdf
    public static void generateReport(String nameFile, String pdfTitle, String objContent) throws FileNotFoundException, DocumentException, BadElementException, IOException {
       //Ese path sera el camino en donde se guarden los datos
        BST configurations = util.Utility.getBST();
        Configuration confg = (Configuration) configurations.getRoot().data;
        //Se pone la ruta que impone el adminstrador
        FileOutputStream archive = new FileOutputStream(confg.getPath()+"\\"+nameFile + ".pdf");
       // "C:\\Users\\Maria Celeste\\Desktop\\U - I.E\\I Semestre-2022\\IF 3001\\ProyectoGr3\\Proyecto-Grupo3\\Proyecto Final IF3001 Grupo 3" +
        Document doc = new Document();

        PdfWriter.getInstance(doc, archive);
        doc.open();

        Paragraph title = new Paragraph(pdfTitle + "\n\n", FontFactory.getFont("arial", 18, Font.BOLD, BaseColor.BLACK));

        title.setAlignment(Paragraph.ALIGN_CENTER);

        
        Image img = Image.getInstance(confg.getImagesPath());
        img.setAlignment(Image.ALIGN_LEFT);
        img.setBorder(Image.BOX);
        img.setBorderWidth(0);
        img.setBorderColor(BaseColor.WHITE);
        img.scaleToFit(1100, 100); // tamaño 
        doc.add(img);
        doc.add(title);

        Paragraph dateReport = new Paragraph(objContent, FontFactory.getFont("arial", 14, Font.NORMAL, BaseColor.BLACK));
        dateReport.setAlignment(Paragraph.ALIGN_CENTER);
        doc.add(dateReport);

        doc.close();

    }
    
}
