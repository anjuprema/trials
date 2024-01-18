package com.anju.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book{
	private int bookId;
	
	public Book(int bookId) {
		super();
		this.bookId = bookId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + "]";
	}	
	
}
public class ComparatorUsingLamda {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book(138));
		bookList.add(new Book(23));
		bookList.add(new Book(356));
		bookList.add(new Book(112));
		
		Collections.sort(bookList, (b1, b2) -> {
			return b2.getBookId() - b1.getBookId();
		});
		System.out.println(bookList);
		
		bookList.sort((b1, b2) -> b1.getBookId()- b2.getBookId());
		System.out.println(bookList);
	}

}
