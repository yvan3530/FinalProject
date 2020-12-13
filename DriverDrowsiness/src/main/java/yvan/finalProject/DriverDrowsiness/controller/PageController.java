package yvan.finalProject.DriverDrowsiness.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import yvan.finalProject.DriverDrowsinessBackend.dao.FreightDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;

@Controller
public class PageController {
	
	@Autowired
	private FreightDao freightDao;
	
	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;

	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;

	}

	@RequestMapping(value = { "/service" })
	public ModelAndView service() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Service");
		mv.addObject("userClickService", true);
		return mv;

	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;

	}

	@RequestMapping(value = { "/health" })
	public ModelAndView health() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Health");
		mv.addObject("userClickHealth", true);
		return mv;

	}
	
	@RequestMapping(value = { "/dashboard" })
	public ModelAndView dashboard() {

		ModelAndView mv = new ModelAndView("Admin/dashboard");
		mv.addObject("title", "Dashboard");
		mv.addObject("userClickAddDashboad", true);
		return mv;

	}
	@RequestMapping(value = { "/addstaff" })
	public ModelAndView addstaff() {

		ModelAndView mv = new ModelAndView("Admin/addstaff");
		
		return mv;

	}
	@RequestMapping(value = { "/viewstaff" })
	public ModelAndView viewstaff() {

		ModelAndView mv = new ModelAndView("staff/addstaff");
		
		return mv;

	}
	
	
	
	@RequestMapping(value = "/addfreight", method = RequestMethod.GET)
	public ModelAndView showAddFreight(@RequestParam(name = "operation", required = false) String operation) {

		ModelAndView mv = new ModelAndView("freight");

		

		
		Freight nFreight = new Freight();
		
		
		mv.addObject("freight", nFreight);

		if (operation != null) {
			if (operation.equals("freight")) {
				mv.addObject("message", "successfully");
			}
		}

		return mv;
	}

	@RequestMapping(value = "/addfreight", method = RequestMethod.POST)
	public String handlefreight(@Valid @ModelAttribute("freight") Freight nFreight, BindingResult results, Model model,
			HttpServletRequest request) {

		

		if (results.hasErrors()) {

			model.addAttribute("userClickAddFreight", true);
			model.addAttribute("title", "Add Freight");
			model.addAttribute("message", "Validation failed for Truck Submission!");
			return "page";
		}

		logger.info(nFreight.toString());

		;
		freightDao.addFreight(nFreight);

		return "redirect:/addfreight?operation=freight";
	}
	
	

	@RequestMapping(value = { "/login" })
	public ModelAndView login(@RequestParam(name="error",required = false)String error,
			@RequestParam(name="logout",required = false)String logout
			) {

		ModelAndView mv = new ModelAndView("login");
		
		if(error!=null) {
			mv.addObject("message", "Invalid Username and Password!");
		}
		
		if(logout!=null) {
			mv.addObject("logout", "you have successfully logged out!");
		}
		
		mv.addObject("title", "Login");
		
		return mv;

	}
	
	@RequestMapping(value =  "/access-denied" )
	public ModelAndView accessDenied() {

		ModelAndView mv = new ModelAndView("error");
		mv.addObject("title", "403 - Access Denied");
		mv.addObject("errorTitle", "Aaaaaha! Caught you");
		mv.addObject("errorDescription", "You are not authorized to view this page!");
		return mv;

	}
	
	@GetMapping("/redirect")
	public String getRedirect(HttpServletResponse resp, HttpServletRequest request) throws IOException {
	 
	 System.out.println("Auth: " + SecurityContextHolder.getContext().getAuthentication());

	 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	 System.out.println("Principal: " + auth.getPrincipal());
	 System.out.println("Authorities: " + auth.getAuthorities()); //get it from here OR
	 System.out.println(request.isUserInRole("ADMIN")); // get it from Here as WELL (ONLY IF YOU HAVE A REQUEST)

	 if (auth.getAuthorities().stream().anyMatch(ga -> ga.getAuthority().equals("ADMIN"))) {
		// System.out.println("ADMIN"); 
	  return "redirect:/home" ;
	 }
	 else if (auth.getAuthorities().stream().anyMatch(ga -> ga.getAuthority().equals("DRIVER"))) {
		// System.out.println("ADMIN"); 
	  return "redirect:/home" ;
	 }
	 else 
		// System.out.println("user");
	 return "redirect:/about" ;
	 
	}
	
	@RequestMapping(value = "/perform-logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if(auth!=null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		
		
		return "redirect:/login?logout";
	}

}
