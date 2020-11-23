package yvan.finalProject.DriverDrowsiness.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	 else if (auth.getAuthorities().stream().anyMatch(ga -> ga.getAuthority().equals("Driver"))) {
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
