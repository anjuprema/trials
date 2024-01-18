package com.anju.main;

public class ThreadSample {
	private void greetMe() {
		System.out.println("Hello..");
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadSample ts = new ThreadSample();
		for(int j=0; j<10; j++) System.out.println("Main Thread called...");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) ts.greetMe();
			}
			
		}).start();
		Thread.sleep(2000);
		for(int j=0; j<10; j++) System.out.println(" 2 Main Thread called...");
		new Thread(() -> {
			for(int i=0; i<10; i++) System.out.println("ding dong.."+i);
		}).start();
	}

}
