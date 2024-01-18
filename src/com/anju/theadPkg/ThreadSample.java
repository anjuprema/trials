package com.anju.theadPkg;

public class ThreadSample {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		new Thread(() -> {
			for(int i : a)
			System.out.println(i);
		}).start();
		System.out.println("Hi Anju..");
	}

}
