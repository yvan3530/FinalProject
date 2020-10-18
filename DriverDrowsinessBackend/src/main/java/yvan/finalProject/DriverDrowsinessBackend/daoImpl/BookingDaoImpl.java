package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.BookingDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Booking;

@Repository("bookingDAO")
@Transactional
public class BookingDaoImpl implements BookingDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean booking(Booking booking) {
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
