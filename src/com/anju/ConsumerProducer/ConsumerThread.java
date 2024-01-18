package com.anju.ConsumerProducer;

public class ConsumerThread implements Runnable{
	Buffer buffer;
	ConsumerThread(Buffer b) {
		 this.buffer = b;
	}
	@Override
	public void run() {
		while(true) {			
			try {
				int item = buffer.consume();
				System.out.println("Item Removed: "+item);
				//Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
	}
}
