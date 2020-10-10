package yvan.finalProject.DriverDrowsinessBackend.entity;

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

@Entity
@Table(name="driver")
public class Driver {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="driver_id")
	private  int driver_id;
    @Column(name="name")
	private String name;
    @Column(name="phone")
	private int phoneNumber;
    @Column(name="email")
	private String email;
    
    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    private Car car;

	public Driver() {
	
	}

	public int getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(int driver_id) {
		this.driver_id = driver_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Driver [driver_id=" + driver_id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", car=" + car + "]";
	}

	


	
	



}
