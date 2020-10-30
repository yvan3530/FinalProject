package yvan.finalProject.DriverDrowsinessBackend.test;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import yvan.finalProject.DriverDrowsinessBackend.dao.StaffDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

public class TestStaff {
	
private static AnnotationConfigApplicationContext context;
	
	private static StaffDao staffDAO;
	private Staff staff;
	private Truck truck;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("yvan.finalProject.DriverDrowsinessBackend");
		context.refresh();
		staffDAO = (StaffDao)context.getBean("staffDAO");
	}
	
	@Test
	public void testCRUDStaff() {
		
		
		
		staff = new Staff();
//		staff.setEmail("kiki@gmail.com");
//		staff.setEnabled(true);
//		staff.setFirstName("kiki");
//		staff.setLastName("koko");
//		staff.setPassword("564648");
//		staff.setRole("ADMIN");
//		staff.setTelePhone("5465465");
//		staff.setAddress("Kigali/rwanda");
//		staff.setDrivingLicense("51351351351");
//		staff.setPassPortNumber("pas122");
//												
//		assertEquals("something went wrong ", true,staffDAO.addStaff(staff));
//		
//		truck = new Truck();
//		truck.setActive(true);
//		truck.setBrand("fiate");
//		truck.setKind("full");
//		truck.setPlate("RAA122Z");
//		truck.setStaffId(12);
//		assertEquals("something went wrong ", true,staffDAO.addTruck(truck));
//		
		staff = staffDAO.get(12);
		staff.setEmail("muhiyvan35@gmail.com");
		assertEquals("something went wrong ", true,staffDAO.updateStaff(staff));
	}
}
