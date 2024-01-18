package com.anju.theadPkg;

class T1 extends Thread {
	public void run() {
		System.out.println("T1 is running..");
	}
}

class T2 implements Runnable {
	public void run() {
		System.out.println("T2 is running..");
	}
}

public class ThreadCreation {

	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		
		Thread t2 = new Thread(new T2());
		t2.start();
		
		int a[] = {1,2,3};
		new Thread(() -> {
			for(int i : a)
				System.out.println(i);
		}).start();
	}

}
