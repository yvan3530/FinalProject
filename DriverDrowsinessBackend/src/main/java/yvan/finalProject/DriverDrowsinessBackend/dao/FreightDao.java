package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Booking;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;

public interface FreightDao {
	
	boolean addFreight(Freight freight);
	boolean updateFreight(Freight freight);
	public void deleteFreight(int theId);
	List<Freight> getFreights();
	Freight get(int freightId);
	
	List<Freight> listActiveFreights();
	List<Freight> listActiveByClient(int userId);
	List<Freight> getLatestActiveFreights(int count);
	
	boolean addBooking(Booking booking);

}
