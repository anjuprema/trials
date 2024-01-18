package com.anju.main;

class A{
	void print () {
		System.out.println("Hi from A..");
	}
}
class B extends A{
	void print (int i) {
		System.out.println("Hi from B..");
	}
}
public class InheritanceTrial {

	public static void main(String[] args) {
		B b = new B();
		b.print();

	}

}
