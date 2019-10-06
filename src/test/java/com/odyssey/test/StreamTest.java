package com.odyssey.test;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamTest {

	Employee[] arrayOfEmps = { new Employee(1, "Daniel", 1000.00), new Employee(2, "Dere", 2000.00),
			new Employee(3, "Abebe", 4000.00) };

	Employee[] arrayOfEmpss = { new Employee(1, "Daniel", 1000.00), new Employee(2, "Dere", 2000.00),
			new Employee(3, "Abebe", 4000.00) };

	int[] num = { 2, 5, 6 };
	int[] nums = { 2, 5, 6 };

	@Test
	public void testEmolyee() {

		List<Employee> empList = Arrays.asList(arrayOfEmps);

		empList.stream().forEach(e -> System.out.println(e));
		System.out.println("The following list is filtered");
		empList.stream().filter(e -> e.getName() == "Daniel").forEach(e -> System.out.println(e));

		List<Employee> empLists = Stream.of(arrayOfEmps).collect(Collectors.toList());

		System.out.println(empLists);

		System.out.println("Comparing two arrays " + "using assert Array Equals....");

		assertArrayEquals(num, nums);

	}

	@Test
	public void testTwoMethods() {

		List<Employee> employees = Arrays.asList(arrayOfEmps).stream()
				.sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());

		List<Integer> numbers = Arrays.asList(2, 1, 2, 5, 6, 7, 2, 3, 7);

		List<Integer> numbs = numbers.stream().distinct().collect(Collectors.toList());

		System.out.println("The following distinct " + "numbers are...");
		System.out.println(numbs);

		System.out.println("The following is " + "printed from the list.....");
		System.out.println(employees);

	}

	@Test
	public void test_infiniteloop() {

		Stream.generate(Math::random).limit(10).forEach(System.out::println);

	}
	
	@Test
	public void test_filteringinCollections() {
		
		// filtering some of the elements in java8 
		// the first is defining teh data structure
		
		List<String> names = new ArrayList<>();
		
		names.add("Daniel");
		names.add("Derese");
		names.add("Naneye");
		names.add("Taba");
		names.add("Baba");
		names.add("Melese");
		
		
		List<String> filteredList = names.stream().filter(s -> s.startsWith("D")).
				collect(Collectors.toList());
		
		System.out.println("The following list is prinited from the array List");
		System.out.println("__________________________________________________");
		System.out.println(filteredList);
		

		
	}
	
	
	@Test
	public void test_getDatas() {
		
		// this method tests the data which is coming from the database. If the method reterives the data from 
		// the database server, it actually fails and secceddes if it runs successfully.
		// We Can design every tests as we can and test using JUnit TEsting framework.
		
		// It is wornderfull. fa
		
		
	// Creating Sample Collection
		
		List<Integer> myList = new ArrayList<>();
		for(int i = 0; i<10;i++)
			myList.add(i);
		
		Iterator<Integer> it = myList.iterator();
	// traversing using iterator
		
		while(it.hasNext()) {
			
			Integer i = it.next();
			System.out.println("Iterator Value ::"+i);
		}
	
	// traversing through forEach method of Iterable 
		
	myList.forEach((new Consumer<Integer>() {
		public void accept(Integer t) {
			System.out.println("foreach analogy::"+t);
		}
	}));	
	
	
	MyConsumer action = new MyConsumer();
	myList.forEach(action);
		
	}
	
	
	
	
	@Test
	public void test_getAllRecords() {
		
		// This method test whether the method returns all the expected results or not.
		
		
		
	}

}

class MyConsumer implements Consumer<Integer>{
	
	
	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}
	
}