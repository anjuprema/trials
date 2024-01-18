package com.anju.main;

import java.util.function.Consumer;

public class ConsumerSample {

	public static void main(String[] args) {
		Consumer <String> con = (str) -> {
			String s = "";
			s = s.concat(str);
			System.out.println(s);
		};
		con.accept("Hello");
		con.accept("World");
	}

}
