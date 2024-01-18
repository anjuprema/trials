package com.anju.stringPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseStringSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string..");
		String str = sc.nextLine();
		Stack<Character> st = new Stack<>();
		for(char ch : str.toCharArray()) {
			st.push(ch);
		}

		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}		

		String[] string = new String[] {"qwe","rty"};
		System.out.println(Arrays.stream(string).count());
		
		
	}

}
