package com.kos.hms.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Test")
public class Test {

	@Id
	@Column(name="testId")
	private int testId;
	@Column(name="testName")
	private String testName;
	@Column(name="price")
	private float price;
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", price=" + price + "]";
	}
	
	
}
