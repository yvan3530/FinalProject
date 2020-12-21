package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.StaffDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Route;
import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

@Repository("staffDAO")
@Transactional
public class StaffDaoImpl implements StaffDao {

	@Autowired
	private SessionFactory sessionFactory;
	


	@Override
	public Staff getByEmail(String email) {
		String selectQuery = "FROM Staff WHERE email = :email";		
		try {
			
			return sessionFactory.getCurrentSession()
					.createQuery(selectQuery,Staff.class)
					.setParameter("email", email)
					.getSingleResult();
	}
		catch(Exception ex) {
			
			return null;
			}

}

	@Override
	public boolean addTruck(Truck truck) {
		try {
			sessionFactory.getCurrentSession().persist(truck);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
}
	
	@Override
	public boolean updateTruck(Truck truck) {
		try {
			sessionFactory.getCurrentSession().update(truck);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteTruck(Truck truck) {
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
	public Truck getTruck(int truckId) {
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

	@Override
	public boolean addStaff(Staff staff) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(staff);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateStaff(Staff staff) {
		try {
			sessionFactory.getCurrentSession().update(staff);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public void deleteStaff(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
	
		Query theQuery = 
				currentSession.createQuery("delete from Staff where userId=:userId");
	
		theQuery.setParameter("userId", theId);
		theQuery.executeUpdate();
	}

	@Override
	public List<Staff> getStaffs() {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Staff" ,Staff.class)
							.getResultList();
	}

	@Override
	public Staff get(int userId) {
		try {
			return sessionFactory.getCurrentSession().get(Staff.class, Integer.valueOf(userId));
		}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			return null;
	}

	@Override
	public boolean addRoute(Route route) {
		try {
			sessionFactory.getCurrentSession().persist(route);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateRoute(Route route) {
		try {
			sessionFactory.getCurrentSession().update(route);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteRoute(Route route) {
		try {
			sessionFactory.getCurrentSession().delete(route);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	}

