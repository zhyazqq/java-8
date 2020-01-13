package main.java.com.demo;

import java.io.Serializable;
import java.sql.Date;

public class MyErrorMessage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5753943945739159259L;
	private Integer code;
	private String message;
	private Date date;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "MyErrorMessage [code=" + code + ", message=" + message + ", date=" + date + "]";
	}
	public MyErrorMessage(Integer code, String message, Date date) {
		super();
		this.code = code;
		this.message = message;
		this.date = date;
	}
	public MyErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
