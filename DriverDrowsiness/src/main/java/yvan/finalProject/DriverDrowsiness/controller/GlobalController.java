package yvan.finalProject.DriverDrowsiness.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import yvan.finalProject.DriverDrowsiness.model.UserModel;
import yvan.finalProject.DriverDrowsinessBackend.dao.ClientDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;

@ControllerAdvice
public class GlobalController {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private ClientDao clientDao;
	
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
}