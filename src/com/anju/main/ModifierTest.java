package com.anju.main;

class ModifierCandidate{
	private double myPI = 3.01;
	static double PI = 3.14;   // static double PI = myPI; not possible as static wont 
							   // get nonstatic before object creation
	final String myName = "Anju";
	
	 static {
		 System.out.println("Hello from static block...");
	 }

}

class ModifierExtended extends ModifierCandidate{	
	String myName = "Anju Prema";
	
}

public class ModifierTest {
	public static void main(String[] args) {
		System.out.println(ModifierCandidate.PI);
		ModifierCandidate mc = new ModifierCandidate();
		System.out.println(ModifierCandidate.PI);
		ModifierExtended me = new ModifierExtended(); // if somebody changes PI all objects gets affected
		me.PI = 3.33;
		System.out.println(ModifierCandidate.PI);
		System.out.println(me.PI);
		
		String abc = String.valueOf(me.PI);
	}

}
