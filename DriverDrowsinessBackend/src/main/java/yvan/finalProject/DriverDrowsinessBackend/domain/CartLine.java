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

}
