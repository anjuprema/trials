package com.anju.java8;

import java.util.ArrayList;
import java.util.List;

interface myFunctionalInterface {
	void sayHello();
	
	default void generalGreetings() {
		System.out.println("Hello World..");
	}
	
	public static void greet() {
		System.out.println("Hi..");
	}
}
public class LamdaSample {
	public static void main(String[] args) {
		myFunctionalInterface mi = () -> System.out.println("Hello from Anju");
		mi.sayHello();
		mi.generalGreetings();
		//myFunctionalInterface::greet;
		
		//As part of backward compatability for foreach in
		List<String> l = new ArrayList();
		l.add("Anju"); l.add("Appu");
		l.forEach(e -> System.out.println(e));
	}
}
