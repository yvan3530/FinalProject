package yvan.finalProject.DriverDrowsiness.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import yvan.finalProject.DriverDrowsiness.model.DriverModel;
import yvan.finalProject.DriverDrowsiness.model.RegisterModel;
import yvan.finalProject.DriverDrowsiness.model.StaffModel;
import yvan.finalProject.DriverDrowsinessBackend.dao.DriverDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.StaffDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;
import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;

@Component
public class StaffHandler {

	@Autowired
	private StaffDao staffDao;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public StaffModel init() {

		return new StaffModel();
	}

	public void addStaff(StaffModel staffModel, Staff staff) {

		staffModel.setStaff(staff);

	}

	public String validateStaff(Staff staff, MessageContext error) {

		String transitionValue = "success";
		if (!(staff.getPassword().equals(staff.getConfirmPassword()))) {

			error.addMessage(new MessageBuilder().error().source("confirmPassword")
					.defaultText("Password does not match the confirm Password").build());

			transitionValue = "failure";
		}
		if (staffDao.getByEmail(staff.getEmail()) != null) {

			error.addMessage(new MessageBuilder().error().source("email")
					.defaultText("Email address is already in Use!").build());

			transitionValue = "failure";
		}

		return transitionValue;
	}

	public String saveAll(StaffModel model) {

		String transitionValue = "success";

		Staff staff = model.getStaff();

		staff.setPassword(passwordEncoder.encode(staff.getPassword()));

		staffDao.addStaff(staff);

		return transitionValue;
	}

}
