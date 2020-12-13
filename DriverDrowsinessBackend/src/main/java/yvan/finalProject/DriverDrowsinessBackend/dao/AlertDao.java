package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Alert;

public interface AlertDao {

	List<Alert> getAlerts();
	Alert getAlert(int id);
}
