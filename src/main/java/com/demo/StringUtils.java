package main.java.com.demo;

import java.util.Iterator;

public class StringUtils {

	public static void main(String[] args) {

		String resultString = addNum("dfsadfsadfs,f10,10,dfsdfsa10", 10,true);
		System.out.println(resultString);
	}

	public static String addNum(String num, int numvalue,boolean isIncrease) {
		byte[] arr = num.getBytes();
		Iterator<Byte> chars = new Iterator<Byte>() {
			private int i = 0;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return i != arr.length;
			}

			@Override
			public Byte next() {
				// TODO Auto-generated method stub
				return arr[i++];
			}
		};
		StringBuffer res = new StringBuffer();
		StringBuffer nums = new StringBuffer();
		while (chars.hasNext()) {
			int val = chars.next();
			if (val >= 48 && val <= 57) {
				nums.append((char) val);
				if (!chars.hasNext()) {
					nums.toString();
					int s = Integer.valueOf(nums.toString()) + numvalue;
					res.append(s);
				}
			} else {
				if (!nums.toString().isEmpty()) {
					nums.toString();
					int s = Integer.valueOf(nums.toString()) + numvalue;
					res.append(s);
					res.append((char) val);
					nums = new StringBuffer();
					if(isIncrease) {
						numvalue++;
					}
				} else {
					res.append((char) val);
				}
			}
		
		}
		return res.toString();
	}
}
