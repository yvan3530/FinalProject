package yvan.finalProject.DriverDrowsinessBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import yvan.finalProject.DriverDrowsinessBackend.dao.ClientDao;
import yvan.finalProject.DriverDrowsinessBackend.domain.Client;

public class ClientTestCase {
	
	private static AnnotationConfigApplicationContext context;

	private static ClientDao clientDAO;
	private Client client;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("yvan.finalProject.DriverDrowsinessBackend");
		context.refresh();
		clientDAO = (ClientDao)context.getBean("clientDAO");
	}
	
	@Test
	public void testCRUDClient() {
		
//		client = new Client();
//		client.setAddress("kanombe");
//		client.setEmail("umukirere@gmail.com");
//		client.setName( "kalima vick");
//		client.setTelePhone("78941254");
//	
//		assertEquals("something went wrong ", true,clientDAO.addClient(client));

		
//		client = clientDAO.get(2);
//		client.setEmail("nkurunzizaBo12@gmail.com");
//
//		assertEquals("something went wrong ", true,clientDAO.updateClient(client));
		
//		assertEquals("something went wrong ", true,clientDAO.deleteClient(client));

		assertEquals("something went wrong ", 1,clientDAO.getClients().size());
		
	}

}
