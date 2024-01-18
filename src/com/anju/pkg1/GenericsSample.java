package com.anju.pkg1;

class GenericClass<T,T1>{
	T obj;
	T1 obj1;
	
	public GenericClass(T obj, T1 obj1) {
		super();
		this.obj = obj;
		this.obj1 = obj1;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T1 getObj1() {
		return obj1;
	}

	public void setObj1(T1 obj1) {
		this.obj1 = obj1;
	}	
}

public class GenericsSample {

	public static void main(String[] args) {
		GenericClass<String,Float> gs = new GenericClass("Hello",3.14F);
		System.out.println("Generic string="+gs.getObj()+", type="+gs.obj.getClass());
		System.out.println("Generic string="+gs.getObj1()+", type="+gs.obj1.getClass());
		
		GenericClass<Integer,Double> gi = new GenericClass(123, 55.55);
		System.out.println("Generic int="+gi.getObj()+", type="+gi.obj.getClass());
		System.out.println("Generic string="+gi.getObj1()+", type="+gi.obj1.getClass());
	}

}
