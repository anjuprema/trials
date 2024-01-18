package com.anju.main;

import java.util.function.Supplier;

public class SupplierSample {

	public static void main(String[] args) {
		Supplier <Double> sup = () -> Math.random();
		for(int i=0; i<10; i++) System.out.println(i+": "+sup.get());
	}

}
