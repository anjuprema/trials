package com.anju.abstractpkg;

abstract class MyAbstractClass1{
	abstract void getA();
	abstract void getB();
}

abstract class MyAbstractClass2{
	static int i = 10;
	void getA() {
		System.out.println("A..");
	}
	void getB() {
		System.out.println("B..");
	}	
	final static void getC(){
		System.out.println("final static C..");
	}
}

class MyAbstractClass3 extends MyAbstractClass2{
	final static int i = 20;
}

public class AbstractClassSample {

	public static void main(String[] args) {
		//MyAbstractClass2 b = new MyAbstractClass2(); // cannot do as u defined class as abstract 
													   // eventhough no abstract method
		System.out.println(MyAbstractClass2.i);
		MyAbstractClass3 c3 = new MyAbstractClass3();
		System.out.println(c3.i);
		c3.getC();
		c3.getC();
		System.out.println(MyAbstractClass3.i);
		System.out.println(MyAbstractClass2.i);
	}

}
