package com.anju.ConsumerProducer;

public class ProducerThread implements Runnable{
	Buffer buffer;
	ProducerThread(Buffer b) {
		 this.buffer = b;
	}
	@Override
	public void run() {
		while(true) {
			synchronized(this){				
				try {
					int item = (int) (Math.random()*9) + 1;
					buffer.produce(item);
					//Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
