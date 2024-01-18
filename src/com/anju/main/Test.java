package com.anju.main;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.anju.pkg1.ProtectedClass;

public class Test extends ProtectedClass{

	public static void main(String[] args) {
		System.out.println("Hello World");
		ProtectedClass p = new ProtectedClass();   
		//System.out.println(p.PI);                //bcoz protected
		//p.printPI();							   //bcoz protected
		Test T = new Test();					   
		System.out.println(T.PI);				   //bcoz extended ProtectedClass
		T.printPI();							   //bcoz extended ProtectedClass
		
		String[] arr = {"qwe","rty"};
		
		List<String> uris = new ArrayList<>();
		uris.add("C:\\My.txt");
		uris.stream().map(uri -> Paths.get(uri)).forEach(a -> System.out.println(a));
	}

}
