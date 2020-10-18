package yvan.finalProject.DriverDrowsinessBackend.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	@Column(name="cart_line")
	private String cartLine;
	
	
	@OneToOne
	private Client client; 
	
	public Cart() {
		
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCartLine() {
		return cartLine;
	}
	public void setCartLine(String cartLine) {
		this.cartLine = cartLine;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Cart [Id=" + Id + ", cartLine=" + cartLine + ", client=" + client + "]";
	}
	
	
	

}
