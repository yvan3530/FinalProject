package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;


public interface DriverDao {
	
	boolean addDriver(Driver driver);
	boolean updateDriver(Driver driver);
	boolean deleteDriver(Driver driver);

	List<Driver> getDrivers();
	Driver get(int UserId);
	
	Driver getByEmail(String email);

}
