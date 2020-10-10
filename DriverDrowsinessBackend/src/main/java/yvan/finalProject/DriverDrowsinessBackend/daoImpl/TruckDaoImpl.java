package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import yvan.finalProject.DriverDrowsinessBackend.dao.TruckDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

@Repository("TruckDAO")
@Transactional
public class TruckDaoImpl implements TruckDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean update(Truck truck) {

		try {

			sessionFactory.getCurrentSession().update(truck);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Truck truck) {

		truck.setActive(false);
		try {

			sessionFactory.getCurrentSession().update(truck);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Truck> getTrucks() {
		
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Truck" ,Truck.class)
						.getResultList();
	}

	@Override
	public Truck get(int TruckId) {
		try {
		return sessionFactory.getCurrentSession().get(Truck.class, Integer.valueOf(TruckId));
	}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Truck> listActiveTrucks() {
		String selectActiveProducts = "FROM Truck WHERE active = :active";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveProducts, Truck.class)
						.setParameter("active", true)
							.getResultList();
				
	}

	

	@Override
	public List<Truck> getLatestActiveTrucks(int count) {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Truck WHERE active = :active ORDER BY id", Truck.class)
						.setParameter("active", true)
							.setFirstResult(0)
								.setMaxResults(count)
									.getResultList();
	}

	@Override
	public boolean add(Truck truck) {
		try {
			sessionFactory
				.getCurrentSession()
					.persist(truck);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;

		}
	}

	@Override
	public List<Truck> listActiveByDriver(int driverId) {

		String selectActiveProductsByDriver = "FROM Truck WHERE active = :active AND driverId = :driverId";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveProductsByDriver, Truck.class)
						.setParameter("active", true)
							.setParameter("driverId" ,driverId)
								.getResultList();
	}

}
