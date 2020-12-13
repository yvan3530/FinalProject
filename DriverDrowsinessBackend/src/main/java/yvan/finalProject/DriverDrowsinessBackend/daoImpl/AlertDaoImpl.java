package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.AlertDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.TruckDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Alert;

@Repository("alertDAO")
@Transactional
public class AlertDaoImpl implements AlertDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Alert> getAlerts() {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Alert" ,Alert.class)
						.getResultList();
	}

	@Override
	public Alert getAlert(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Alert.class, Integer.valueOf(id));
		}
			catch(Exception ex) {
				ex.printStackTrace();
			}
				return null;
	}
}
