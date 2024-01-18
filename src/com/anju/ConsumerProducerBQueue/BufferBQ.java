package com.anju.ConsumerProducerBQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue ;
import java.util.concurrent.LinkedBlockingQueue;

public class BufferBQ {
	private final BlockingQueue <Integer> buffer;
	
	BufferBQ(int max_capacity){
		buffer = new LinkedBlockingQueue<>(max_capacity);
	}
	
	public void produce(int item) throws InterruptedException {
		buffer.put(item);
		System.out.println("Produced "+ item + " , BBQ"+buffer);
	}
	
	public int consume() throws InterruptedException {
		int item = buffer.take();
		System.out.println("Consumed "+ item + " , BBQ"+buffer);
		return item;
	}

}
