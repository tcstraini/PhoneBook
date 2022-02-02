package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	@NotNull
	@Size(max=25)
	@NotBlank(message = "firstName is mandatory")
	@NotEmpty
	private String firstname;
	
	
	
	
	@NotNull
	@Size(max=25)
	@NotBlank(message = "lastName is mandatory")
	@NotEmpty
	private String lastname;
	
	
	@NotNull
	private Integer age;
	
	
	
	@NotNull
	@Size(max=25)
	private String housenumber;
	
	
	@NotNull
	@Size(max=25)
	private String street;
	
	
	
	@NotNull
	@Size(max=25)
	private String city;
	
	
	@NotNull
	@Size(max=25)
	private String pin;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="mobile_id", referencedColumnName = "id")
	Mobile mobile;

	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
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
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}