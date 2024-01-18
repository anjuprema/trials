package com.anju.main;

public class Tree {
	
	public int TreeId;
	public String TreeName;
	public int Age;
	
	public Tree() {}
	
	public Tree(int TreeId, String TreeName, int Age) {
		this.TreeId = TreeId;
		this.TreeName = TreeName;
		this.Age = Age;
	}
	
	public void setTreeId(int TreeId) {
		this.TreeId = TreeId;
	}
	
	public int getTreeId() {
		return this.TreeId;
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

	@Override
	public String toString() {
		return "Tree [TreeId=" + TreeId + ", TreeName=" + TreeName + ", Age=" + Age + "]";
	}	

}
