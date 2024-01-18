package com.anju.java8;

interface myTestFunctionalInterface{
	void sayhello();
}

class ReferenceClass{
	public static void helloWorld() {
		System.out.println("Hello Anju...");
	}
}

public class MethodReferenceTest {

	public static void main(String[] args) {
		myTestFunctionalInterface hello = ReferenceClass::helloWorld;
		hello.sayhello();
	}

}
