package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.hibernate.query.Query;

import yvan.finalProject.DriverDrowsinessBackend.dao.RouteDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;
import yvan.finalProject.DriverDrowsinessBackend.domain.Route;

@Repository("routeDAO")
@Transactional
public class RouteDaoImpl implements RouteDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addRoute(Route route) {

		try {
			sessionFactory.getCurrentSession().saveOrUpdate(route);
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
			sessionFactory.getCurrentSession().update(route);;
			return true;
		}
		catch(Exception ex) {
			
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public void deleteRoute(int theId) {
		
			
			Session currentSession = sessionFactory.getCurrentSession();
		
			Query theQuery = 
					currentSession.createQuery("delete from Route where id=:routeId");
		
			theQuery.setParameter("routeId", theId);
			theQuery.executeUpdate();
		
	}

	@Override
	public List<Route> getRoute() {
		return sessionFactory
				.getCurrentSession()
				.createQuery("FROM Route", Route.class)
				.getResultList();
	}

	@Override
	public Route get(int id) {
		try {
			return sessionFactory.getCurrentSession()
					.get(Route.class, Integer.valueOf(id));
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			return null;
	}

}
