package main.java.com.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
public static void main(String[] args) throws InterruptedException {
	List<String> list=new ArrayList<>();
	new Thread(()->{
	for(int i=1;i<=100;i++) {

			synchronized (list) {
				list.add(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getName());
			}

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(list.size());
	}
	}) .start();
	new Thread(()->{
	for(int i=1;i<=100;i++) {

			synchronized (list) {
				list.add(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getName());
			}

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(list.size());
	}
	}) .start();
	System.out.println(list.size());
}
}
