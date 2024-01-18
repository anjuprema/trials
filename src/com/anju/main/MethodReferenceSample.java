package com.anju.main;

@FunctionalInterface
interface FunctionInterfaceClass{
	public String decorate(String str);
	default void displayNormal(String str) {
		System.out.println(str);
	}
}

public class MethodReferenceSample {

	public static void main(String[] args) {
		FunctionInterfaceClass fun = (str) -> str+"...";
		System.out.println(fun.decorate("Hello World"));


	}

}
