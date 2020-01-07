package main.java.com.demo;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Demo01 {
public static void main(String[] args) {
	ArrayList<String> list= new ArrayList<String>();
	list.add("1111333.png");
	list.add("1111333.j");
	list.add("11211333.dwg");
	list.add("11114333.png");
	list.add("11411333.jpg");
	list.add("11114333.png");
	List<String> coList=list.stream().sorted((m,n)->m.split("[.]")[0].compareTo(n.split("[.]")[0])).collect(Collectors.toList());
	List<String> coLis=coList.stream().sorted((m,n)->m.split("[.]")[1].compareTo(n.split("[.]")[1])).collect(Collectors.toList());
	System.out.println(coList);
	System.out.println(coLis);
}
}
