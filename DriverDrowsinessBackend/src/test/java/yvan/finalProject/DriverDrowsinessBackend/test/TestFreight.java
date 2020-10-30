package yvan.finalProject.DriverDrowsinessBackend.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.assertEquals;
import yvan.finalProject.DriverDrowsinessBackend.dao.ClientDao;
import yvan.finalProject.DriverDrowsinessBackend.dao.FreightDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;
import yvan.finalProject.DriverDrowsinessBackend.domain.Freight;



public class TestFreight {
	
private static AnnotationConfigApplicationContext context;
	
	
	//private Client client = null;
	private Freight freight = null;
	//private static ClientDao clientDAO ;
	private static FreightDao freightDAO;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("yvan.finalProject.DriverDrowsinessBackend");
		context.refresh();
		//clientDAO = (ClientDao)context.getBean("clientDAO");
		freightDAO = (FreightDao)context.getBean("freightDAO");

	}
	
	@Test
	public void testCRUDFreight() {
		
//		client = new Client();
//		client.setEmail("songakevi@gmail.com");
//		client.setEnabled(true);
//		client.setFirstName("songa");
//		client.setLastName("kevin");
//		client.setPassword("123354");
//		client.setRole("USER");
//		client.setTelePhone("7814682424");
//		
//		
//		assertEquals("something went wrong ", true,clientDAO.addClient(client));
//		
//		
		freight = new Freight();
//		freight.setActive(true);
//		freight.setCategory("fisrt");
//		freight.setClient(client);
//		freight.setPackageDescription("fragire");
//		freight.setPackageLenght(15.2f);
//		freight.setPackageWeight(900.5f);
//		freight.setPackagewidth(9.5f);
//		freight.setTypeOfPackage("woods");
//		
//		assertEquals("something went wrong ", true,clientDAO.addFreight(freight));
//		
		freight = freightDAO.get(1);
		freight.setPackageWeight(1000.5f);
		assertEquals("something went wrong ", true,freightDAO.updateFreight(freight));
		
	}

}
