package com.anju.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateAndRemove {

	public static void main(String[] args) {
		List<Integer> myList = new LinkedList<Integer>();
		myList.add(12); myList.add(22); myList.add(33); myList.add(44);
		Iterator it = myList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//if((Integer)it.next() == 22) it.remove();
		}
		
		System.out.println(myList.toString());
	}

}
