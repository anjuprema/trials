package com.anju.theadPkg;

public class SynchronizedObject {
	Object syncObj = new Object();
	
	public static void main(String[] args) {
		SynchronizedObject s = new SynchronizedObject();
		s.method1();
	}
	
	public void method1() {
		startThread();
		synchronized(syncObj) {
			System.out.println("Hello from thread 1..");
			syncObj.notify();
			try {
				syncObj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 1 exiting..");
		}
	}
	
	public void startThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized(syncObj) {
					System.out.println("Hello from thread 2..");
					syncObj.notify();					
					System.out.println("Thread 2 exiting..");
				}				
			}
			
		}).start();		
	}

}
