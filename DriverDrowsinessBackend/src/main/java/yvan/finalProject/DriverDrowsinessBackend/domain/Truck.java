package yvan.finalProject.DriverDrowsinessBackend.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;



@Entity
@Table(name="truck")
public class Truck {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int TruckId;
	@NotBlank(message= "please enter the origin of shipment !")
	private String kind;
	@NotBlank(message= "please enter the origin of shipment !")
	private String plate;
	@NotBlank(message= "please enter the origin of shipment !")
	private String brand;
	@Column(name="is_active")
	private boolean active = true;
	@Column(name="driver_id")
	private int driverId;

	@Transient
	private MultipartFile file;
	
	
	
	public MultipartFile getFile() {
		return file;
	}


	public void setFile(MultipartFile file) {
		this.file = file;
	}


	public Truck () {
		
	}


	public int getTruckId() {
		return TruckId;
	}


	public void setTruckId(int truckId) {
		TruckId = truckId;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public String getPlate() {
		return plate;
	}


	public void setPlate(String plate) {
		this.plate = plate;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	
	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public int getDriverId() {
		return driverId;
	}


	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}


	@Override
	public String toString() {
		return "Truck [TruckId=" + TruckId + ", kind=" + kind + ", plate=" + plate + ", brand=" + brand + ", active="
				+ active + ", driverId=" + driverId + "]";
	}

	
	
}
