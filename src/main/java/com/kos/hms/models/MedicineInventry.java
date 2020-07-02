package com.kos.hms.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MedicineInventry")
public class MedicineInventry {

	@Id
	@Column(name="medicineId")
	private int medicineId;
	@Column(name="medicineName")
	private String medicineName;
	@Column(name="price")
	private double price;
	@Column(name="quantity")
	private int quantity;
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "MedicineInventry [medicineId=" + medicineId + ", medicineName=" + medicineName + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
