package yvan.finalProject.DriverDrowsinessBackend.dao;

import java.util.List;

import yvan.finalProject.DriverDrowsinessBackend.domain.Cart;
import yvan.finalProject.DriverDrowsinessBackend.domain.CartLine;

public interface CartLineDAO {
	
	public CartLine get(int Id);	
	public boolean add(CartLine cartLine);
	public boolean update(CartLine cartLine);
	public boolean delete(CartLine cartLine);
	public List<CartLine> list(int cartId);
	
	
	// other business method related to the cart lines
		public List<CartLine> listAvailable(int cartId);
		public CartLine getByCartAndTruck(int cartId, int truckId);
	

	boolean updateCart(Cart cart);	
}
