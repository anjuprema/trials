package com.anju.abstractpkg;

import java.util.ArrayList;

public class ExtendedToLevelTwo extends ExtendedClass{
	int k = 40;
	
	@Override
	void helloWord() {
		System.out.println("Hello World!..");
		
	}
	
	public static void main(String [] args) {
		ExtendedToLevelTwo obj1 = new ExtendedToLevelTwo();
		ArrayList<BaseClass> list = new ArrayList();
		list.add(obj1);
		System.out.println(list.get(0).i);
		System.out.println(ExtendedClass.j);
		ExtendedClass.hellow();
		//System.out.println(list.get(0).k); //wont be available as it is scaled down
	}
}
