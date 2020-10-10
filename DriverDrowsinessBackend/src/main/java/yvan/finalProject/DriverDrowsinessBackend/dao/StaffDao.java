package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;
import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;

public interface StaffDao {
	
	boolean addStaff(Staff staff);
	boolean updateStaff(Staff staff);
	boolean deleteStaff(Staff staff);

	List<Staff> getStaffs();
	Staff get(int staffId);
}
