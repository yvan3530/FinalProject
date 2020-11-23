package yvan.finalProject.DriverDrowsiness.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import yvan.finalProject.DriverDrowsiness.model.DriverModel;
import yvan.finalProject.DriverDrowsiness.model.RegisterModel;
import yvan.finalProject.DriverDrowsinessBackend.dao.DriverDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;

@Component
public class DriverHandler {

	@Autowired
	private DriverDao driverDao;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public DriverModel init() {

		return new DriverModel();
	}

	public void addDriver(DriverModel driverModel, Driver driver) {

		driverModel.setDriver(driver);

	}

	public String validateDriver(Driver driver, MessageContext error) {

		String transitionValue = "success";
		if (!(driver.getPassword().equals(driver.getConfirmPassword()))) {

			error.addMessage(new MessageBuilder().error().source("confirmPassword")
					.defaultText("Password does not match the confirm Password").build());

			transitionValue = "failure";
		}
		if (driverDao.getByEmail(driver.getEmail()) != null) {

			error.addMessage(new MessageBuilder().error().source("email")
					.defaultText("Email address is already in Use!").build());

			transitionValue = "failure";
		}

		return transitionValue;
	}

	public String saveAll(DriverModel model) {

		String transitionValue = "success";

		Driver driver = model.getDriver();

		driver.setPassword(passwordEncoder.encode(driver.getPassword()));

		driverDao.addDriver(driver);

		return transitionValue;
	}

}
