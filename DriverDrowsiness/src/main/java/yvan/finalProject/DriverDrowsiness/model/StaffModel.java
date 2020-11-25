package yvan.finalProject.DriverDrowsiness.model;

import java.io.Serializable;

import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;

public class StaffModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Staff staff;

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	

}
