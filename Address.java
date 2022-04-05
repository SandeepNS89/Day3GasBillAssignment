package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address_tbl1")
public class Address {

	@Id
	//@GeneratedValue
	@Column(name="adrs_no")
	private int addressId;
	
	@Column(name="adrs_street",length=20)
	private String street;
	
	@Column(name="adrs_city",length=20)
	private String city;
	
	@Column(name="adrs_state",length=20)
	private String state;
	
	@Column(name="adrs_country",length=20)
	private String country;
	
	@Column(name="adrs_pin",length=20)
	private int pin;
	
	@ManyToOne
	@JoinColumn(name="empno")
	Employee emp;

	public Address(int addressId, String street, String city, String state, String country, int pin, Employee emp) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
		this.emp = emp;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
}

