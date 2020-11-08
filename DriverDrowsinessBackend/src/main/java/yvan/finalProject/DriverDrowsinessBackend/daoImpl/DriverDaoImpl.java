package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import yvan.finalProject.DriverDrowsinessBackend.dao.DriverDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;

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
			ex.printStackTrace();
			return null;
			}
	}

}
