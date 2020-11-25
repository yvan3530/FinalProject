
package yvan.finalProject.DriverDrowsiness.controller;

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

import yvan.finalProject.DriverDrowsiness.util.FileUploadUtility;
import yvan.finalProject.DriverDrowsiness.validator.TruckValidator;
import yvan.finalProject.DriverDrowsinessBackend.dao.BookingDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.ClientDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.DriverDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.FreightDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.RouteDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.StaffDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.TruckDao;
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

		ModelAndView mv = new ModelAndView("page");

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
	
	
//	@RequestMapping("/list-of-truck")
//	public String listTruck(Model theModel) {
//		
//		
//		List<Truck> thetruck = truckDao.getTrucks();
//			
//		
//		// add the company to the model
//		theModel.addAttribute("trucks", thetruck);
//		
//		
//		return "viewTruck";
//	}
//
//	@RequestMapping(value = "/UpdateTruck", method = RequestMethod.GET)
//	public String Updatetruck(@RequestParam("TruckId") int theId, Model theModel) {
//		
//		//get the company from the database
//		
//		Truck theTruck = truckDao.get(theId);		
//		
//		//set the company as the model attribute
//		theModel.addAttribute("truck", theTruck);
//		
//		//send over to our form
//		return "redirect:/manage/addtrucks?operation=truck";
//	}
//	
//	@RequestMapping(value = "/delete", method = RequestMethod.GET)
//	public String deleteTruck(@RequestParam("TruckId") Truck truck, Model theModel) {
//		
//		//delete the company
//		truckDao.delete(truck);
//		
//		return "redirect:/list";
//	}
//	
	/*---------------------- end of crud truck ------------------------*/
	
	
	/*---------------------- start of crud route ------------------------*/
	
	@RequestMapping(value = "/addroute", method = RequestMethod.GET)
	public ModelAndView showAddroute(@RequestParam(name = "operation", required = false) String operation) {

		ModelAndView mv = new ModelAndView("page");

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

	@RequestMapping(value = "/Updateroute", method = RequestMethod.GET)
	public String Updateroute(@RequestParam("id") int theId, Model theModel) {
		
		//get the company from the database
		Route theRoute = routeDao.get(theId);
				
		
		//set the company as the model attribute
		theModel.addAttribute("route", theRoute);
		
		//send over to our form
		return "redirect:/manage/addroute?operation=route";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteRoute(@RequestParam("id") int theId, Model theModel) {
		
		//delete the company
		routeDao.deleteRoute(theId);
		return "redirect:/list";
	}
	
	/*---------------------- end of crud route ------------------------*/

	
//	@RequestMapping("/list-of-freight")
//	public String listFreight(Model theModel) {
//		
//		
//		List<Freight> thefreight = freightDao.getFreights();
//				
//			
//		
//		// add the company to the model
//		theModel.addAttribute("freight", thefreight);
//		
//		
//		return "viewTruck";
//	}
//
//	@RequestMapping(value = "/UpdateFreight", method = RequestMethod.GET)
//	public String Updatefreight(@RequestParam("freightId") int theId, Model theModel) {
//		
//		//get the company from the database
//		
//		Freight thefreight = freightDao.get(theId);
//						
//		
//		//set the company as the model attribute
//		theModel.addAttribute("freight", thefreight);
//		
//		//send over to our form
//		return "redirect:/manage/addtrucks?operation=truck";
//	}
//	
//	@RequestMapping(value = "/delete", method = RequestMethod.GET)
//	public String deleteFreight(@RequestParam("freightId") Freight freight , Model theModel) {
//		
//		//delete the company
//		
//		freightDao.deleteFreight(freight);
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
	
	/*---------------------- end of crud client ------------------------*/

	
	/*---------------------- start of crud truck ------------------------*/
	
	@RequestMapping("/list-of-truck")
	public String listTruck(Model theModel) {
		
		
		List<Truck> theTruck = truckDao.getTrucks();
				
		
		// add the company to the model
		theModel.addAttribute("trucks", theTruck);
		
		
		return "Admin/viewtruck";
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
	
	/*---------------------- end of crud truck------------------------*/
	
	
/*---------------------- start of crud truck ------------------------*/
	
	@RequestMapping("/list-of-staff")
	public String listStaff(Model theModel) {
		
		
		List<Staff> theStaff = staffDao.getStaffs();
				
		
		// add the company to the model
		theModel.addAttribute("staffs", theStaff);
		
		
		return "Admin/viewstaff";
	}
	
	/*---------------------- end of crud truck------------------------*/
	
	
}
