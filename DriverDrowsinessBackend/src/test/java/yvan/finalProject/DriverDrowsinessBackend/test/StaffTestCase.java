package yvan.finalProject.DriverDrowsinessBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import yvan.finalProject.DriverDrowsinessBackend.dao.StaffDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;

public class StaffTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static StaffDao staffDAO;
	private Staff staff;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("yvan.finalProject.DriverDrowsinessBackend");
		context.refresh();
		staffDAO = (StaffDao)context.getBean("staffDAO");
	}
	
	@Test
	public void testCRUDStaff() {
//		staff =  new Staff();
//		staff.setName("kibibi egide");
//		staff.setEmail("egidekibi1@gmail.com");
//		staff.setPhoneNumber("785526263");
//		staff.setAddress("kigali kicukiro");
//		staff.setNationalId("11200484561");
//		
//		assertEquals("something went wrong ", true,staffDAO.addStaff(staff));
		
	//staff = staffDAO.get(3);
//		staff.setName("muhire yvan kd");
//		
//		assertEquals("something went wrong ", true,staffDAO.updateStaff(staff));
//		
		//assertEquals("something went wrong ", true,staffDAO.deleteStaff(staff));
		
		assertEquals("something went wrong ", 5,staffDAO.getStaffs().size());

	}
}
