package com.anju.SortingSample;

class TestStatic{
	static int i;
	
	static {
		i = 10;
		System.out.println("Initialized i...");
	}
	
	TestStatic(){
		
	}
}

public class StaticInstatiationTest {

	public static void main(String[] args) {
		TestStatic s1 = new TestStatic();
		TestStatic s2 = new TestStatic();

	}

}
