package com.anju.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> ll = new LinkedList<String>();
		ll.add("aaa"); ll.add("bb");
		System.out.println(ll);
		
		Set<String> ss = new HashSet<String>();
		ss.add("aaaa"); ss.add("bbbb");
		System.out.println(ss);
		
		Map<Integer, String> mm = new HashMap<Integer, String>();
		mm.put(1, "a"); mm.put(2, "b");
		System.out.println(mm);
	}

}
