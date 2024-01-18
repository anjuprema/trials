package com.anju.designpattern;

class SampleSingleton{
	static SampleSingleton st;
	private float PI = 3.14F;
	
	private SampleSingleton() {}
	
	public static SampleSingleton getObj() throws InterruptedException {
		if(null == st) {
			System.out.println(Thread.currentThread().getName()+ " says st is null");
			synchronized(SampleSingleton.class){
				st = new SampleSingleton();
				//Thread.sleep(1000);
			}			
		}
		return st;
	}
	
	public float getPI() {
		return PI;
	}
	
	public void setPI(float pi) {
		this.PI = pi;
	}
}

public class SingletonTestLazyInstantiation {

	public static void main(String[] args) throws InterruptedException {
		new Thread(()->{
			SampleSingleton s;
			try {
				s = SampleSingleton.getObj();
				System.out.println(s.getPI());
				s.setPI(4.55F);
				System.out.println(s.getPI());
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}			
		}).start();
		
		new Thread(() -> {
			SampleSingleton s2;
			try {
				s2 = SampleSingleton.getObj();
				System.out.println(s2.getPI());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}).start();		
	}

}
