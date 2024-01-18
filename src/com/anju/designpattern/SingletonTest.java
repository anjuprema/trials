package com.anju.designpattern;

class MySingletonClass{
	private static MySingletonClass myObj = new MySingletonClass();
	private int i = 10;
	private MySingletonClass() {}
	
	public static MySingletonClass getObj() {
		return myObj;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}	
	
}

public class SingletonTest {

	public static void main(String[] args) {
		MySingletonClass c = MySingletonClass.getObj();
		System.out.println(c.getI());
		c.setI(20);
		System.out.println(c.getI());
		MySingletonClass c2 = MySingletonClass.getObj();
		System.out.println(c2.getI());
	}

}
