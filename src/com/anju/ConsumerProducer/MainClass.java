package com.anju.ConsumerProducer;

public class MainClass {

	public static void main(String[] args) {
		Buffer buffer = new Buffer(1);
		for(int i =0; i<5; i++)
		new Thread(new ProducerThread(buffer)).start();
		
		new Thread(new ConsumerThread(buffer)).start();
	}

}
