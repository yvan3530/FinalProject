package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.ClientDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Address;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;


@Repository("clientDAO")
@Transactional
public class ClientDaoImpl implements ClientDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addClient(Client client) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(client);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateClient(Client client) {
		try {
			sessionFactory.getCurrentSession().update(client);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public void deleteClient(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = 
				currentSession.createQuery("delete from Client where userId=:clientId");
	
		theQuery.setParameter("clientId", theId);
		theQuery.executeUpdate();
	}

	@Override
	public List<Client> getClients() {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Client" ,Client.class)
							.getResultList();
	}

	@Override
	public Client get(int userId) {
		try {
			return sessionFactory.getCurrentSession().get(Client.class, Integer.valueOf(userId));
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
			//ex.printStackTrace();
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
	public Address getBillingAddress(int userId) {
		String selectQuery = "FROM Address WHERE userId = :userId AND billing = :billing";
		
		try {
			return sessionFactory.getCurrentSession()
						.createQuery(selectQuery, Address.class)
							.setParameter("userId", userId)
							.setParameter("billing", true)
							.getSingleResult();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
	}

	@Override
	public List<Address> listShippingAddresses(int userId) {
		
		String selectQuery = "FROM Address WHERE userId = :userId AND shipping = :shipping";
		
		try {
			
			return sessionFactory.getCurrentSession()
						.createQuery(selectQuery, Address.class)
							.setParameter("userId", userId)
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
		String selectQuery = "FROM Address WHERE client = :client AND billing = :billing";
		
		try {
			
			return sessionFactory.getCurrentSession()
						.createQuery(selectQuery, Address.class)
							.setParameter("client", client)
							.setParameter("billing", true)
							.getResultList();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}


	@Override
	public boolean addFreight(Freight freight) {
		
		try {
			sessionFactory.getCurrentSession().persist(freight);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}

}
