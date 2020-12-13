package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.DriverDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Address;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;

@Repository("DriverDAO")
@Transactional
public class DriverDaoImpl implements DriverDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addDriver(Driver driver) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(driver);
			return true;
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateDriver(Driver driver) {
		try{
			sessionFactory.getCurrentSession().update(driver);
			return true;
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public void deleteDriver(int theId) {
Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = 
				currentSession.createQuery("delete from Driver where userId=:userId");
	
		theQuery.setParameter("driverId", theId);
		theQuery.executeUpdate();
	}

	@Override
	public List<Driver> getDrivers() {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Driver" ,Driver.class)
							.getResultList();
	}

	@Override
	public Driver get(int userId) {
		try {
			return sessionFactory.getCurrentSession().get(Driver.class, Integer.valueOf(userId));
		}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			return null;
	}

	@Override
	public Driver getByEmail(String email) {
		String selectQuery = "FROM Driver WHERE email = :email";		
		try {
			
			return sessionFactory.getCurrentSession()
					.createQuery(selectQuery,Driver.class)
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
	public List<Address> listShippingAddresses(Driver driver ) {
String selectQuery = "FROM Address WHERE driver = :driver AND billing = :billing";
		
		try {
			
			return sessionFactory.getCurrentSession()
						.createQuery(selectQuery, Address.class)
							.setParameter("driver", driver)
							.setParameter("billing", true)
							.getResultList();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
