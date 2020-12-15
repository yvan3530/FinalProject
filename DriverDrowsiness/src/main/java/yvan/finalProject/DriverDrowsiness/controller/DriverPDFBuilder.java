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

import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DriverPDFBuilder extends PDFAbstract {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		 List<Driver> drivers = (List<Driver>) model.get("listdrivers");
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
	       Paragraph title=new Paragraph(new Phrase("List of Drivers",CUSTOM_FONT));
	         title.setAlignment(Element.ALIGN_CENTER);
	         document.add(title);
	         document.add(new Paragraph(new Chunk().NEWLINE));
		       document.add(new Paragraph(new Chunk().NEWLINE));
	        
	         float[] cols= {1,6,6,3,3};
	         PdfPTable table = new PdfPTable(cols);
	         table.setWidthPercentage(100);
	         
	         
	         if(null == drivers){
	        	  Paragraph paragraph = new Paragraph();
	             paragraph.add(new Chunk("No data to display."));
	             document.add(paragraph);
	             
	             
	         }else {
	        	 Paragraph preface = new Paragraph();
	        	 PdfPCell c1=new PdfPCell(new Phrase("#",white));
	        	 c1.setBackgroundColor(BaseColor.BLACK);
	        	
	        	 PdfPCell c2=new PdfPCell(new Phrase("names",white));
	        	 c2.setBackgroundColor(BaseColor.BLACK);
	        	 PdfPCell c3=new PdfPCell(new Phrase("email",white));
	        	 c3.setBackgroundColor(BaseColor.BLACK);
	        	 PdfPCell c4=new PdfPCell(new Phrase("address",white));
	        	 c4.setBackgroundColor(BaseColor.BLACK);
	        	 PdfPCell c5=new PdfPCell(new Phrase("phone number",white));
	        	 c5.setBackgroundColor(BaseColor.BLACK);
	        	 table.addCell(c1);
	        	 table.addCell(c2);
	        	 table.addCell(c3);
	        	 table.addCell(c4);
	        	 table.addCell(c5);
	        	 table.setHeaderRows(1);
	        	 
	        	 int n=1;
	        	 for (Driver c : drivers) {
	        		 table.addCell(String.valueOf(n));
	        		 table.addCell(new Phrase(c.getFirstName()+" "+c.getLastName()));
	        		 table.addCell(c.getEmail());
	        		 table.addCell(c.getAddress());
	        		 table.addCell(c.getTelePhone());
	        		 n++;
				}
	        	 preface.add(table);
	            document.add(preface);
	         }
		
	}

}
