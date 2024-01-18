package com.anju.memoryleak;

import java.util.HashMap;
import java.util.Map;

public class mapLeakTest {
	public static void main(String[] args) {
		Map <MyTree, Integer> mymap = new HashMap<MyTree, Integer>();
		//MyTree t1 = new MyTree(1, "Gulmohar", 20); //if you use this map wont allow duplicates, 
													 //create obj directly in loop
		//See MyTree class where equals and hashCode are overridden to avoid mem leak
		for(int i=0; i<10; i++) {
			mymap.put(new MyTree(1, "Gulmohar", 20), i);
		}
		System.out.println("Map Size:"+ mymap.size());
		System.out.println(mymap.toString());
	}
}
