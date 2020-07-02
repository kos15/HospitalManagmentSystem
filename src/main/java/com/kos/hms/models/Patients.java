package com.kos.hms.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patients {
	@Id
	@Column(name="patientSSNID")
	private int patientSSNID;
	@Column(name="patientId")
	private int patientId;
	@Column(name="patientName")
	private String patientName;
	@Column(name="age")
	private int age;
	@Column(name="doa")
	private String doa;
	@Column(name="typeOfBed")
	private String typeOfBed;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="status")
	private String status;
	public int getPatientSSNID() {
		return patientSSNID;
	}
	public void setPatientSSNID(int patientSSNID) {
		this.patientSSNID = patientSSNID;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDoa() {
		return doa;
	}
	public void setDoa(String doa) {
		this.doa = doa;
	}
	public String getTypeOfBed() {
		return typeOfBed;
	}
	public void setTypeOfBed(String typeOfBed) {
		this.typeOfBed = typeOfBed;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Patients [patientSSNID=" + patientSSNID + ", patientId=" + patientId + ", patientName=" + patientName
				+ ", age=" + age + ", doa=" + doa + ", typeOfBed=" + typeOfBed + ", address=" + address + ", city="
				+ city + ", state=" + state + ", status=" + status + "]";
	}

	
}
