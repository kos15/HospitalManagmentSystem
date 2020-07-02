package com.kos.hms.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pharmacist")
public class Pharmacist {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="patientId")
	private int patientId;
	@Column(name="medicineId")
	private int medicineId;
	@Column(name="quantity")
	private int quantity;
	@Column(name="date")
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Pharmacist [id=" + id + ", patientId=" + patientId + ", medicineId=" + medicineId + ", quantity="
				+ quantity + ", date=" + date + "]";
	}
	public Pharmacist(int patientId, int medicineId, int quantity) {
		super();
		this.patientId = patientId;
		this.medicineId = medicineId;
		this.quantity = quantity;
	}
	public Pharmacist() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
//
//mysql> desc Pharmacist;
//+------------+----------+------+-----+-------------------+-------------------+
//| Field      | Type     | Null | Key | Default           | Extra             |
//+------------+----------+------+-----+-------------------+-------------------+
//| id         | int      | NO   | PRI | NULL              | auto_increment    |
//| patientId  | int      | NO   |     | NULL              |                   |
//| medicineId | int      | NO   |     | NULL              |                   |
//| quantity   | int      | NO   |     | NULL              |                   |
//| date       | datetime | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
//+------------+----------+------+-----+-------------------+-------------------+
//5 rows in set (0.01 sec)
