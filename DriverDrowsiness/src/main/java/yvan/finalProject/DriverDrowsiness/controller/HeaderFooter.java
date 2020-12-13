package yvan.finalProject.DriverDrowsiness.controller;
/**
 *
 * @author Ntare
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
public class HeaderFooter extends PdfPageEventHelper {
    /** The header/footer text. */
    String header;
    /** The template with the total number of pages. */
    PdfTemplate total;
    /**
     * Allows us to change the content of the header.
     * @param header The new header String
     */
    public void setHeader(String header) {
        this.header = header;
    }
    /**
     * Creates the PdfTemplate that will hold the total number of pages
     * @param writer
     * @param document
     */
    @Override
    public void onOpenDocument(PdfWriter writer, Document document) {
        total = writer.getDirectContent().createTemplate(25, 16);
        
    }
    /**
     * Adds a header to every page
     * @param writer
     * @param document
     */
    @Override
    public void onEndPage(PdfWriter writer, Document document) {
        PdfPTable table = new PdfPTable(1);
        Date now =new Date();
        SimpleDateFormat sp=new SimpleDateFormat("dd-MMM-yyyy");
       
        try {
            table.setWidths(new float[]{2});
            table.setLockedWidth(true);
           
           
            PdfPCell cell = new PdfPCell();
          
            cell = new PdfPCell(new Phrase(String.format("Page %d  ", writer.getPageNumber())));
            cell.setBorder (0);
            
            table.addCell(cell);
            Rectangle page = document.getPageSize();

            
            
            table.setTotalWidth(page.getWidth() - document.leftMargin() - document.rightMargin());
            table.writeSelectedRows(0, -1, document.leftMargin(), document.bottomMargin()
                    + table.getTotalHeight()+5, writer.getDirectContent());          
        }
        catch(DocumentException de) {
            throw new ExceptionConverter(de);
        }
    }
    /**
     * Fills out the total number of pages before the document is closed
     * @param writer
     * @param document
     */
    @Override
    public void onCloseDocument(PdfWriter writer, Document document) {
        ColumnText.showTextAligned(total, Element.ALIGN_LEFT,
                new Phrase(String.valueOf(writer.getPageNumber() - 1)), 2, 2, 0);
    }
}
