package yvan.finalProject.DriverDrowsinessBackend.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="user")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name="DTYPE",discriminatorType=DiscriminatorType.STRING)
public abstract class User implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int UserId;
	@Column(name="first_name")
	@NotBlank(message= "Please enter the First name!")
	private String firstName;
	@Column(name="last_name")
	@NotBlank(message= "Please enter the Last name!")
	private String lastName;
	@NotBlank(message= "Please enter the email!")
	private String email;
	@NotBlank(message= "Please enter the Telephone!")
	private String telePhone;
	@NotBlank(message= "Please enter the Address!")
	private String address;
	@NotBlank(message= "Please enter the role!")
	private String role;
	@NotBlank(message= "Please enter the password!")
	private String password;
	private boolean enabled = true;
	
	@Transient
	private String confirmPassword;
	
	public User() {
		
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelePhone() {
		return telePhone;
	}

	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", telePhone=" + telePhone + ", address=" + address + ", role=" + role + ", password=" + password
				+ ", enabled=" + enabled + "]";
	}

	
	
	

}
