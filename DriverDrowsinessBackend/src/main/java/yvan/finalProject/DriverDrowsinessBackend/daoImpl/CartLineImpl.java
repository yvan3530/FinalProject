package yvan.finalProject.DriverDrowsinessBackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import yvan.finalProject.DriverDrowsinessBackend.dao.CartLineDAO;
import yvan.finalProject.DriverDrowsinessBackend.domain.Cart;
import yvan.finalProject.DriverDrowsinessBackend.domain.CartLine;

@Repository("cartLineDAO")
@Transactional
public class CartLineImpl implements CartLineDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public CartLine get(int Id) {
		return sessionFactory.getCurrentSession().get(CartLine.class, Id);
	}

	@Override
	public boolean add(CartLine cartLine) {
		try {
			sessionFactory.getCurrentSession().persist(cartLine);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(CartLine cartLine) {
		try {
			sessionFactory.getCurrentSession().update(cartLine);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(CartLine cartLine) {
		try {
			sessionFactory.getCurrentSession().delete(cartLine);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<CartLine> list(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CartLine> listAvailable(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartLine getByCartAndTruck(int cartId, int truckId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCart(Cart cart) {
		try {
			sessionFactory.getCurrentSession().update(cart);
			return true;
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
