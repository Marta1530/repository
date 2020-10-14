package com.tas.tastool.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Motorist {
@Id
@GeneratedValue
private String Driverlicense;
private String Firstname;
private String Lastname;
private int Age;
@ManyToOne
@JsonIgnore
private Vehicle Vehicle;
public String getDriverlicense() {
	return Driverlicense;
}
public void setDriverlicense(String driverlicense) {
	Driverlicense = driverlicense;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public Vehicle getVehicle() {
	return Vehicle;
}
public void setVehicle(Vehicle vehicle) {
	Vehicle = vehicle;
}


	
}
