package yvan.finalProject.DriverDrowsinessBackend.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;



@Entity
@DiscriminatorValue("Staff")

public class Staff extends User implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="passport_number")
	@ColumnDefault("'N/A'")
	private String passPortNumber;
	@Column(name="drivinglicense_number")
	private String  drivingLicense;
	
	public Staff() {
		
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

	@Override
	public String toString() {
		return "Driver [passPortNumber=" + passPortNumber + ", drivingLicense=" + drivingLicense + "]";
	}

	

	
	

}
