package yvan.finalProject.DriverDrowsinessBackend.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Route implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)	
	@JoinColumn(name="driver")
	private Driver driver;
	
	@ManyToOne(fetch = FetchType.EAGER)	
	@JoinColumn(name="truck")
	private Truck truck;
	
	@OneToMany(mappedBy = "route",fetch = FetchType.EAGER)
	private  List<Freight> freights;
	
	@Column(nullable = true)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date departTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = true)
	private Date arrivalTime;
	
	private String departLocation;
	private String arrivalLocation;
	private RouteStatus status = RouteStatus.pending;
	
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Truck getTruck() {
		return truck;
	}
	public void setTruckId(Truck truckId) {
		this.truck = truckId;
	}
	public List<Freight> getFreights() {
		return freights;
	}
	public void setTruck(Truck truck) {
		this.truck = truck;
	}
	public void setFreights(List<Freight> freights) {
		this.freights = freights;
	}
	public Date getDepartTime() {
		return departTime;
	}
	public void setDepartTime(Date departTime) {
		this.departTime = departTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
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
	public RouteStatus getStatus() {
		return status;
	}
	public void setStatus(RouteStatus status) {
		this.status = status;
	}
	
	
	
	
	

}
