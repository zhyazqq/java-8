package main.java.com.demo;

public class RegexTest {
	public static void main(String[] args) {
		String date = "2015/08/12 15:30:20";
	boolean flag =	date.matches("\\d{4}[-.|/.]\\d{1,2}[-.|/.]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?");
		System.out.println(flag);
	}
}
