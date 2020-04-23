package main.java.com.demo;

import java.util.Date;
import java.util.TimeZone;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDemo {
public static void main(String[] args) {
	System.out.println(System.currentTimeMillis());
	String string="1579137691951";
	Timestamp timestamp = new Timestamp(Long.valueOf(string));
	User user = new User();
	timestamp.toString().isEmpty();
	user.setTimestamp(timestamp);
	System.out.println(timestamp);
}


}

