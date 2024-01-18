package com.anju.main;

import java.util.stream.Stream;
import java.util.*;

public class StreamVariousInput {

	public static void main(String[] args) {
		Stream.of(1,2,3,4).forEach(a -> System.out.println(a));
		
		System.out.println("******************");
		
		String[] arr = {"Anju","Appu","Viji"};
		List<String> l = Arrays.asList(arr);
		Iterator it = l.iterator();
		while(it.hasNext()) System.out.println(it.next());
		
		System.out.println("******************");
		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			System.out.println(li.previousIndex());
		}
		
		System.out.println("******************");
		
		for(String a: arr) System.out.println(a);
		System.out.println("******************");
		
		l.forEach(a -> System.out.println(a));

		
	}

}
