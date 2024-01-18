package com.anju.SortingSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ShoppingCart implements Comparable<ShoppingCart>{
	int itemId;
	String itemName;
	float itemAmount;	
	
	public ShoppingCart(int itemId, String itemName, float itemAmount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemAmount = itemAmount;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemAmount() {
		return itemAmount;
	}
	public void setItemAmount(float itemAmount) {
		this.itemAmount = itemAmount;
	}
	@Override
	public int compareTo(ShoppingCart o) {
		if(o.getItemAmount() - this.itemAmount >0) return 1;
		else return -1;		
	}
	@Override
	public String toString() {
		return "ShoppingCart [itemId=" + itemId + ", itemName=" + itemName + ", itemAmount=" + itemAmount + "]";
	}
}

class CompareName implements Comparator<ShoppingCart>{
	@Override
	public int compare(ShoppingCart o1, ShoppingCart o2) {
		return o1.itemName.compareTo(o2.itemName);
	}
	
}

public class SortingTest {

	public static void main(String[] args) {
		List <ShoppingCart> cart = new ArrayList<>();
		cart.add(new ShoppingCart(1,"Apple",23.5F));
		cart.add(new ShoppingCart(2, "Mushroom", 80));
		cart.add(new ShoppingCart(3, "Tea Powder", 120.90F));
		cart.add(new ShoppingCart(4, "Cachew", 300.50F));
		
		System.out.println(cart.toString());
		Collections.sort(cart);
		System.out.println(cart.toString());
		
		System.out.println("*******************************");
		
		System.out.println(cart.toString());
		Collections.sort(cart, new CompareName());
		System.out.println(cart.toString());
		
		System.out.println("*******************************");
		System.out.println(cart.toString());
		Collections.sort(cart, (a1, a2) -> a2.itemId - a1.itemId);
		System.out.println(cart.toString());
		
		SortingTest st = new SortingTest();
		st.sortList(cart, 10);
	}
	
	private void sortList(final List<ShoppingCart> cart, final int i) {
		System.out.println("*******************************");
		System.out.println(cart.toString());
		Collections.sort(cart, new CompareName());
		System.out.println(cart.toString());
		cart.add(new ShoppingCart(5, "FinalTest", 300.50F));
		System.out.println(cart.toString());
		System.out.println(i);
		//i = 20;	//Not Possible	
	}

}

