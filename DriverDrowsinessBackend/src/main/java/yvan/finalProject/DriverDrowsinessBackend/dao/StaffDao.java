package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

public interface StaffDao {
	
	boolean addStaff(Staff staff);
	boolean updateStaff(Staff staff);
	boolean deleteStaff(Staff staff);

	List<Staff> getStaffs();
	Staff get(int UserId);
	
	Staff getByEmail(String email);
	boolean addTruck(Truck truck);
	boolean updateTruck(Truck truck);
	boolean deleteTruck(Truck truck);
	List<Truck> getTrucks();
	Truck getTruck(int TruckId);
	List<Truck> listActiveTrucks();
	List<Truck> listActiveByDriver(int UserId);
	List<Truck> getLatestActiveTrucks(int count);
}
