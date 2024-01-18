package com.anju.main;

import java.util.ArrayList;

public class ObjectCopying {
	@Override
	protected void finalize() {
		System.out.println("Do a cleanup here..");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Tree t1 = new Tree(12, "Gulmohar", 23);
		Tree t2 = new Tree(13, "Banyan", 60);
		ArrayList <Tree> l = new ArrayList();
		System.out.println("T1: "+ t1.TreeName +", T2:" +t2.TreeName);
		t1 = t2;
		System.out.println("T1: "+ t1.TreeName +", T2:" +t2.TreeName);
		t2.setTreeName("Casava");
		System.out.println("T1: "+ t1.TreeName +", T2:" +t2.TreeName);
		t1 = t2 = null;
		//System.gc();
		//Runtime.getRuntime().runFinalization(); 
		//Thread.sleep(200);
		System.out.println("End..");
	}

}