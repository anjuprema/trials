package com.anju.main;

class MyClass {	
	
	{
		System.out.println("Intializer Block 1..");
		{
			System.out.println("Intializer inside Block 1..");
		}
	}
	
	MyClass(){
		System.out.println("Default constructor Invoked..");
	}
	
	MyClass(int i){
		System.out.println("Parameterised constructor Invoked..");
	}
	
	{
		System.out.println("Intializer Block 2..");
	}
}
public class InitializerBlocktest {

	public static void main(String[] args) {
		new MyClass();
		new MyClass(1);
		System.out.println(Math.abs(123));

	}

}
