package yvan.finalProject.DriverDrowsinessBackend.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="freight")
public class Freight implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int freightId;
	@Column(name="description")
	private String packageDescription;
	@Column(name="weight")
	private float packageWeight;
	@Column(name="lenght")
	private float packageLenght;
	@Column(name="width")
	private float packagewidth;
	@Column(name="type")
	private String typeOfPackage;
	@Column(name="category")
	private String category;
	@Column(name="is_active")
	private boolean active = true;
	@Column(name="truck")
	private int truckId;
	
	public Freight() {
		
	}

	public int getFreightId() {
		return freightId;
	}

	public void setFreightId(int freightId) {
		this.freightId = freightId;
	}

	public String getPackageDescription() {
		return packageDescription;
	}

	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}

	public float getPackageWeight() {
		return packageWeight;
	}

	public void setPackageWeight(float packageWeight) {
		this.packageWeight = packageWeight;
	}

	public float getPackageLenght() {
		return packageLenght;
	}

	public void setPackageLenght(float packageLenght) {
		this.packageLenght = packageLenght;
	}

	public float getPackagewidth() {
		return packagewidth;
	}

	public void setPackagewidth(float packagewidth) {
		this.packagewidth = packagewidth;
	}

	public String getTypeOfPackage() {
		return typeOfPackage;
	}

	public void setTypeOfPackage(String typeOfPackage) {
		this.typeOfPackage = typeOfPackage;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	@Override
	public String toString() {
		return "Freight [freightId=" + freightId + ", packageDescription=" + packageDescription + ", packageWeight="
				+ packageWeight + ", packageLenght=" + packageLenght + ", packagewidth=" + packagewidth
				+ ", typeOfPackage=" + typeOfPackage + ", category=" + category + ", active=" + active + ", truckId="
				+ truckId + "]";
	}

	

	

	

}
