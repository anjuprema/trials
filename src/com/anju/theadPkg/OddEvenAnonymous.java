package com.anju.theadPkg;

public class OddEvenAnonymous {

	public void print(int i) {
		synchronized(this){
			notify();
			System.out.println(i);			
			try {				
				wait();				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		OddEvenThread o = new OddEvenThread();		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<=100; i=i+2) {
					o.print(i);
				}			
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<100; i=i+2) {
					o.print(i);
				}				
			}
			
		}).start();
	}

}
