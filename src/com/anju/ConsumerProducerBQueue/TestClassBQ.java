package com.anju.ConsumerProducerBQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestClassBQ {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(12);
		for(int i=0; i<10; i++) {
			bq.put((int) (Math.random()*9) +1);
			System.out.println(bq);
		}
		for(int i=0; i<10; i++) {
			bq.take();
			System.out.println(bq);
		}		
		
	}

}
