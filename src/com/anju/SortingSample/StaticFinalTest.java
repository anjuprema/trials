package com.anju.SortingSample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Beta{
	int id;
	String val;
}

class Config{
	final float PI;
	final String appName;
	int beta[] = new int[10];
	final static boolean status;
	//final int blankvar;
	static String appVersion;
	
	static {
		status = true;
		appVersion = "V1.0.0";
		System.out.println("Hello World");
	}
	
	Config(float pi, String app, int[] b){
		this.PI = pi;
		this.appName = app;
		this.beta = b;
	}
}

class NewConfig extends Config{

	NewConfig(float pi, String app, int[] b) {
		super(pi, app, b);
		// TODO Auto-generated constructor stub
	}
	
}

public class StaticFinalTest {

	public static void main(String[] args) {
		int[] arr = {10, 20, 10};
		Config c = new Config(3.14F, "My App", arr);
		System.out.println(c.PI);
		System.out.println(c.appName);
		System.out.println(c.beta[0]);	
		//c.PI = 2.34F;
		c.beta[0] = 22;
		System.out.println(c.beta[0]);
		System.out.println("App Version:"+c.appVersion);
		c.appVersion = "V2.0.0";
		
		NewConfig nc = new NewConfig(99.78F, "My New App", arr);
		System.out.println(nc.PI);
		//nc.PI = 2.44F;
		System.out.println(c.appVersion);
		System.out.println(nc.appVersion);		
	}

}
