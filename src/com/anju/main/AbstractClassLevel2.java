package com.anju.main;

public class AbstractClassLevel2 extends AbstractClassLevel1{

	@Override
	public void helloAppu() {
		System.out.println("Hello World from AbstractClassLevel2!! i="+i);
		
	}
	
	public void sameMethod(int i) {
		System.out.println("In method with 1 arg");
	}
	
	public void sameMethod(int i, int j) {
		System.out.println("In method with 2 arg");
	}
	
	public static void main(String[] args) {
		AbstractClassLevel2 ac = new AbstractClassLevel2();
		ac.helloAppu();
		ac.helloMe();
		ac.helloMeAgain();
		ac.helloWorld();
		
		ac.sameMethod(1);
		ac.sameMethod(1,2);
		
		DefaultInterface.myStaticMethod();
	}

}
