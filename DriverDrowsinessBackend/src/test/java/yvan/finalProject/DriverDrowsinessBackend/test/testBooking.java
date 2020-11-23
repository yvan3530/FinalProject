package yvan.finalProject.DriverDrowsinessBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import yvan.finalProject.DriverDrowsinessBackend.dao.BookingDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Booking;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;


public class testBooking {
	
	private static AnnotationConfigApplicationContext context;
	private static BookingDao bookingDAO;
	
	private Booking booking;
	private Freight freight;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("yvan.finalProject.DriverDrowsinessBackend");
		context.refresh();
		bookingDAO = (BookingDao)context.getBean("bookingDAO");

	}
	
	@Test
	public void testCRUDbooking() {
		
		booking = new Booking();
		booking.setOrigin("kigali");
		booking.setTypeOfShipment("bulk");
		assertEquals("something went wrong ", true,bookingDAO.addBooking(booking));
	}
		

}
