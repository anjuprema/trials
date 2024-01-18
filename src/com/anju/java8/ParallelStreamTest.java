package com.anju.java8;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book(138));
		bookList.add(new Book(23));
		bookList.add(new Book(356));
		bookList.add(new Book(112));
		
		bookList.parallelStream().forEach(e -> System.out.println(e.getBookId()));

	}

}
