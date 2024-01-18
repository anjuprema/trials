package com.anju.ConsumerProducer;

import java.util.LinkedList;

public class Buffer {
	LinkedList<Integer> buffer = new LinkedList();
	int MAX_CAPACITY;
	
	Buffer(int max_capacity){
		this.MAX_CAPACITY = max_capacity;
	}
	
	public void produce(int item) throws InterruptedException {
		synchronized(this) {
			while(MAX_CAPACITY == buffer.size()) {
				wait();
			}
			buffer.add(item);
			System.out.println("Item Added :"+item);
			notify();
		}
	}
	
	public int consume() throws InterruptedException {
		synchronized(this) {
			while(buffer.isEmpty()) {
				wait();
			}
			int item = buffer.removeFirst();
			//System.out.println("Item Removed :"+item);
			notify();
			return item;
		}
	}

}
