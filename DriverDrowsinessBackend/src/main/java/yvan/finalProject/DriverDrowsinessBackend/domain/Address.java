package yvan.finalProject.DriverDrowsinessBackend.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Table(name="address")
public class Address implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	@NotBlank(message= "Please enter the country!")
	private String country;
	@NotBlank(message= "Please enter the city!")
	private String city;
	@NotBlank(message= "Please enter the postCode!")
	private String postCode;
	@Column(name = "is_shipping")
	private boolean shipping;
	@Column(name="client")
	private int clientId;
	
	@Column(name = "is_billing")
	private boolean billing;
	
	
	public Address() {
		
	}




	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPostCode() {
		return postCode;
	}


	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}


	public boolean isShipping() {
		return shipping;
	}


	public void setShipping(boolean shipping) {
		this.shipping = shipping;
	}



	public boolean isBilling() {
		return billing;
	}


	public void setBilling(boolean billing) {
		this.billing = billing;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public int getClientId() {
		return clientId;
	}


	public void setClientId(int clientId) {
		this.clientId = clientId;
	}


	@Override
	public String toString() {
		return "Address [Id=" + Id + ", country=" + country + ", city=" + city + ", postCode=" + postCode
				+ ", shipping=" + shipping + ", clientId=" + clientId + ", billing=" + billing + "]";
	}


	
	
	
	

}
