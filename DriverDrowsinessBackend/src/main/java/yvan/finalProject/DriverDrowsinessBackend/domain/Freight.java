package yvan.finalProject.DriverDrowsinessBackend.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="client")
	private Client client;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="route")
	private  Route route;
	
	private double price;
	private FreightStatus status;
	@Column(nullable = true)
	private Date departTime;
	

	private String departLocation;
	private String arrivalLocation;
	
	private String transportation;
	private String addictional;
	
	
	
	
	public String getAddictional() {
		return addictional;
	}

	public void setAddictional(String addictional) {
		this.addictional = addictional;
	}

	public String getTransportation() {
		return transportation;
	}

	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}

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

	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public FreightStatus getStatus() {
		return status;
	}

	public void setStatus(FreightStatus status) {
		this.status = status;
	}

	public Date getDepartTime() {
		return departTime;
	}

	public void setDepartTime(Date departTime) {
		this.departTime = departTime;
	}


	public String getDepartLocation() {
		return departLocation;
	}

	public void setDepartLocation(String departLocation) {
		this.departLocation = departLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}
	

	

	

	

}
