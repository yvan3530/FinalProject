package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Route;

public interface RouteDao {

	boolean addRoute(Route route);
	boolean updateRoute(Route route);
	public void deleteRoute(int theId);
	
	List<Route>getRoute();
	public Route get(int id);
}
