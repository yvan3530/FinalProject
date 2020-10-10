package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.StaffDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

@Repository("staffDAO")
@Transactional
public class StaffDaoImpl implements StaffDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addStaff(Staff staff) {
		try {
			sessionFactory.getCurrentSession()
							.persist(staff);
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
			sessionFactory.getCurrentSession()
							.update(staff);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteStaff(Staff staff) {
		try {
			sessionFactory.getCurrentSession()
							.delete(staff);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Staff> getStaffs() {
		
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Staff" , Staff.class)
						.getResultList();
	}

	@Override
	public Staff get(int staffId) {


		try {
			return sessionFactory.getCurrentSession().get(Staff.class, Integer.valueOf(staffId));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return null;
	}

}
