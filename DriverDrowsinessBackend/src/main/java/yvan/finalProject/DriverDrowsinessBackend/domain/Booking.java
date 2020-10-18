package yvan.finalProject.DriverDrowsinessBackend.domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.Id;


@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	@NotBlank(message= "please enter the origin of shipment !")
	@Column(name="origin")
	private String origin;
	@NotNull(message="please enter the date ofloading the shipment !")
	@Column(name="load_date")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date loadDate;
	@NotBlank(message="please enter the type of shipment !")
	@Column(name="typeOf_shipment")
	private String typeOfShipment;
	private String code;
	@Column(name="client")
	private int clientId;
	
	public Booking() {
		
		this.code = "KESIBK" + UUID.randomUUID().toString().substring(26).toUpperCase();
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}



	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Date getLoadDate() {
		return loadDate;
	}

	public void setLoadDate(Date loadDate) {
		this.loadDate = loadDate;
	}

	public String getTypeOfShipment() {
		return typeOfShipment;
	}

	public void setTypeOfShipment(String typeOfShipment) {
		this.typeOfShipment = typeOfShipment;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Booking [Id=" + Id + ", origin=" + origin + ", loadDate=" + loadDate + ", typeOfShipment="
				+ typeOfShipment + ", code=" + code + ", clientId=" + clientId + "]";
	}



	
	
	
}
