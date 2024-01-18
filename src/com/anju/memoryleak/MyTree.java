package com.anju.memoryleak;

public class MyTree {
	
	public int TreeId;
	public String TreeName;
	public int Age;
	
	public MyTree() {}
	
	public MyTree(int TreeId, String TreeName, int Age) {
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

	/*************************************
	 * equals and hashCode methods needs to be overriden to 
	 * avoid memory leak if object of class is used as key for a Map
	 * ***********************************/		
	
	@Override
	public String toString() {
		return "Tree [TreeId=" + TreeId + ", TreeName=" + TreeName + ", Age=" + Age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Age;
		result = prime * result + TreeId;
		result = prime * result + ((TreeName == null) ? 0 : TreeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyTree other = (MyTree) obj;
		if (Age != other.Age)
			return false;
		if (TreeId != other.TreeId)
			return false;
		if (TreeName == null) {
			if (other.TreeName != null)
				return false;
		} else if (!TreeName.equals(other.TreeName))
			return false;
		return true;
	}	
    /*end;*************************************/
	

}
