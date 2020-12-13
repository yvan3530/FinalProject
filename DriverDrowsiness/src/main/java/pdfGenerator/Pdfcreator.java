package pdfGenerator;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import yvan.finalProject.DriverDrowsiness.controller.HeaderFooter;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author SYSTEMplus
 */
public class Pdfcreator {
    private static JTable tableModel;
    public static void setPdf(JTable j ,String Title) {
           Document   document=null;
           tableModel=j;
        try{
      document = new Document(PageSize.A4);  
        JFileChooser fileChooser = new JFileChooser();
            FileFilter filter = new FileNameExtensionFilter("Files", ".pdf");
            fileChooser.addChoosableFileFilter(filter);
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.setDialogTitle("Save the report"); 
            String fileDictName = null;
            fileChooser.setSelectedFile(new File("reports.pdf"));
            int userSelection = fileChooser.showSaveDialog(fileChooser);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                    fileDictName = fileChooser.getSelectedFile().getAbsolutePath();
                     if(new File(fileDictName).exists()){
                         int response=JOptionPane.showConfirmDialog(null,"the file exists!Do you want to replace it","confirm",JOptionPane.YES_NO_OPTION);
                         if(response != JOptionPane.YES_OPTION){
                             return;
                         }
                     }    
                    
                     if (!fileDictName .endsWith(".pdf"))
                              fileDictName += ".pdf";
                }

      
      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(
                    new File(fileDictName)));
            HeaderFooter event = new HeaderFooter();
            event.setHeader(Title);
            writer.setPageEvent(event);
            document.open();
         
            
            Pdfcreator.addContent(document);
          
        }catch (Exception e) {
            e.printStackTrace();
          
        }finally{
            if(null != document){
                document.close();
            }
        }
    }
    public static void addMetaData(Document document, String sqlXMLFileName) {
        document.addTitle("Report");
        document.addSubject("Using iText");
        document.addAuthor("yvan");
    }
    public static void addContent(Document document) throws DocumentException {
        Paragraph paragraph = new Paragraph();
      
        createReportTable(paragraph);
        document.add(paragraph);
    }
    private static int getColumnCount(){
        
    int i=0;
         for(int col=0; col<tableModel.getColumnCount();col++){
                    if(tableModel.getColumnName(col).equals("Edit")||tableModel.getColumnName(col).equals("View")){
                    }
                    else{
                       i++; 
                    }
    }
         return i;
    }
    private static void createReportTable(Paragraph paragraph)
    throws BadElementException {
         
                        
        PdfPTable table = new PdfPTable(getColumnCount());
        table.setWidthPercentage(100);
        
        if(null == tableModel){
            paragraph.add(new Chunk("No data to display."));
            return;
        }
        addHeaderInTable(table);
        for(int i=0;i<tableModel.getRowCount();i++){
                
                for(int col=0; col<tableModel.getColumnCount();col++){
                    if(tableModel.getColumnName(col).equals("Edit")||tableModel.getColumnName(col).equals("View")){
                    }
                    else{
                             table.addCell(new Phrase(  tableModel.getValueAt(i, col).toString()));
                    }
                }
                  
            }  
        
        paragraph.add(table);
    }
    /** Helper methods start here **/  
    public static void addTitlePage(Document document, String title) throws DocumentException {
        Paragraph preface = new Paragraph();
        addEmptyLine(preface, 3);
        preface.add(new Phrase("Test Report: "));
        preface.add(new Phrase(title));
        addEmptyLine(preface, 1);
        preface.add(new Phrase("Date: "));
        preface.add(new Phrase(new Date().toString()));
        addEmptyLine(preface, 1);
        preface.add(new Phrase("Report generated by: "));
        preface.add(new Phrase("Arun"));
        addEmptyLine(preface, 2);
        preface.add(new Phrase("This is basically a sample report."));
        document.addSubject("PDF : " + title);
        preface.setAlignment(Element.ALIGN_CENTER);
        document.add(preface);
        document.newPage();
    }
    public static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
    public static void addHeaderInTable(PdfPTable table){
        PdfPCell c1 = null;
        for(int col=0; col<tableModel.getColumnCount();col++){
            if(tableModel.getColumnName(col).equals("Edit")||tableModel.getColumnName(col).equals("View")){
                    }
                    else{
            c1 = new PdfPCell(new Phrase(tableModel.getColumnName(col)));
            c1.setBackgroundColor(BaseColor.GREEN);
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            table.addCell(c1);
            }
        }
        table.setHeaderRows(1);
    }
   
    public static Paragraph getParagraph(){        
        Paragraph paragraph = new Paragraph();
       
        addEmptyLine(paragraph, 1);
        return paragraph;
    }
}
