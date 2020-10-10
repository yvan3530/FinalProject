package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.DriverDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;

@Repository("driverDAO")
@Transactional
public class DriverDaoImpl implements DriverDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	

	@Override
	public boolean addDriver(Driver driver) {

		try {
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

		try {
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
		
		
		try {
			
			sessionFactory
				.getCurrentSession()
					.delete(driver);
			
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public Driver get(int DriverId) {

		try {
		return sessionFactory.getCurrentSession().get(Driver.class, Integer.valueOf(DriverId));
	}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Driver> getDrivers() {

		return sessionFactory
		.getCurrentSession()
			.createQuery("FROM Driver" ,Driver.class)
					.getResultList();
	}
	
	

}
