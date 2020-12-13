package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Alert;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

public interface TruckDao {
	
	boolean add(Truck truck);
	boolean update(Truck truck);
	public void delete(int theId);
	List<Truck> getTrucks();
	Truck get(int truckId);
	
	List<Truck> listActiveTrucks();
	List<Truck> listActiveByDriver(int userId);
	List<Truck> getLatestActiveTrucks(int count);

//	List<Alert> getAlert();
//	Alert getAlert(int truck);

}
