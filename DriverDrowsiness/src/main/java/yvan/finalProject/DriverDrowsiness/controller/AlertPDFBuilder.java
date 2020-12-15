package yvan.finalProject.DriverDrowsiness.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import yvan.finalProject.DriverDrowsinessBackend.domain.Alert;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AlertPDFBuilder extends PDFAbstract {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		 List<Alert> alerts = ( List<Alert>) model.get("listAlert");
		  Date now =new Date();
	         SimpleDateFormat sp=new SimpleDateFormat("dd-MMM-yyyy");
	         String date=String.format("Date: %s  ",new SimpleDateFormat("dd MMM yyyy hh:mm").format(now));
	         Paragraph para=new Paragraph(date);
	         para.setAlignment(Element.ALIGN_RIGHT);
	         Font CUSTOM_FONT = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD | Font.UNDERLINE);
	         Font white = new Font(Font.FontFamily.TIMES_ROMAN);
	         white.setColor(BaseColor.WHITE);
	         
	         Image image = Image.getInstance("C:\\webtech\\finalYearProject\\FinalProject\\DriverDrowsiness\\src\\main\\java\\images.jpeg");
			 //document.add(new Paragraph("Image"));
			 document.add(image);
			 
	         
	        document.add(para);
	       document.add(new Paragraph(new Chunk().NEWLINE));
	       document.add(new Paragraph(new Chunk().NEWLINE));
	       Paragraph title=new Paragraph(new Phrase("List of Alerts",CUSTOM_FONT));
	         title.setAlignment(Element.ALIGN_CENTER);
	         document.add(title);
	         document.add(new Paragraph(new Chunk().NEWLINE));
		       document.add(new Paragraph(new Chunk().NEWLINE));
	        
	         float[] cols= {1,6,1};
	         PdfPTable table = new PdfPTable(cols);
	         table.setWidthPercentage(100);
	         
	         
	         if(null == alerts){
	        	  Paragraph paragraph = new Paragraph();
	             paragraph.add(new Chunk("No data to display."));
	             document.add(paragraph);
	             
	             
	         }else {
	        	 Paragraph preface = new Paragraph();
	        	 PdfPCell c1=new PdfPCell(new Phrase("#",white));
	        	 c1.setBackgroundColor(BaseColor.BLACK);
	        	
	        	 PdfPCell c2=new PdfPCell(new Phrase("Date",white));
	        	 c2.setBackgroundColor(BaseColor.BLACK);
	        	 PdfPCell c3=new PdfPCell(new Phrase("Truck",white));
	        	 c3.setBackgroundColor(BaseColor.BLACK);
	        	 
	        	 table.addCell(c1);
	        	 table.addCell(c2);
	        	 table.addCell(c3);
	        	 
	        	 table.setHeaderRows(1);
	        	 
	        	 int n=1;
	        	 for (Alert c : alerts) {
	        		 table.addCell(String.valueOf(n));
	        		 table.addCell(new Phrase(String.valueOf(c.getDate())));
	        		 table.addCell(String.valueOf(c.getTruck().getTruckId()));
	        		
	        		 n++;
				}
	        	 preface.add(table);
	            document.add(preface);
	         }
		
	}

}
