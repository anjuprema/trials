package com.anju.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalSample {
	private List<String> getMyList(){
		//List<String> myList = new ArrayList<String>();
		//myList.add("Anju");
		return null;
	}
	
	private Optional<String> getMyListOptional() {
		return Optional.of("Anju");
		//return Optional.ofNullable(null);
	}
	public static void main(String[] args) {
		OptionalSample os = new OptionalSample();
		List<String> list = os.getMyList();
		//System.out.println(list.get(0));  //Null Pointer Exception
		
		Optional<String> listop = os.getMyListOptional();
		if(listop.isPresent()) System.out.println(listop.get());
	}
}
