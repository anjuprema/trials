package com.anju.theadPkg;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableSample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask ft = new FutureTask(new Callable() {
			@Override
			public Object call() throws Exception {
				System.out.println("Callable called...");
				Thread.sleep(3000);
				return "Thonnivasam..";
			}			
		});
		new Thread(ft).start();
		System.out.println(ft.get());
		System.out.println("Main thread..");

	}

}
