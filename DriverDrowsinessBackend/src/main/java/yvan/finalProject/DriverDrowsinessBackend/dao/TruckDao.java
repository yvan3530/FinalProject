package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

public interface TruckDao {
	
	boolean add(Truck truck);
	boolean update(Truck truck);
	boolean delete(Truck truck);
	List<Truck> getTrucks();
	Truck get(int TruckId);
	
	List<Truck> listActiveTrucks();
	List<Truck> listActiveByDriver(int UserId);
	List<Truck> getLatestActiveTrucks(int count);


}
