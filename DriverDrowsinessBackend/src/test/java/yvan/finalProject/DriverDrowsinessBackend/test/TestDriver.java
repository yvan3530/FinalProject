package yvan.finalProject.DriverDrowsinessBackend.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.assertEquals;

import yvan.finalProject.DriverDrowsinessBackend.dao.ClientDao;
//import yvan.finalProject.DriverDrowsinessBackend.dao.DriverDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.TruckDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Address;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Staff;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

public class TestDriver {
	
	private static AnnotationConfigApplicationContext context;
	private static ClientDao clientDAO;
	
	private Client client;
	private Address address;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("yvan.finalProject.DriverDrowsinessBackend");
		context.refresh();
		clientDAO = (ClientDao)context.getBean("clientDAO");

	}
	
	@Test
	public void testCRUDdriver() {
		
		client = new Client();
		client.setAddress("kicukiro");
		client.setEmail("kibibiegi1@gmail.com");
		client.setEnabled(true);
		client.setFirstName("kibibi");
		client.setLastName("egide");
		client.setPassword("ert5452");
		client.setRole("USER");
		client.setTelePhone("785526263");
		
		
		assertEquals("something went wrong ", true,clientDAO.addClient(client));
		
		address = new Address();
		address.setBilling(true);
		address.setCity("kigaki");
		address.setCountry("rwanda");
		address.setPostCode("541");
		address.setShipping(false);
		address.setClientId(client.getUserId());
		
		assertEquals("something went wrong ", true,clientDAO.addAddress(address));
		
//		driver = driverDAO.get(3);
//		driver.setPassword("kiki21212");
//		
//		assertEquals("something went wrong ", true,driverDAO.updateDriver(driver));
//		driver = driverDAO.get(4);
//		assertEquals("something went wrong ", true,driverDAO.deleteDriver(driver));
		
		
		
		
//		
//		staff = new Staff();
//		staff.setDrivingLicense("788454");
//		staff.setEmail("muhiyvan35@iwac.com");
//		staff.setEnabled(true);
//		staff.setFirstName("muhire");
//		staff.setLastName("yvan");
//		staff.setPassPortNumber("12596");
//		staff.setPassword("51451");
//		staff.setRole("ADMIN");
//		staff.setTelePhone("151");
//		
//		assertEquals("something went wrong ", true,driverDAO.addDriver(staff));
//		
	}
}
