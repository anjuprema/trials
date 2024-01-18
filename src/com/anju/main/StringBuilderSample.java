package com.anju.main;

class Employee{
	StringBuilder sb = new StringBuilder();
	
	public Employee(StringBuilder sb) {
		this.sb = sb;
	}

	public StringBuilder getSb() {
		return sb;
	}

	public void setSb(StringBuilder sb) {
		this.sb = sb;
	}	
}
public class StringBuilderSample {
	public static void main(String args[]) {
		Employee e1 = new Employee(new StringBuilder("Babitha"));
		System.out.println(e1.getSb());
		Employee e2 = new Employee(new StringBuilder("Arya"));
		System.out.println(e1.getSb());
		System.out.println(e2.getSb());
	}
}
