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
	@Column(name="staff")
	private int StaffId;

	
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


	public int getStaffId() {
		return StaffId;
	}


	public void setStaffId(int staffId) {
		StaffId = staffId;
	}


	@Override
	public String toString() {
		return "Truck [TruckId=" + TruckId + ", kind=" + kind + ", plate=" + plate + ", brand=" + brand + ", active="
				+ active + ", StaffId=" + StaffId + ", file=" + file + "]";
	}





	
	
	

}
