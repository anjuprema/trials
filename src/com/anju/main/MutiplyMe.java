package com.anju.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MutiplyMe {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number..");
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<20; i++) System.out.println(i  +" * " + num + " = "+ i*num);
	}

}
