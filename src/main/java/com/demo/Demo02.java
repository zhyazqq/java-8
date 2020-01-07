package main.java.com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo02 {
	public static void main(String[] args) {
		//Runnable
		System.out.println("*********Runnable*********");
		 Runnable runnable=() -> System.out.println("hello world");
		runnable.run();
		System.out.println(runnable);

		Runnable runnable2=()->{
			String string=Thread.currentThread().getName();
			System.out.println("hello");
			System.out.println("world");
			System.out.println(string);
		};
		runnable2.run();
		Predicate<Integer> num=x->x>5;
		boolean flag=num.test(6);
		System.out.println(flag);
		System.out.println("******************");
		BinaryOperator<Integer> result1=(x,y)->x+y;
		int re=result1.apply(6, 8);
		System.out.println(re);
		System.out.println("******************");
		Function<Integer, Integer> resFunction= (x)->x+5;
		int ress= resFunction.apply(5);
		System.out.println(ress);
		System.out.println("******************");
		List<String> list=new ArrayList<String>();
		list.add("55:66:66:66:666:6");
		List<String[]> lldList=list.stream().map((x)->x.split(":")).filter(x->x.equals("66")).collect(Collectors.toList());
		System.out.println(lldList);
		Student student=new Student("ss","187","山东");
		Student student1=new Student("ss1 ","918","济南");
		Student student2=new Student("ss2","198","武汉");
		Student student3=new Student("soo","189","琉球");
		Student student4=new Student("mm","018","果敢");
		Student student5=new Student("gg","108","金门");
		
		
		List<Student> lslStudents= new ArrayList<Student>();
		lslStudents.add(student);
		lslStudents.add(student1);
		lslStudents.add(student2);
		lslStudents.add(student3);
		lslStudents.add(student4);
		lslStudents.add(student5);
		
		List<Student>ddList=lslStudents.stream().filter(x->(x.getNameString().concat(";").concat(x.getAgeString()).concat(";").concat(x.getAddressString())).trim().contains(" ")).collect(Collectors.toList());
		System.out.println(ddList+"*************");
		System.out.println("*********         ****");
		ddList.forEach(x->{
			System.out.println(x);
		});
		long s=lslStudents.stream().map(x->x.getNameString().equals("sss")).count();
		System.out.println(s);
		
		Integer sInteger= Stream.of(1,2,3,8).reduce(0,(acc,elemen)->acc+elemen);
		System.out.println(sInteger);
		List<Student> lls= new ArrayList<Student>();
		lls.add(student3);
		lls.add(student4);
		lls.add(student5);
		List<List<Student>>list2=new ArrayList<List<Student>>();
		list2.add(lls);
		list2.add(lslStudents);
		List<Student>lStudents=list2.stream().flatMap(x->x.stream()).filter(x->x.getNameString().equals("soo")).collect(Collectors.toList());
		System.out.println(lStudents);
		System.out.println("----------------------");
	}
}
