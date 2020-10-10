package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.ClientDao;
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

}
