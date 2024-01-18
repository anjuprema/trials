package com.anju.theadPkg;

class Counter implements Runnable{
	static int i = 1;
	@Override
	public void run() {
		for(int j=0; j<10; j++) {			
			synchronized(Counter.class) { //comment sysnchronized and see race condition
				System.out.println(Thread.currentThread().getName()+ " says i="+i);
				i++;
			}			
		}
	}	
}

public class RaceConditionSample {
	public static void main(String[] args) {
		new Thread(new Counter()).start();
		new Thread(new Counter()).start();
	}
}
