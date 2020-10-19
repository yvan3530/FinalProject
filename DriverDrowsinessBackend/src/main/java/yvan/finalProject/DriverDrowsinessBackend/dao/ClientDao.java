package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Address;
import yvan.finalProject.DriverDrowsinessBackend.domain.Cart;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;

public interface ClientDao {

	boolean addClient(Client client);
	boolean updateClient(Client client);
	boolean deleteClient(Client client);
	List<Client> getClients();
	Client get(int clientId);
	
	
	Client getByEmail(String email);
	boolean addAddress(Address address);
	
	 List<Address> listShippingAddresses(int clientId);
	 List<Address> listShippingAddresses(Client client);
	 
	 boolean updateCart(Cart cart);
}
