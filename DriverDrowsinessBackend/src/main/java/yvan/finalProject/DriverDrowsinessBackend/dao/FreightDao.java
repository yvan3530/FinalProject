package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;

public interface FreightDao {
	
	boolean addFreight(Freight freight);
	boolean updateFreight(Freight freight);
	boolean deleteFreight(Freight freight);
	List<Freight> getFreights();
	Freight get(int freightId);
	
	List<Freight> listActiveFreights();
	List<Freight> listActiveByClient(int UserId);
	List<Freight> getLatestActiveFreights(int count);

}
