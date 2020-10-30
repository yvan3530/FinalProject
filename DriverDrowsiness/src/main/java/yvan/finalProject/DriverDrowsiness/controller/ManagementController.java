
package yvan.finalProject.DriverDrowsiness.controller;

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
import yvan.finalProject.DriverDrowsinessBackend.dao.TruckDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Booking;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

@Controller

@RequestMapping("/manage")
public class ManagementController {

	@Autowired
	private BookingDao bookingDao;

	@Autowired
	private TruckDao truckDao;


	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);

	@RequestMapping(value = "/bookings", method = RequestMethod.GET)
	public ModelAndView showManageProducts(@RequestParam(name = "operation", required = false) String operation) {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("userClickManageBooking", true);
		mv.addObject("title", "Manage Bookings");

		Booking nBooking = new Booking();

		nBooking.setClientId(12);
		nBooking.setTruckId(3);
		mv.addObject("booking", nBooking);

		if (operation != null) {
			if (operation.equals("booking")) {
				mv.addObject("message", "successfully");
			}
		}

		return mv;
	}

	@RequestMapping(value = "/bookings", method = RequestMethod.POST)
	public String handleBooking(@Valid @ModelAttribute("booking") Booking nBooking, BindingResult results,
			Model model) {

		if (results.hasErrors()) {

			model.addAttribute("userClickManageBooking", true);
			model.addAttribute("title", "Manage Bookings");
			model.addAttribute("message", "Validation failed for Booking Submission!");
			return "page";
		}

		logger.info(nBooking.toString());

		bookingDao.addBooking(nBooking);

		return "redirect:/manage/bookings?operation=booking";
	}

	@RequestMapping(value = "/addtrucks", method = RequestMethod.GET)
	public ModelAndView showAddTruck(@RequestParam(name = "operation", required = false) String operation) {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("userClickAddTruck", true);
		mv.addObject("title", "Add Truck");

		Truck nTruck = new Truck();

		nTruck.setStaffId(12);
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

}
