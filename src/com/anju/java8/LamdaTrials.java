package com.anju.java8;

interface handleOutput{
	void print(int a);
}
public class LamdaTrials {

	public static void main(String[] args) {
		handleOutput h1 = a -> System.out.println(a);
		handleOutput h2 = b -> {
			int c = 12;			
			System.out.println(b+c+1000);
		};
		
		h1.print(111);
		h2.print(222);
	}

}
