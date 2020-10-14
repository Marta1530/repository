package com.tas.tastool.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private String Vehicleid;
	private String Make;
	private String Model;
	private String color;
	@ManyToOne
	@JsonIgnore
	private Accident Accident;
	@OneToMany(mappedBy="Vehicle")
	@JsonIgnore
	private Set<Motorist> Motorist;
	public String getVehicleid() {
		return Vehicleid;
	}
	public void setVehicleid(String vehicleid) {
		Vehicleid = vehicleid;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Accident getAccident() {
		return Accident;
	}
	public void setAccident(Accident accident) {
		Accident = accident;
	}
	public Set<Motorist> getMotorist() {
		return Motorist;
	}
	public void setMotorist(Set<Motorist> motorist) {
		Motorist = motorist;
	}
	

}
