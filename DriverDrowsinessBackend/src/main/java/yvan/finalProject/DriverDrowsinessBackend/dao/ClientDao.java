package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Address;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;

public interface ClientDao {
	
	boolean addClient(Client client);
	boolean updateClient(Client client);
	public void deleteClient(int theId);
	List<Client> getClients();
	Client get(int userId);
	
	boolean addFreight(Freight freight);
	
	Client getByEmail(String email);
	boolean addAddress(Address address);
	 Address getBillingAddress(int userId);
	 List<Address> listShippingAddresses(int userId);
	 List<Address> listShippingAddresses(Client client);
	 
	
	
	

}
