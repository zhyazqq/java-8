package main.java.com.demo;



public class DemoException {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
//			throw new MyRunException();
			System.out.println(new MyRunException(MyExceptionEnums.ERROR01));
		}
		
	}
}
