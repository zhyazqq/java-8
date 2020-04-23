package main.java.com.demo;

import java.sql.Timestamp;

public class User {
	private Timestamp timestamp;
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp=timestamp;
	}
	public User() {
		
	}
	public User(Timestamp timestamp) {
		super();
		this.timestamp=timestamp;
	}
}