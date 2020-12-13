package yvan.finalProject.DriverDrowsinessBackend.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import yvan.finalProject.DriverDrowsinessBackend.dao.BookingDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.TruckDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Alert;
import yvan.finalProject.DriverDrowsinessBackend.domain.Booking;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;

public class TestAlert {
	
	private static AnnotationConfigApplicationContext context;
	private static TruckDao truckDAO;
	
	private Alert alert;
	private Freight freight;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("yvan.finalProject.DriverDrowsinessBackend");
		context.refresh();
		truckDAO = (TruckDao)context.getBean("truckDAO");

	}
	
	@Test
	public void testCRUDAlert() {

//		alert = truckDAO.getAlert(1);
		

}
}
