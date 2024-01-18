package com.anju.pkg1;

class Footware{
	String type;
	int code;
	
	public Footware(String type, int code) {
		this.type = type;
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Footware [type=" + type + ", code=" + code + "]";
	}	
}
class Shoes extends Footware{
	String shoeModel;
	
	public Shoes(String shoeModel, String type, int code) {
		super(type, code);
		this.shoeModel = shoeModel;
		//super.type = type;
		//super.code = code;
	}

	public String getShoeModel() {
		return shoeModel;
	}

	public void setShoeModel(String shoeModel) {
		this.shoeModel = shoeModel;
	}

	@Override
	public String toString() {
		return "Shoes [shoeModel=" + shoeModel + "]";
	}	
}
public class UpAndDownCasting {
	public static void main(String[] args) {
		//UpCasting
		Footware ft = new Shoes("MDL1223", "Walking Shoe", 1223);
		System.out.println(ft.getCode());
		System.out.println(ft.getType());
		//System.out.println(ft.getShoeModel()); // change type of ft to Shoes and see..
		//getShoeModel() wont be available as it is method of child
		//when upcasted it is lost..
		
		System.out.println("*****************************");
		//Downcasting
		Footware ft2 = new Shoes("MDL9987", "Converse", 9987);
		Shoes sh = (Shoes) ft2;
		System.out.println(sh.getCode());
		System.out.println(sh.getShoeModel());
		System.out.println(sh.getType());
	}

}
