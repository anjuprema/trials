package com.anju.theadPkg;

class oddThread implements Runnable{
	public void run() {
		int i = 1;
		System.out.println(Thread.currentThread().getName());
		synchronized(this) {			
			while(i < 100) {
				System.out.println(i);
				i = i+2;
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				notify();
			}
		}
	}
}

class evenThread implements Runnable{
	public void run() {
		int i = 0;
		synchronized(this) {
			while(i <= 100) {
				System.out.println(i);	
				i = i+2;
				//notify();
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				notify();
			}			
		}
	}
}

public class OddEvenThread_bug {

	public static void main(String[] args) {
		new Thread(new evenThread()).start();
		new Thread(new oddThread()).start();

	}

}
