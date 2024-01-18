package com.anju.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalSample {
	private List <Tree> treeList = new ArrayList <Tree>();
	private List<Tree> generateList(){
		Tree t1 = new Tree(1, "Peepal", 25);
		Tree t2 = new Tree(2, "Banyan", 120);
		Tree t3 = new Tree(3, "Gulmohar", 31);
		treeList.add(t1); treeList.add(t2); treeList.add(t3);
		return treeList;
	}
	private Optional<Tree> isPresent(String treeName) {		
		for(int i=0; i<treeList.size(); i++) {
			if(treeList.get(i).getTreeName().equalsIgnoreCase(treeName))
				return Optional.of(treeList.get(i));
		}
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		OptionalSample os = new OptionalSample();
		List <Tree> l = os.generateList();
		Optional <Tree> t = os.isPresent("Peepal");
		if(t.isPresent())System.out.println(t);
	}

}
