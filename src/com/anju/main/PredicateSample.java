package com.anju.main;

import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) {
		Predicate <Integer> p = (i) -> {
			return i%2 > 0;
		};
		System.out.println(p.test(120));
	}

}
