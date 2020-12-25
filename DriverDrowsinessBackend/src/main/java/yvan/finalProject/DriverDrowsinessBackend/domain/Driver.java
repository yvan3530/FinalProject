package yvan.finalProject.DriverDrowsinessBackend.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Driver  extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="passport_number")
	@ColumnDefault("'N/A'")
	@Size(min = 8, max = 8, message="The Passport Number must equal to 8")
	private String passPortNumber;
	@Column(name="drivinglicense_number")
	@Size(min = 16, max = 16, message="The Driving License Number must equal to 16")
	private String  drivingLicense;
	
	public Driver() {
		
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
	
	
	
}
