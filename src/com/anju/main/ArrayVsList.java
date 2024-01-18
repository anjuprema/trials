package com.anju.main;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsList {

	public static void main(String[] args) {
		int myArray[] = new int[10];
		myArray[0] = 110; myArray[1] = 220;
		System.out.println(myArray[0]);
		
		Tree myArrayTree[] =  new Tree[10];
		Tree t1 = new Tree(1, "Mango", 25);
		Tree t2 = new Tree(2, "Palm", 250);	
		Tree t3 = new Tree(3, "Gulmohar", 15);
		myArrayTree[0] = t1; myArrayTree[1] = t2; myArrayTree[2] = t3;
		System.out.println(myArrayTree[0].toString());
		System.out.println("Length: "+myArrayTree.length);
		
		Arrays.asList(myArrayTree).stream().forEach(e -> System.out.println(e));
		
		ArrayList<Integer> myArrayList = new ArrayList();
		myArrayList.add(12); myArrayList.add(34);
		System.out.println(myArrayList.toString());	
		System.out.println("Size: "+myArrayList.size());
	}

}
