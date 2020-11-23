package yvan.finalProject.DriverDrowsiness.model;

import java.io.Serializable;

import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

public class DriverModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Driver driver;
	
	
	
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
	
	

}
