package main.java.authorization;

import java.util.Date;
import java.io.Serializable;

import javax.validation.constraints.*;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String username;
	@NotNull
	private String password;

	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String state;
	private String city;
	private String zip;
	
	@Past(message="You must be born in the past...")
	private Date birthDate;
	
	private boolean newsletter;
	
	public User(String username, String password) {
		setUsername(username);
		setPassword(password);
		System.out.println("Created new user: " + this.username);
	}
	
	public User() {
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}

}
