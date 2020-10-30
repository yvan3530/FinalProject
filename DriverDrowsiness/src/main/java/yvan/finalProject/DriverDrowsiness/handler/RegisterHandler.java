package yvan.finalProject.DriverDrowsiness.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import yvan.finalProject.DriverDrowsiness.model.RegisterModel;
import yvan.finalProject.DriverDrowsinessBackend.dao.ClientDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Address;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.User;

@Component
public class RegisterHandler {

	@Autowired
	private ClientDao clientDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public RegisterModel init() {

		return new RegisterModel();
	}

	public void addClient(RegisterModel registerModel, Client client) {

		registerModel.setClient(client);
	}

	public void addBilling(RegisterModel registerModel, Address billing) {

		registerModel.setBilling(billing);
	}
	
	public String validateClient(Client client, MessageContext error) {
		
		String transitionValue = "success";
		
		if(!(client.getPassword().equals(client.getConfirmPassword()))) {
			
			error.addMessage(new MessageBuilder().error()
					.source("confirmPassword")
						.defaultText("Password does not match the confirm Password")
							.build());
			
			transitionValue = "failure";
		}
		
		if(clientDao.getByEmail(client.getEmail())!=null) {
			
			error.addMessage(new MessageBuilder().error()
					.source("email")
						.defaultText("Email address is already inUse!")
							.build());
			
			transitionValue = "failure";
		}
		
		
		return transitionValue;
		
	}

	public String saveAll(RegisterModel model) {

		String transitionValue = "success";
		
		
	Client client = model.getClient();

//		if (user.getRole().equals("USER")) {
//			Cart cart = new Cart();
//			cart.setClient(client);
//			client.setCart(cart);
//		}

//	encode the password
	client.setPassword(passwordEncoder.encode(client.getPassword()));
	
		clientDao.addClient(client);

		Address billing = model.getBilling();
		billing.setClientId(client.getUserId());
		billing.setBilling(true);

		clientDao.addAddress(billing);

		return transitionValue;

	}
}
