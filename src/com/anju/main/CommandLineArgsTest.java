package com.anju.main;

import java.util.Scanner;

public class CommandLineArgsTest {

	public static void main(String[] args) {
		//Run >> Run Configurations >>  Arguments >> Add args seperated by space
		System.out.println("No of args="+ args.length);
		for(String ar : args) {
			System.out.println("arg = "+ar);
		}
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str);
	}

}
