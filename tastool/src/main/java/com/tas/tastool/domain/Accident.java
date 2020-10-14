package com.tas.tastool.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Accident {
	@Id
	@GeneratedValue
	private long Acidentid;
	private String address;
	@OneToMany(mappedBy="Accident")
	@JsonIgnore
	private Set<Vehicle> Vehicle;
	public long getAcidentid() {
		return Acidentid;
	}
	public void setAcidentid(long acidentid) {
		Acidentid = acidentid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<Vehicle> getVehicle() {
		return Vehicle;
	}
	public void setVehicle(Set<Vehicle> vehicle) {
		Vehicle = vehicle;
	}

}
