package com.anju.pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;

class SingletonSample implements Serializable{
	public int i = 222;
	private static SingletonSample sObj = new SingletonSample();
	public static SingletonSample getSObj() {
		return sObj;
	}
}

class MyTree implements Serializable{	
	public int TreeId;
	public String TreeName;
	public int Age;
	static float PI = 3.14F;
	
	public MyTree() {}
	
	public MyTree(int TreeId, String TreeName, int Age) {
		this.TreeId = TreeId;
		this.TreeName = TreeName;
		this.Age = Age;
	}

	public int getTreeId() {
		return TreeId;
	}

	public void setTreeId(int treeId) {
		TreeId = treeId;
	}

	public String getTreeName() {
		return TreeName;
	}

	public void setTreeName(String treeName) {
		TreeName = treeName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}	

	public static float getPI() {
		return PI;
	}

	public static void setPI(float pI) {
		PI = pI;
	}

	@Override
	public String toString() {
		return "MyTree [TreeId=" + TreeId + ", TreeName=" + TreeName + ", Age=" + Age + "]";
	}	
}
public class SerializingSample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		MyTree mt = new MyTree(122, "Banyan", 122);
		
		//Serialize and Write to a file
		FileOutputStream fo = new FileOutputStream("mytree.ser");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(mt);
		
		//Read serialized object from file
		FileInputStream fi = new FileInputStream("mytree.ser");
		ObjectInputStream oi = new ObjectInputStream(fi);
		MyTree mt1 = (MyTree) oi.readObject();
		System.out.println(mt1.TreeName);
		System.out.println(mt1.PI);
		System.out.println("Is same? "+ mt.equals(mt1));
		
		SingletonSample ss = SingletonSample.getSObj();
		FileOutputStream fs = new FileOutputStream("singleton.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(ss);
		FileInputStream rs = new FileInputStream("singleton.ser");
		ObjectInputStream ro = new ObjectInputStream(rs);
		SingletonSample sr = (SingletonSample) ro.readObject();
		System.out.println(sr.i);
		
	}
}
