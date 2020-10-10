package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Client;

public interface ClientDao {

	boolean addClient(Client client);
	boolean updateClient(Client client);
	boolean deleteClient(Client client);
	List<Client> getClients();
	Client get(int clientId);
	
}
