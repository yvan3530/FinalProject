package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Address;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;

public interface ClientDao {
	
	boolean addClient(Client client);
	boolean updateClient(Client client);
	boolean deleteClient(Client client);
	List<Client> getClients();
	Client get(int UserId);
	
	boolean addFreight(Freight freight);
	
	Client getByEmail(String email);
	boolean addAddress(Address address);
	 Address getBillingAddress(int UserId);
	 List<Address> listShippingAddresses(int UserId);
	 List<Address> listShippingAddresses(Client client);
	 
	
	
	

}
