package main.java.com.demo;



public class projectsbytes {
	public static void main(String[] args) {
		String string = "2147483647";
		System.out.println(string);
		Double d=3.2233333;
		Integer integer = 2147483647;
		byte s =d.byteValue();
		Float f = 6654541.45644666f;
		System.out.println(string.toCharArray());
		System.out.println(string.getBytes());
		System.out.println(f);
		System.out.println(integer.bitCount(10));
		Integer.toBinaryString(2147483647);
		System.out.println(Integer.toBinaryString(10).toString());
		System.out.println(d.BYTES);
		System.out.println(integer.BYTES);
		System.out.println(integer.MAX_VALUE);
		System.out.println(integer.MAX_VALUE+(-integer.MIN_VALUE));
		System.out.println(integer.MIN_VALUE);
		System.out.println(integer.toBinaryString(2147483647));
		System.out.println(Float.BYTES);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		byte[] sBytes =string.getBytes();
		for(int i = 0;i<sBytes.length;i++) {
			System.out.println(sBytes[i]);
		}
		System.out.println("a".charAt(0)+"b".charAt(0));
	}
}
