package yvan.finalProject.DriverDrowsinessBackend.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="driver")
public class Driver {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int DriverId;
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	@Column(name="passport_number")
	private String passPortNumber;
	@Column(name="drivinglicense_number")
	private String  drivingLicense;
	@Column(name="staff_id")
	private int staffId;
	
	public Driver() {
		
	}

	public int getDriverId() {
		return DriverId;
	}

	public void setDriverId(int driverId) {
		DriverId = driverId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassPortNumber() {
		return passPortNumber;
	}

	public void setPassPortNumber(String passPortNumber) {
		this.passPortNumber = passPortNumber;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	@Override
	public String toString() {
		return "Driver [DriverId=" + DriverId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", address=" + address + ", passPortNumber=" + passPortNumber + ", drivingLicense=" + drivingLicense
				+ ", staffId=" + staffId + "]";
	}

		
	
}
