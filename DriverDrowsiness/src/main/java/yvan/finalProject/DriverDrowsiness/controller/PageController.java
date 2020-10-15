package yvan.finalProject.DriverDrowsiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yvan.finalProject.DriverDrowsinessBackend.dao.DriverDao;

@Controller
public class PageController {
	
	

	@RequestMapping(value = {"/","/home", "/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		return mv;
		
	}
	
	/*
	 * @RequestMapping(value = {"/about"}) public ModelAndView about() {
	 * 
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("title","About Us");
	 * mv.addObject("userClickAbout",true); return mv;
	 * 
	 * }
	 * 
	 * @RequestMapping(value = {"/service"}) public ModelAndView service() {
	 * 
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("title","Service");
	 * mv.addObject("userClickService",true); return mv;
	 * 
	 * }
	 * 
	 * @RequestMapping(value = {"/contact"}) public ModelAndView contact() {
	 * 
	 * ModelAndView mv = new ModelAndView("page");
	 * mv.addObject("title","Contact Us"); mv.addObject("userClickContact",true);
	 * return mv;
	 * 
	 * }
	 * 
	 * @RequestMapping(value = {"/health"}) public ModelAndView health() {
	 * 
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("title","Health");
	 * mv.addObject("userClickHealth",true); return mv;
	 * 
	 * }
	 * 
	 * @RequestMapping(value = {"/truck"}) public ModelAndView truck() {
	 * 
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("title","Truck");
	 * mv.addObject("userClickTruck",true); return mv;
	 * 
	 * }
	 */
}
