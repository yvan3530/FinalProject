package yvan.finalProject.DriverDrowsinessBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import yvan.finalProject.DriverDrowsinessBackend.dao.FreightDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;

public class FreightTestCase {
	
	private static AnnotationConfigApplicationContext context;

	private static FreightDao freightDAO;
	private Freight freight;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("yvan.finalProject.DriverDrowsinessBackend");
		context.refresh();
		freightDAO = (FreightDao)context.getBean("freightDAO");
	}
	
	@Test
	public void testCRUDFreight() {
		
//	freight = new Freight();
//		freight.setCategory("one");
//		freight.setClientId(1);
//		freight.setPackageDescription("lap");
//		freight.setPackageLenght(21.2f);
//		freight.setPackageWeight(250.4f);
//		freight.setPackagewidth(15f);
//		freight.setTruckId(5);
//	freight.setTypeOfPackage("paper");
//	
//		assertEquals("something went wrong ", true,freightDAO.addFreight(freight));
//		
		
		freight = freightDAO.get(2);
//		freight.setCategory("flagire");
//
//		assertEquals("something went wrong ", true,freightDAO.updateFreight(freight));
//		
		assertEquals("something went wrong ", true,freightDAO.deleteFreight(freight));

		
	}

}
