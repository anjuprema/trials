package com.anju.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		Tree t1 = new Tree(1, "Mango", 25);
		Tree t2 = new Tree(2, "JackFruit", 10);
		Tree t3 = new Tree(3, "Litchi", 15);
		Tree t4 = new Tree(4, "Guava" , 10);
		
		List<Tree> l = new ArrayList <Tree>(); 
		l.add(t1); l.add(t2); l.add(t3); l.add(t4);
		
		//print trees, age >15
		List<Tree> l2 = new ArrayList<Tree>();
		l2 = l.stream().
				filter(t -> t.Age > 15).
				collect(Collectors.toList());
		System.out.println(l2);
		
		//print trees name only, age>10
		List <String> l3 = l.stream()
								.filter(t-> t.Age > 10)
								.map(Tree::getTreeName)
								.collect(Collectors.toList());
		System.out.println(l3);
		
		//count trees with age 10
		long count = l.stream()
						.filter( t -> t.Age == 10)
						.count();
		System.out.println(count);
		
		//find trees with name Mango
		Optional<Tree> l4 = l.stream()
						.filter(t ->t.getTreeName().equalsIgnoreCase("Mango"))
						.findAny();
		System.out.println(l4);
		
		//find max age of trees
		OptionalInt maxage = l.stream()
					.mapToInt(Tree::getAge)
					.max();
		if(maxage.isPresent())
			System.out.println(maxage.getAsInt());
		
		//sort by age
		l.sort((a,b) -> a.Age - b.Age);
		l.forEach(System.out::println);
		
		//print name of all trees
		l3 = l.stream()
				.map(Tree::getTreeName)
				.collect(Collectors.toList());
		System.out.println(String.join(",", l3));
		
		//square num, filter >1000, find avg
		Integer[] arr = new Integer[] {10, 13, 67,45, 23,44};
		List <Integer> l5 = Arrays.asList(arr);
		OptionalDouble avg = l5.stream()
						.mapToInt(n -> n*n)
						.filter(n -> n<2000)
						.average();
		if(avg.isPresent()) System.out.println(avg.getAsDouble());
		
		l5.forEach(a-> System.out.println(a));
		
						
						
		
	}

}
