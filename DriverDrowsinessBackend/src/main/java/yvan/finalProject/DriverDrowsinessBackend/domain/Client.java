package yvan.finalProject.DriverDrowsinessBackend.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int clientId;
	private String name;
	private String address;
	private String telePhone;
	private String email;
	@OneToOne(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Cart cart;
	
	public Client() {
		
	}

	

	public int getClientId() {
		return clientId;
	}



	public void setClientId(int clientId) {
		this.clientId = clientId;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public String getTelePhone() {
		return telePhone;
	}

	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}

	public Cart getCart() {
		return cart;
	}



	public void setCart(Cart cart) {
		this.cart = cart;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", address=" + address + ", telePhone=" + telePhone
				+ ", email=" + email + "]";
	}

	
	
}
