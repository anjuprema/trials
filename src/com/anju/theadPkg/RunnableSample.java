package com.anju.theadPkg;


class Sample extends Thread{
	public void run() {
		System.out.println("Thread started...");
	}
}

class SampleRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread runnable started..");
		
	}	
}

public class RunnableSample {
	public static void main(String args[]) {
		Sample s = new Sample();
		s.start();
		
		Thread t = new Thread(new SampleRunnable());
		t.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 3 running..");				
			}			
		}).start();
		
		new Thread(() -> {
			System.out.println("Thread lambda running..");
		}).start();		
		
	}
}
