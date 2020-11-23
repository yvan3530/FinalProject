package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Address;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;


public interface DriverDao {
	
	boolean addDriver(Driver driver);
	boolean updateDriver(Driver driver);
	boolean deleteDriver(Driver driver);

	List<Driver> getDrivers();
	Driver get(int UserId);
	
	Driver getByEmail(String email);
	
	boolean addAddress(Address address);
	 Address getBillingAddress(int UserId);
	 List<Address> listShippingAddresses(int UserId);
	 List<Address> listShippingAddresses(Driver driver);

}
