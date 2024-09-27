package pkg1.pincodes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pincodes")
public class PincodeEntity {
	@Id
	private int pincode;
	private String location;
	private String state_id;
	private String country_id;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getState_id() {
		return state_id;
	}
	public void setState_id(String state_id) {
		this.state_id = state_id;
	}
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	public PincodeEntity(int pincode, String location, String state_id, String country_id) {
		super();
		this.pincode = pincode;
		this.location = location;
		this.state_id = state_id;
		this.country_id = country_id;
	}
	public PincodeEntity() {
		super();
	}
}
