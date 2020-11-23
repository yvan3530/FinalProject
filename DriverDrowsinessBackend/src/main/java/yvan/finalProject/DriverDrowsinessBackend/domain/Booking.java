package yvan.finalProject.DriverDrowsinessBackend.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="booking")
public class Booking implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
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
	@ManyToOne(fetch = FetchType.EAGER)
	private Freight freight;
	
	 
	
	
	
	public Booking() {
		
		this.code = "KESIBK" + UUID.randomUUID().toString().substring(26).toUpperCase();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Freight getFreight() {
		return freight;
	}

	public void setFreight(Freight freight) {
		this.freight = freight;
	}



	
	


	
	
	

}
