package com.anju.theadPkg;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class watchAIOC implements Runnable {
	CyclicBarrier cb;
	static int j = 1; //remove static to not share
	
	watchAIOC(CyclicBarrier b){
		this.cb = b;
	}
	
	@Override
	public void run() {
		System.out.println("Thread reached before barrier:"+ Thread.currentThread().getName());
		j++;
		System.out.println(Thread.currentThread().getName()+ " j="+j);
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("Thread crossed barrier:"+ Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+ " j="+j);
	}
	
}

public class CyclicBarrierSample {

	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
			@Override
			public void run() {
				//This will be called when all thread reaches the barrier
				System.out.println("All Thread reached barrier.. waiting to cross barrier..");
				
				int i = 0;
				while(i < 100) {
					try {
						Thread.sleep(100);
						i++;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}			
		});
		new Thread(new watchAIOC(cb)).start();
		Thread.sleep(1000);
		new Thread(new watchAIOC(cb)).start();
		Thread.sleep(1000);
		new Thread(new watchAIOC(cb)).start();
	}

}
