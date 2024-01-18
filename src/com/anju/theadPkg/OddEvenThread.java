package com.anju.theadPkg;

class oddThreadClass implements Runnable{
	private OddEvenThread o;
	oddThreadClass(OddEvenThread o){
		this.o = o;
	}	
	@Override
	public void run() {
		for(int i=1; i<100; i=i+2) {
			o.print(i);
		}			
	}	
}
class evenThreadClass implements Runnable{
	private OddEvenThread o;
	evenThreadClass(OddEvenThread o){
		this.o = o;
	}		
	@Override
	public void run() {
		for(int i=0; i<=100; i=i+2) {
			o.print(i);
		}			
	}	
}
public class OddEvenThread {
	
	public void print(int i) {
		synchronized(this){
			notify();
			System.out.println(i);			
			try {				
				wait();				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		OddEvenThread o = new OddEvenThread();
		new Thread(new evenThreadClass(o)).start();
		new Thread(new oddThreadClass(o)).start();
		
	}

}
