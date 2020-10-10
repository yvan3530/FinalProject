package yvan.finalProject.DriverDrowsinessBackend.test;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import yvan.finalProject.DriverDrowsinessBackend.dao.TruckDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

public class TruckTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static TruckDao TruckDAO;
	
	private Truck truck;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("yvan.finalProject.DriverDrowsinessBackend");
		context.refresh();
		TruckDAO = (TruckDao)context.getBean("TruckDAO");
	}
	
	@Test
	public void testCRUDTruck() {
		
//		truck = new Truck();
//		truck.setActive(true);
//		truck.setBrand("toyota");
//		truck.setKind("single");
//		truck.setPlate("RAA452");
//		truck.setDriverId(6);
//		assertEquals("something went wrong ", true,TruckDAO.add(truck));

		
//		truck = TruckDAO.get(5);
//		truck.setPlate("RAB 770");
//	
//		assertEquals("something went wrong ", true,TruckDAO.update(truck));
//		
//		assertEquals("something went wrong ", true,TruckDAO.delete(truck));
		
//		assertEquals("something went wrong ", 2,TruckDAO.getTrucks().size());
		
	}
		@Test
		public void testlistActiveTrucks() {
		assertEquals("something went wrong ", 1,TruckDAO.listActiveTrucks().size());
		}
		
		
		@Test
		public void TestlistActiveByDriver() {
		assertEquals("something went wrong ", 1,TruckDAO.listActiveByDriver(6).size());


	}
		@Test
		public void TestgetLatestActiveTrucks() {
		assertEquals("something went wrong ", 1,TruckDAO.getLatestActiveTrucks(2).size());

}
}
