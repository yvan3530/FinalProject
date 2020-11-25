package yvan.finalProject.DriverDrowsiness.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import yvan.finalProject.DriverDrowsiness.model.UserModel;
import yvan.finalProject.DriverDrowsinessBackend.dao.ClientDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.DriverDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.StaffDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;
import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;

@ControllerAdvice
public class GlobalController {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private ClientDao clientDao;
	
	@Autowired
	private DriverDao driverDao;
	
	@Autowired
	private StaffDao staffDao;
	
	private UserModel userModel = null;
	
	
	@ModelAttribute("userModel")
	public UserModel getUserModel() {
		
		if(session.getAttribute("userModel")==null) {
			
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			
			Client client = clientDao.getByEmail(authentication.getName());
			
			if(client!=null) {
				
				userModel = new UserModel();
				userModel.setId(client.getUserId());
				userModel.setEmail(client.getEmail());
				userModel.setRole(client.getRole());
				userModel.setFullName(client.getFirstName() + " " + client.getLastName());
				
				
				session.setAttribute("userModel", userModel);
				
				return userModel;
			}
			
		}
		
		return (UserModel) session.getAttribute("userModel");
	}
	
	
	@ModelAttribute("userModel")
	public UserModel getDriverModel() {
		
		if(session.getAttribute("userModel")==null) {
			
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			
			
			Driver driver = driverDao.getByEmail(authentication.getName());
			if(driver!=null) {
				
				userModel = new UserModel();
				userModel.setId(driver.getUserId());
				userModel.setEmail(driver.getEmail());
				userModel.setRole(driver.getRole());
				userModel.setFullName(driver.getFirstName() + " " + driver.getLastName());
				
				
				session.setAttribute("userModel", userModel);
				
				return userModel;
			}
			
		}
		
		return (UserModel) session.getAttribute("userModel");
	}
	
	
	@ModelAttribute("userModel")
	public UserModel getStaffModel() {
		
		if(session.getAttribute("userModel")==null) {
			
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			
			Staff staff = staffDao.getByEmail(authentication.getName());
			
			if(staff!=null) {
				
				userModel = new UserModel();
				userModel.setId(staff.getUserId());
				userModel.setEmail(staff.getEmail());
				userModel.setRole(staff.getRole());
				userModel.setFullName(staff.getFirstName() + " " + staff.getLastName());
				
				
				session.setAttribute("userModel", userModel);
				
				return userModel;
			}
			
		}
		
		return (UserModel) session.getAttribute("userModel");
	}
}
