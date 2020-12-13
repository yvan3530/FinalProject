package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Address;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;


public interface DriverDao {
	
	boolean addDriver(Driver driver);
	boolean updateDriver(Driver driver);
	public void deleteDriver(int theId);

	List<Driver> getDrivers();
	Driver get(int userId);
	
	Driver getByEmail(String email);
	
	boolean addAddress(Address address);
	 Address getBillingAddress(int userId);
	 List<Address> listShippingAddresses(int userId);
	 List<Address> listShippingAddresses(Driver driver);

}
