package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.ClientDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Address;
import yvan.finalProject.DriverDrowsinessBackend.domain.Cart;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;


@Repository("clientDAO")
@Transactional
public class ClientDaoImpl implements ClientDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public boolean addClient(Client client) {

		try {
			sessionFactory.getCurrentSession().persist(client);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateClient(Client client) {
		try {
			sessionFactory.getCurrentSession().update(client);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteClient(Client client) {
		try {
			sessionFactory.getCurrentSession().delete(client);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Client> getClients() {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Client" ,Client.class)
							.getResultList();
	}

	@Override
	public Client get(int clientId) {
		try {return sessionFactory.getCurrentSession().get(Client.class, Integer.valueOf(clientId));
		}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			return null;
	}

	@Override
	public Client getByEmail(String email) {
		String selectQuery = "FROM Client WHERE email = :email";		
		try {
			
			return sessionFactory.getCurrentSession()
					.createQuery(selectQuery,Client.class)
					.setParameter("email", email)
					.getSingleResult();

			
		}
		catch(Exception ex) {
			
			return null;
		}
	}

	@Override
	public boolean addAddress(Address address) {
		try {
			sessionFactory.getCurrentSession().persist(address);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Address> listShippingAddresses(int clientId) {
		String selectQuery = "FROM Address WHERE clientId = :clientId AND shipping = :shipping";
		
		try {
			
			return sessionFactory.getCurrentSession()
						.createQuery(selectQuery, Address.class)
							.setParameter("clientId", clientId)
							.setParameter("shipping", true)
							.getResultList();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Address> listShippingAddresses(Client client) {
		String selectQuery = "FROM Address WHERE client = :client AND shipping = :shipping";
		
		try {
			
			return sessionFactory.getCurrentSession()
						.createQuery(selectQuery, Address.class)
							.setParameter("client", client)
							.setParameter("shipping", true)
							.getResultList();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean updateCart(Cart cart) {
		try {
			sessionFactory.getCurrentSession().update(cart);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
