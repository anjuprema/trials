package com.anju.SortingSample;

import java.util.List;

public class MultipleImplementingClass implements MultipleInheritanceTest{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String method2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int method3() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List method4() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		MultipleImplementingClass mc = new MultipleImplementingClass();
		mc.test();
		mc.test1();
	}
}
