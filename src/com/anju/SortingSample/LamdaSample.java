package com.anju.SortingSample;

interface MyFunctionalInerface {
	void myAbstrctMethod();
}

interface MyFunctionalInterfaceReturns{
	String myAbstractMetodReturn();
}

public class LamdaSample {

	public static void main(String[] args) {
		MyFunctionalInerface m1 = () -> System.out.println("Hello from m1..");
		MyFunctionalInerface m2 = () -> System.out.println("Hello from m2..");
		
		m1.myAbstrctMethod();
		m2.myAbstrctMethod();
		
		MyFunctionalInterfaceReturns m3 = () -> {return "Hello Anju.."; };
		System.out.println(m3.myAbstractMetodReturn());
	}

}
