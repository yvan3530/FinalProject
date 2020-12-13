package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.FreightDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Booking;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;


@Repository("freightDAO")
@Transactional
public class FreightDaoImpl implements FreightDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addFreight(Freight freight) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(freight);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateFreight(Freight freight) {
		try {
			sessionFactory.getCurrentSession().update(freight);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public void deleteFreight(int theId) {
Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = 
				currentSession.createQuery("delete from Freight where freightId=:freightId");
	
		theQuery.setParameter("freightId", theId);
		theQuery.executeUpdate();
	}

	@Override
	public List<Freight> getFreights() {
		return sessionFactory
				.getCurrentSession()
				.createQuery("FROM Freight", Freight.class)
				.getResultList();
	}

	@Override
	public Freight get(int freightId) {
		try {
			return sessionFactory.getCurrentSession()
					.get(Freight.class, Integer.valueOf(freightId));
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			return null;
	}

	@Override
	public List<Freight> listActiveFreights() {
		String selectActiveFreights= "FROM Freight WHERE active = :active";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveFreights, Freight.class)
						.setParameter("active", true)
							.getResultList();
		
	}

	@Override
	public List<Freight> listActiveByClient(int userId) {
		String selectActiveProductsByClient = "FROM Freight WHERE active = :active AND userId = :userId";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveProductsByClient, Freight.class)
						.setParameter("active", true)
							.setParameter("userId" ,userId)
								.getResultList();
	}

	@Override
	public List<Freight> getLatestActiveFreights(int count) {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Freight WHERE active = :active ORDER BY id", Freight.class)
						.setParameter("active", true)
							.setFirstResult(0)
								.setMaxResults(count)
									.getResultList();
	}

	@Override
	public boolean addBooking(Booking booking) {
		try {
			sessionFactory.getCurrentSession().persist(booking);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
