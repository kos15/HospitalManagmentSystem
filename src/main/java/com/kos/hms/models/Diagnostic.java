package com.kos.hms.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Diagnostic")
public class Diagnostic {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="patientId")
	private int patientId;
	@Column(name="testId")
	private int testId;
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
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Diagnostic [id=" + id + ", patientId=" + patientId + ", testId=" + testId + ", date=" + date + "]";
	}
	public Diagnostic(int patientId, int testId) {
		super();
		this.patientId = patientId;
		this.testId = testId;
	}
	public Diagnostic() {
		super();
	}
	
	
}

//mysql> desc Diagnostic;
//+-----------+----------+------+-----+-------------------+-------------------+
//| Field     | Type     | Null | Key | Default           | Extra             |
//+-----------+----------+------+-----+-------------------+-------------------+
//| id        | int      | NO   | PRI | NULL              | auto_increment    |
//| patientId | int      | NO   |     | NULL              |                   |
//| testId    | int      | NO   |     | NULL              |                   |
//| date      | datetime | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
//+-----------+----------+------+-----+-------------------+-------------------+
//4 rows in set (0.00 sec)
