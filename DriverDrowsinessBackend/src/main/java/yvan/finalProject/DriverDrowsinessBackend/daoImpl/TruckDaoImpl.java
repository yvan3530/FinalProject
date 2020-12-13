package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.TruckDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Alert;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

@Repository("truckDAO")
@Transactional
public class TruckDaoImpl implements TruckDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean add(Truck truck) {
		try {
						sessionFactory.getCurrentSession().saveOrUpdate(truck);
						return true;
					} catch (Exception ex) {
						ex.printStackTrace();
						return false;
					}
	}

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
	public void delete(int theId) {
		Truck truck = new Truck();
		 truck.setActive(false);
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = 
				currentSession.createQuery("delete from Truck where truckId=:truckId");
	
		theQuery.setParameter("truckId", theId);
		theQuery.executeUpdate();
	}

	@Override
	public List<Truck> getTrucks() {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Truck" ,Truck.class)
						.getResultList();
	
	}

	@Override
	public Truck get(int truckId) {
		try {
			return sessionFactory.getCurrentSession().get(Truck.class, Integer.valueOf(truckId));
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
	public List<Truck> listActiveByDriver(int userId) {
		String selectActiveProductsByDriver = "FROM Truck WHERE active = :active AND userId = :userId";
		return sessionFactory
				.getCurrentSession()
				.createQuery(selectActiveProductsByDriver, Truck.class)
						.setParameter("active", true)
							.setParameter("userId" ,userId)
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

//	@Override
//	public List<Alert> getAlert() {
//		return sessionFactory
//				.getCurrentSession()
//					.createQuery("FROM Alert" ,Alert.class)
//						.getResultList();
//	}
//
//	@Override
//	public Alert getAlert(int truck) {
//		try {
//			return sessionFactory.getCurrentSession().get(Alert.class, Integer.valueOf(truck));
//		}
//			catch(Exception ex) {
//				ex.printStackTrace();
//			}
//				return null;
//	}
//	
//	
	

}
