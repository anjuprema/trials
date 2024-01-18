package com.anju.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackSample {

	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		myStack.push("AAA"); myStack.push("BBB"); myStack.push("CCC");
		//Iterator it = myStack.iterator();
		//while(it.hasNext()) System.out.println(myStack.pop());
		char[] arr = {'a','b'};
		String str = String.copyValueOf(arr,0,1);
		
		double f = 1.234;
		System.out.println(f);
		float ff = 1.234F;
		System.out.println(ff);
	}

}
