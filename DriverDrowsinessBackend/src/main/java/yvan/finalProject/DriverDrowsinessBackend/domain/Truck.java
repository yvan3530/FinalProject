package yvan.finalProject.DriverDrowsinessBackend.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="truck")
public class Truck implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int truckId;
	@NotBlank(message= "please enter the origin of shipment !")
	private String kind;
	@NotBlank(message= "please enter the origin of shipment !")
	private String plate;
	@NotBlank(message= "please enter the origin of shipment !")
	private String brand;
	@Column(name="is_active")
	private boolean active = true;
	
	@OneToMany(mappedBy = "truck",fetch = FetchType.EAGER)
	private  List<Route> routes;
	
//	@OneToMany(mappedBy = "trucks",fetch = FetchType.EAGER)
//	private  List<Alert> alert;
//	
//
//
//	public List<Alert> getAlert() {
//		return alert;
//	}
//
//
//	public void setAlert(List<Alert> alert) {
//		this.alert = alert;
//	}


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
		return truckId;
	}


	public void setTruckId(int truckId) {
		this.truckId = truckId;
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


	public List<Route> getRoutes() {
		return routes;
	}


	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}


	





	
	
	

}
