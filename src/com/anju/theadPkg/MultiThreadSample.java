package com.anju.theadPkg;

class ThreadClass implements Runnable{

	@Override
	public void run() {
		MultiThreadSample ms = new MultiThreadSample();
		System.out.println("anju="+ms.anju);
		for(int i=0; i<200; i++) {			
			System.out.println(i);
		}
	}
	
}

public class MultiThreadSample {
	public int anju = 122;
	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new ThreadClass());	
		t.start();
		//t.start(); // cannot call start() twice, but run() can be called multiple times
		System.out.println("Active:"+Thread.activeCount());
		System.out.println(t.toString());
		for(int j=1000; j<1100; j++) {
			System.out.println(j);
			//Thread.sleep(1);
		}
		System.out.println("Active:"+Thread.activeCount());
		
	}

}
