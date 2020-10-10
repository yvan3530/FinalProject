package yvan.finalProject.DriverDrowsinessBackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="car_id")
	private int car_id;
	@Column(name="plate")
	private String carPlateNumber;
	@Column(name="brand")
	private String brand;
//	@Column(name="driver_id")
//	private int driver;
	
	@OneToOne
	private Driver driver;
	public Car() {
			
		}


	public int getCar_id() {
		return car_id;
	}


	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}


	public String getCarPlateNumber() {
		return carPlateNumber;
	}


	public void setCarPlateNumber(String carPlateNumber) {
		this.carPlateNumber = carPlateNumber;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}





	public Driver getDriver() {
		return driver;
	}


	public void setDriver(Driver driver) {
		this.driver = driver;
	}


	@Override
	public String toString() {
		return "Car [car_id=" + car_id + ", carPlateNumber=" + carPlateNumber + ", brand=" + brand + ", driver="
				+ driver + "]";
	}


	


	

}
