package yvan.finalProject.DriverDrowsinessBackend.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name = "cart_line")
public class CartLine {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@OneToOne
	private Truck truck;
	
	@Column(name= "cart_Id")
	private int cartId;
	@Column(name= "truck_count")
	private double truckCount;
	@Column(name= "is_available")
	private boolean available = true;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Truck getTruck() {
		return truck;
	}
	public void setTruck(Truck truck) {
		this.truck = truck;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getTruckCount() {
		return truckCount;
	}
	public void setTruckCount(double truckCount) {
		this.truckCount = truckCount;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "CartLine [Id=" + Id + ", truckCount=" + truckCount + ", available=" + available + "]";
	}
	
	

}
