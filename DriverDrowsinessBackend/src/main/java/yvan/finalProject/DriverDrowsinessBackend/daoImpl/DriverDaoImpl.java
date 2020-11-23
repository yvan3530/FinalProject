package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
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
			sessionFactory.getCurrentSession().persist(driver);
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
	public boolean deleteDriver(Driver driver) {
		try{
			sessionFactory.getCurrentSession().delete(driver);
			return true;
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Driver> getDrivers() {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Driver" ,Driver.class)
							.getResultList();
	}

	@Override
	public Driver get(int UserId) {
		try {
			return sessionFactory.getCurrentSession().get(Driver.class, Integer.valueOf(UserId));
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
	public Address getBillingAddress(int UserId) {
String selectQuery = "FROM Address WHERE UserId = :UserId AND billing = :billing";
		
		try {
			return sessionFactory.getCurrentSession()
						.createQuery(selectQuery, Address.class)
							.setParameter("UserId", UserId)
							.setParameter("billing", true)
							.getSingleResult();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Address> listShippingAddresses(int UserId) {
String selectQuery = "FROM Address WHERE UserId = :UserId AND shipping = :shipping";
		
		try {
			
			return sessionFactory.getCurrentSession()
						.createQuery(selectQuery, Address.class)
							.setParameter("UserId", UserId)
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
