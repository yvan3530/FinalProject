package yvan.finalProject.DriverDrowsinessBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import yvan.finalProject.DriverDrowsinessBackend.dao.DriverDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Driver;

public class DriverTestCase {
	
	private static AnnotationConfigApplicationContext context;

	private static DriverDao driverDAO;
	private Driver driver;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("yvan.finalProject.DriverDrowsinessBackend");
		context.refresh();
		driverDAO = (DriverDao)context.getBean("driverDAO");
	}
	
	@Test
	public void testCRUDDriver() {
//		driver = new Driver();
//		driver.setAddress("kicukiro gatenga");
//		driver.setDrivingLicense("789564123");
//		driver.setEmail("kokloMuhire@gmail.com");
//		driver.setName("koklo mihj");
//		driver.setPassPortNumber("3458796212");
//		driver.setPhoneNumber("722577119");
//		driver.setStaffId(1);
//		
//		assertEquals("something went wrong ", true,driverDAO.addDriver(driver));

		driver = driverDAO.get(6);
//		driver.setName("uwase arley");
//
//		assertEquals("something went wrong ", true,driverDAO.updateDriver(driver));
//		
		assertEquals("something went wrong ", true,driverDAO.deleteDriver(driver));

		//assertEquals("something went wrong ", 2,driverDAO.getDrivers().size());
	}

}
