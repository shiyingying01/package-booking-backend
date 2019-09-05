package tws.entity;

import java.io.Serializable;

public class Packager implements Serializable {
	private String id;
	private String receiver;
	private String phone;
	private String weight;
	private String status;
	private String getTime;
	
	public Packager() {

	}

	public Packager(String id, String receiver, String age, String phone, String weight,String status,String getTime) {
		this.id = id;
		this.receiver = receiver;
		this.phone = phone;
		this.weight = weight;
		this.weight = status;
		this.weight = getTime;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGetTime() {
		return getTime;
	}

	public void setGetTime(String getTime) {
		this.getTime = getTime;
	}
}
