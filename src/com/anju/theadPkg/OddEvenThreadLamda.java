package com.anju.theadPkg;

public class OddEvenThreadLamda {	
	public void print(int i) {		
		synchronized(this) {			
			System.out.println(i);
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		OddEvenThreadLamda o = new OddEvenThreadLamda();
		new Thread(() -> {
			for(int i=0; i<=100; i=i+2) {
				o.print(i);
			}
		}).start();
		
		new Thread(() -> {
			for(int i=1; i<100; i=i+2) {
				o.print(i);
			}
		}).start();

	}

}
