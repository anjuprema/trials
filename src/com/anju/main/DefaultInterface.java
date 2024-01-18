package com.anju.main;

public interface DefaultInterface {
	void helloWorld();
	void helloAppu();
	int i = 20;
	
	default void helloMe() {
		System.out.println("Hello Myself from DefaultInterface default method !! i="+i);
	}
	
	default void helloMeAgain() {
		System.out.println("Hello Me Again from DefaultInterface default method !! i="+i);
	}
	
	static void myStaticMethod() {
		System.out.println("Called static method in interface..");
	}
}
