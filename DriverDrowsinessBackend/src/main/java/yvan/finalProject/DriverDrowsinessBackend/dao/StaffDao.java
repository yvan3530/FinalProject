package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Route;
import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

public interface StaffDao {
	
	boolean addStaff(Staff staff);
	boolean updateStaff(Staff staff);
	public void deleteStaff(int theId);

	List<Staff> getStaffs();
	Staff get(int userId);
	
	Staff getByEmail(String email);
	boolean addTruck(Truck truck);
	boolean updateTruck(Truck truck);
	boolean deleteTruck(Truck truck);
	List<Truck> getTrucks();
	Truck getTruck(int truckId);
	List<Truck> listActiveTrucks();
	List<Truck> listActiveByDriver(int userId);
	List<Truck> getLatestActiveTrucks(int count);
	
	
	boolean addRoute(Route route);
	boolean updateRoute(Route route);
	boolean deleteRoute(Route route);
}
