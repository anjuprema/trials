package com.anju.ConsumerProducerBQueue;

public class MainClassBQ {

	public static void main(String[] args) {		
		int MAX_CAPACITY = 3;
		BufferBQ buffer = new BufferBQ(MAX_CAPACITY);
		
		//producer thread
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						buffer.produce((int) (Math.random()*9)+1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}			
		}).start();
		
		//consumer thread
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						buffer.consume();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}			
		}).start();

	}

}
