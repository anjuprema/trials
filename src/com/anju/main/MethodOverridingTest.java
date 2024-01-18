package com.anju.main;
class MethodOverridingParent{
	int i =10;
	
	//based on return type polymorphism wont work
	/*float testMethod(int j) {
		return 1.00F;
	}
	int testMethod(int j) {
		return 1;
	}*/
}
class Test1{
	public void hello() {
		System.out.println("hello");
	}
	
}
public class MethodOverridingTest extends Test1{
//	public void hello() {
//		System.out.println("Hello Anju..");
//	}
	public static void main(String[] args) {
		MethodOverridingTest t =new MethodOverridingTest();
		t.hello();

	}

}
