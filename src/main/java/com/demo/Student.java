package main.java.com.demo;

public class Student {
	private String nameString;
	private String ageString;
	private String addressString;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getAgeString() {
		return ageString;
	}
	public void setAgeString(String ageString) {
		this.ageString = ageString;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	public Student(String nameString, String ageString, String addressString) {
		super();
		this.nameString = nameString;
		this.ageString = ageString;
		this.addressString = addressString;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [nameString=" + nameString + ", ageString=" + ageString + ", addressString=" + addressString
				+ "]";
	}
	
	
}
