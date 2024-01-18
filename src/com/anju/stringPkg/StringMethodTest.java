package com.anju.stringPkg;

import java.util.Arrays;

public class StringMethodTest {

	public static void main(String[] args) {
		String str = new String("Anju Prema");
		
		String strArr[] = str.split(" ");
		System.out.println(Arrays.toString(strArr));

	}

}
