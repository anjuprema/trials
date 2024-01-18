package com.anju.stringPkg;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string..");
		String b = sc.nextLine();
		StringBuilder reverseB = new StringBuilder();
		for(int i=b.length()-1; i>=0; i--) {
			reverseB.append(b.charAt(i));
		}
		
		System.out.println(reverseB);
		if(b.equals(reverseB.toString())) System.out.println("Palindrome..");
		else System.out.println("Not Palindrome..");
		
		/*ArrayList<String> al = new ArrayList(); //IndexoutofBoundException
		al.add("Hello");
		System.out.println(al.get(3));*/
		
	}

}
