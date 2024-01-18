package com.anju.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private String name;
    private int age;
 
    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
        public String toString()
    {
        return "Employee Name: "+name+" age: "+age;
    }
}
public class StreamSample {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Anju",37));
		emp.add(new Employee("Jiya",10));
		emp.add(new Employee("Vijay",38));
		
		//filter age>20, print name
		emp.stream().filter(e -> e.getAge() > 20).forEach(e -> System.out.println(e.getName()));
		
		//count employees with age 10
		Long i = emp.stream().filter(e -> e.getAge() == 10).count();
		System.out.println("Employees with age 10="+i);
		
		//find employee by name Anju
		Optional<Employee> empAnju = emp.stream().filter(e ->e.getName().equals("Anju")).findAny();
		if(empAnju.isPresent()) System.out.println(empAnju.get());	
		
		//find max age of employees
		OptionalInt maxAge = emp.stream().mapToInt(e -> e.getAge()).max();
		if(maxAge.isPresent()) System.out.println("Employee max age= "+maxAge.getAsInt());
		
		//Join the all employee names with “,”
		List <String> allemp = emp.stream().map(e -> e.getName()).collect(Collectors.toList());
		System.out.println("All Employees:"+ String.join(",", allemp));
		
		Integer iarr[] = new Integer[] {12, 34,5};
		List <Integer> iarrL = Arrays.asList(iarr);
		Stream s = Stream.of(iarr);
		s.forEach(a -> System.out.println(a));
	}

}
