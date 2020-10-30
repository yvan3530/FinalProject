package yvan.finalProject.DriverDrowsiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

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

	@RequestMapping(value = { "/login" })
	public ModelAndView login(@RequestParam(name="error",required = false)String error) {

		ModelAndView mv = new ModelAndView("login");
		
		if(error!=null) {
			mv.addObject("message", "Invalid Username and Password!");
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

}
