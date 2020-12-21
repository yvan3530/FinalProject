
package yvan.finalProject.DriverDrowsiness.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import yvan.finalProject.DriverDrowsiness.util.FileUploadUtility;
import yvan.finalProject.DriverDrowsiness.validator.TruckValidator;
import yvan.finalProject.DriverDrowsinessBackend.dao.AlertDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.BookingDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.ClientDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.DriverDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.FreightDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.RouteDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.StaffDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.TruckDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Alert;
import yvan.finalProject.DriverDrowsinessBackend.domain.Booking;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;
import yvan.finalProject.DriverDrowsinessBackend.domain.Route;
import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

@Controller

@RequestMapping("/manage")
public class ManagementController {

	@Autowired
	private BookingDao bookingDao;
	@Autowired
	private TruckDao truckDao;	
	@Autowired
	private DriverDao driverDao;
	@Autowired
	private RouteDao routeDao;
	@Autowired
	private FreightDao freightDao;
	@Autowired
	private ClientDao clientDao;
	@Autowired
	private StaffDao staffDao;
	@Autowired
	private AlertDao alertDao;
	
	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);

//	@RequestMapping(value = "/bookings", method = RequestMethod.GET)
//	public ModelAndView showManageProducts(@RequestParam(name = "operation", required = false) String operation) {
//
//		ModelAndView mv = new ModelAndView("page");
//
//		mv.addObject("userClickManageBooking", true);
//		mv.addObject("title", "Manage Bookings");
//		Freight freight = new Freight();
//		Booking nBooking = new Booking();
//
//		nBooking.setFreight(freight);
//		mv.addObject("booking", nBooking);
//
//		if (operation != null) {
//			if (operation.equals("booking")) {
//				mv.addObject("message", "successfully");
//			}
//		}
//
//		return mv;
//	}
//
//	@RequestMapping(value = "/bookings", method = RequestMethod.POST)
//	public String handleBooking(@Valid @ModelAttribute("booking") Booking nBooking, BindingResult results,
//			Model model) {
//
//		if (results.hasErrors()) {
//
//			model.addAttribute("userClickManageBooking", true);
//			model.addAttribute("title", "Manage Bookings");
//			model.addAttribute("message", "Validation failed for Booking Submission!");
//			return "page";
//		}
//
//		logger.info(nBooking.toString());
//
//		bookingDao.addBooking(nBooking);
//
//		return "redirect:/manage/bookings?operation=booking";
//	}
//
	
	/*---------------------- start of crud truck ------------------------*/
	
	@RequestMapping(value = "/addtrucks", method = RequestMethod.GET)
	public ModelAndView showAddTruck(@RequestParam(name = "operation", required = false) String operation) {

		ModelAndView mv = new ModelAndView("AddTruck");

		mv.addObject("userClickAddTruck", true);
		mv.addObject("title", "Add Truck");

		Truck nTruck = new Truck();

		
		nTruck.setActive(true);
		
		mv.addObject("truck", nTruck);

		if (operation != null) {
			if (operation.equals("truck")) {
				mv.addObject("message", "successfully");
			}
		}

		return mv;
	}

	@RequestMapping(value = "/addtrucks", method = RequestMethod.POST)
	public String handleTruck(@Valid @ModelAttribute("truck") Truck nTruck, BindingResult results, Model model,
			HttpServletRequest request) {

		new TruckValidator().validate(nTruck, results);

		if (results.hasErrors()) {

			model.addAttribute("userClickAddTruck", true);
			model.addAttribute("title", "Add Truck");
			model.addAttribute("message", "Validation failed for Truck Submission!");
			return "page";
		}

		logger.info(nTruck.toString());

		truckDao.add(nTruck);
		if (!nTruck.getFile().getOriginalFilename().contentEquals("")) {
			FileUploadUtility.uploadFile(request, nTruck.getFile(), nTruck.getPlate());
		}

		return "redirect:/manage/addtrucks?operation=truck";
	}
	
	

	
	/*---------------------- start of crud route ------------------------*/
	
	@RequestMapping(value = "/addroute", method = RequestMethod.GET)
	public ModelAndView showAddroute(@RequestParam(name = "operation", required = false) String operation) {

		ModelAndView mv = new ModelAndView("route");

		mv.addObject("userClickAddRoute", true);
		mv.addObject("title", "Add route");

		Route nroute = new Route();

		
		mv.addObject("route", nroute);

		if (operation != null) {
			if (operation.equals("route")) {
				mv.addObject("message", "successfully");
			}
		}

		return mv;
	}
	
	@ModelAttribute("truckes")
	public List<Truck> getTruck(){
		
		return truckDao.getTrucks();
		
	}
	
	@ModelAttribute("drivers")
	public List<Driver> getdriver(){
		
		return driverDao.getDrivers();
		
	}

	@RequestMapping(value = "/addroute", method = RequestMethod.POST)
	public String handleRoute(@Valid @ModelAttribute("route") Route nroute, BindingResult results, Model model,
			HttpServletRequest request) {

		

		if (results.hasErrors()) {

			model.addAttribute("userClickAddRoute", true);
			model.addAttribute("title", "Add route");
			model.addAttribute("message", results.getAllErrors());
			return "page";
		}

		logger.info(nroute.toString());

		routeDao.addRoute(nroute); 
		

		return "redirect:/manage/addroute?operation=route";
	}
	
	
	@RequestMapping("/list-of-route")
	public String listRoute(Model theModel) {
		
		
		List<Route> theRoutes = routeDao.getRoute();
				
		
		// add the company to the model
		theModel.addAttribute("routes", theRoutes);
		
		
		return "Admin/viewroute";
	}

	@RequestMapping(value = "/RouteFormUpdate", method = RequestMethod.GET)
	public String UpdateRoute(@RequestParam("routeId") int id, Model theModel) {
		
		
		ModelAndView mv = new ModelAndView("page");

		mv.addObject("userClickAddRoute", true);
		mv.addObject("title", "Add route");
		//get the company from the database
		Route theRoute = routeDao.get(id);
				
		
		//set the company as the model attribute
		theModel.addAttribute("route", theRoute);
		
		//send over to our form
		return "route";
	}
	
	

	
	@RequestMapping(value = "/Routedelete", method = RequestMethod.GET)
	public String deleteRoute(@RequestParam("routeId") int theId) {
		
		//delete the company
		routeDao.deleteRoute(theId);
		return "redirect:/manage/list-of-route";
	}
	
	/*---------------------- end of crud route ------------------------*/

	
//	@RequestMapping(value = "/addfreight", method = RequestMethod.GET)
//	public ModelAndView showAddFreight(@RequestParam(name = "operation", required = false) String operation) {
//
//		ModelAndView mv = new ModelAndView("freight");
//
//		mv.addObject("userClickAddFreight", true);
//		mv.addObject("title", "Add Freight");
//
//		
//		Freight nFreight = new Freight();
//		
//		
//		mv.addObject("freight", nFreight);
//
//		if (operation != null) {
//			if (operation.equals("freight")) {
//				mv.addObject("message", "successfully");
//			}
//		}
//
//		return mv;
//	}

//	@RequestMapping(value = "/addfreight", method = RequestMethod.POST)
//	public String handlefreight(@Valid @ModelAttribute("freight") Freight nFreight, BindingResult results, Model model,
//			HttpServletRequest request) {
//
//		
//
//		if (results.hasErrors()) {
//
//			model.addAttribute("userClickAddFreight", true);
//			model.addAttribute("title", "Add Freight");
//			model.addAttribute("message", "Validation failed for Truck Submission!");
//			return "page";
//		}
//
//		logger.info(nFreight.toString());
//
//		;
//		freightDao.addFreight(nFreight);
//
//		return "redirect:/manage/addfreights?operation=freight";
//	}
	
	@RequestMapping("/list-of-freight")
	public String listFreight(Model theModel) {
		
		
		List<Freight> thefreight = freightDao.getFreights();
				
		
		// add the company to the model
		theModel.addAttribute("freights", thefreight);
		
		
		return "Admin/viewfreight";
	}

	@RequestMapping(value = "/UpdateFreight", method = RequestMethod.GET)
	public String Updatefreight(@RequestParam("freightId") int theId, Model theModel) {
		
		//get the company from the database
		
		Freight thefreight = freightDao.get(theId);
						
		
		//set the company as the model attribute
		theModel.addAttribute("freight", thefreight);
		
		//send over to our form
		return "redirect:/manage/addtrucks?operation=truck";
	}
	
	@RequestMapping(value = "/freightdelete", method = RequestMethod.GET)
	public String deletefreight(@RequestParam("freightId") int theId) {
		
		//delete the company
		freightDao.deleteFreight(theId);
		
		return "redirect:/manage/list-of-freight";
	}
	
//	@RequestMapping(value = "/delete", method = RequestMethod.GET)
//	public String deleteFreight(@RequestParam("freightId") Freight freight , Model theModel) {
//		
//		//delete the company
//		
//		freightDao.deleteFreight(theId);
//		return "redirect:/list";
//	}
	
	/*---------------------- end of crud truck ------------------------*/
	
	/*---------------------- start of crud client ------------------------*/
	
	@RequestMapping("/list-of-client")
	public String listClient(Model theModel) {
		
		
		List<Client> theClient = clientDao.getClients();
				
		
		// add the company to the model
		theModel.addAttribute("clients", theClient);
		
		
		return "Admin/viewclient";
	}
	
	@RequestMapping(value = "/clientFormUpdate", method = RequestMethod.GET)
	public String UpdateClient(@RequestParam("clientId") int userId, Model theModel) {
		
		
		
		//get the company from the database
		Client theClient = clientDao.get(userId);
				
		
		//set the company as the model attribute
		theModel.addAttribute("client", theClient);
		
		//send over to our form
		return "/flows/register/signup-personal";
	}
	
	
	@RequestMapping(value = "/Clientdelete", method = RequestMethod.GET)
	public String deleteclient(@RequestParam("clientId") int theId) {
		
		//delete the company
		clientDao.deleteClient(theId);
		return "redirect:/manage/list-of-client";
	}
	

	
	/*---------------------- end of crud client ------------------------*/

	
	/*---------------------- start of crud truck ------------------------*/
	
	@RequestMapping("/list-of-truck")
	public String listTruck(Model theModel) {
		
		
		List<Truck> theTruck = truckDao.getTrucks();
				
		
		// add the company to the model
		theModel.addAttribute("trucks", theTruck);
		
		
		return "Admin/viewtruck";
	}
	
	@RequestMapping(value = "/TruckFormUpdate", method = RequestMethod.GET)
	public String UpdateTruck(@RequestParam("truckId") int truckId, Model theModel) {
		
		
		
		//get the company from the database
		Truck theTruck = truckDao.get(truckId);
				
		
		//set the company as the model attribute
		theModel.addAttribute("truck", theTruck);
		
		//send over to our form
		return "AddTruck";
	}
	
	
	@RequestMapping(value = "/Truckdelete", method = RequestMethod.GET)
	public String deletetruck(@RequestParam("truckId") int theId) {
		
		//delete the company
		truckDao.delete(theId);
		return "redirect:/manage/list-of-truck";
	}
	
	/*---------------------- end of crud truck------------------------*/
	
	
/*---------------------- start of crud truck ------------------------*/
	
	@RequestMapping("/list-of-driver")
	public String listDriver(Model theModel) {
		
		
		List<Driver> thedriver = driverDao.getDrivers();
				
		
		// add the company to the model
		theModel.addAttribute("drivers", thedriver);
		
		
		return "Admin/viewdriver";
	}
	
	@RequestMapping(value = "/driverFormUpdate", method = RequestMethod.GET)
	public String UpdateDriver(@RequestParam("userId") int userId, Model theModel) {
		
		
		
		//get the company from the database
		Driver theDriver = driverDao.get(userId);
				
		
		//set the company as the model attribute
		theModel.addAttribute("driver", theDriver);
		
		//send over to our form
		return "flows/driver/signup-driver";
	}
	
	@RequestMapping(value = "/Driverdelete", method = RequestMethod.GET)
	public String deleteDriver(@RequestParam("userId") int theId) {
		
		//delete the company
		driverDao.deleteDriver(theId);
		return "redirect:/manage/list-of-driver";
	}
	/*---------------------- end of crud truck------------------------*/
	
	
/*---------------------- start of crud truck ------------------------*/
	
	@RequestMapping("/list-of-staff")
	public String listStaff(Model theModel) {
		
		
		List<Staff> theStaff = staffDao.getStaffs();
				
		
		// add the company to the model
		theModel.addAttribute("staffs", theStaff);
		
		
		return "Admin/viewstaff";
	}
	
	@RequestMapping(value = "/staffFormUpdate", method = RequestMethod.GET)
	public String UpdateStaff(@RequestParam("userId") int userId, Model theModel) {
		
		
		
		//get the company from the database
		Staff theStaff = staffDao.get(userId);
				
		
		//set the company as the model attribute
		theModel.addAttribute("staff", theStaff);
		
		//send over to our form
		return "flows/staff/signup-staff";
	}
	
	@RequestMapping(value = "/Staffdelete", method = RequestMethod.GET)
	public String deleteStaff(@RequestParam("staffId") int theId) {
		
		//delete the company
		staffDao.deleteStaff(theId);
		return "redirect:/manage/list-of-staff";
	}
	
	/*---------------------- end of crud truck------------------------*/
	
/*---------------------- start of crud truck ------------------------*/
	
	@RequestMapping("/list-of-Alert")
	public String listAlert(Model theModel) {
		
		
		List<Alert> theAlert = alertDao.getAlerts();
				
		
		// add the company to the model
		theModel.addAttribute("alerts", theAlert);
		
		
		return "Admin/viewAlert";
	}
	@RequestMapping("/pdfClient")
	public ModelAndView  generatepdf() {
		List<Client> clients=clientDao.getClients();
		  return new ModelAndView("pdfViewClient", "listClients", clients);
//		Document document = new Document(PageSize.A4);
//		try {
//			 PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(
//	                 new File("C:\\webtech\\finalYearProject\\FinalProject\\DriverDrowsiness\\src\\main\\java\\yvan\\finalProject\\DriverDrowsiness\\controller\\repors.pdf")));
//	         HeaderFooter event = new HeaderFooter();
//	         event.setHeader("client lists");
//	         writer.setPageEvent(event);
//	         document.open();
//	         
//	        
//	         Date now =new Date();
//	         SimpleDateFormat sp=new SimpleDateFormat("dd-MMM-yyyy");
//	         String date=String.format("Date: %s  ",new SimpleDateFormat("dd MMM yyyy hh:mm").format(now));
//	         Paragraph para=new Paragraph(date);
//	         para.setAlignment(Element.ALIGN_RIGHT);
//	         
//	        document.add(para);
//	       document.add(new Paragraph(new Chunk().NEWLINE));
//	       document.add(new Paragraph(new Chunk().NEWLINE));
//	        
//	         float[] cols= {1,6,6,3,3};
//	         PdfPTable table = new PdfPTable(cols);
//	         table.setWidthPercentage(100);
//	         
//	         
//	         if(null == clients){
//	        	  Paragraph paragraph = new Paragraph();
//	             paragraph.add(new Chunk("No data to display."));
//	             document.add(paragraph);
//	             
//	             
//	         }else {
//	        	 Paragraph preface = new Paragraph();
//	        	 PdfPCell c1=new PdfPCell(new Phrase("#"));
//	        	 PdfPCell c2=new PdfPCell(new Phrase("names"));
//	        	 PdfPCell c3=new PdfPCell(new Phrase("email"));
//	        	 PdfPCell c4=new PdfPCell(new Phrase("address"));
//	        	 PdfPCell c5=new PdfPCell(new Phrase("phone number"));
//	        	 table.addCell(c1);
//	        	 table.addCell(c2);
//	        	 table.addCell(c3);
//	        	 table.addCell(c4);
//	        	 table.addCell(c5);
//	        	 table.setHeaderRows(1);
//	        	 int n=0;
//	        	 for (Client c : clients) {
//	        		 table.addCell(String.valueOf(n));
//	        		 table.addCell(new Phrase(c.getFirstName()+" "+c.getLastName()));
//	        		 table.addCell(c.getEmail());
//	        		 table.addCell(c.getAddress());
//	        		 table.addCell(c.getTelePhone());
//	        		 n++;
//				}
//	        	 preface.add(table);
//	            document.add(preface);
//	            
//	        	 
//	        	 
//	         }
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally{
//            if(null != document){
//                document.close();
//            }
//        }
//		
//		return "yes";
		
	}
	@RequestMapping("/pdfStaff")
	public ModelAndView  generatepdfStaff() {
		List<Staff> staffs=staffDao.getStaffs();
		  return new ModelAndView("pdfViewStaff", "liststaff", staffs);
		  
	}
	
	@RequestMapping("/pdfDriver")
	public ModelAndView  generatepdfDriver() {
		List<Driver> drivers= driverDao.getDrivers();
		  return new ModelAndView("pdfViewDriver", "listdrivers", drivers);
		  
	}
	
	@RequestMapping("/pdfTruck")
	public ModelAndView  generatepdfTruck() {
		List<Truck> trucks= truckDao.getTrucks();
		  return new ModelAndView("pdfViewTruck", "listTrucks", trucks);
		  
	}
	
	@RequestMapping("/pdfAlert")
	public ModelAndView  generatepdfAlert() {
		List<Alert> alerts = alertDao.getAlerts();
		  return new ModelAndView("pdfViewAlert", "listAlert", alerts);
		  
	}
}
