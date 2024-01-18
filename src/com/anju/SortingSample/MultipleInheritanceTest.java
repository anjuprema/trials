package com.anju.SortingSample;

import java.util.List;

interface Interface1 {
	void method1();
	default void test() {
		System.out.println("test interface 1..");
	}
	default void test1() {
		System.out.println("test..");
	}
}

interface Interface2 {
	String method2();
	/*default void test() {
		System.out.println("test..");
	}*/
}

interface Interface3 {
	int method3();
}

public interface MultipleInheritanceTest extends Interface1, Interface2, Interface3{
	List method4();

}
