package com.tree;

import java.util.HashMap;

public class Trie {
	
	TrieNode root;

	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String input){
		
		if(input!=null){
			
			HashMap<Character,TrieNode> children = root.children;
			for(int i=0;i<input.length();i++){
				char c = input.charAt(i);
				TrieNode node;
				
				if(children.containsKey(c)){
					 node = children.get(c);
					children = node.children;
				}else{
					node = new TrieNode(c);
					children.put(c, node);
					children = node.children;
				}
				
				if(i == input.length()-1){
					node.isLeaf = true;
				}
			}
		}
		
	}
	
	public boolean search(String input){
		HashMap<Character,TrieNode> children = root.children;
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			TrieNode node;
			if(children.containsKey(c)){
				node = children.get(c);
				children = node.children;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Trie t = new Trie();
		t.insert("d");
		t.insert("dog");
		t.insert("doggonit");
		
		System.out.println("Does prefix exist ? " + t.search("dog"));
		System.out.println("Does prefix exist ? " + t.search("dag"));
		System.out.println("Does prefix exist ? " + t.search("doggoniti"));


	}
	
	
	public static class TrieNode{
		
		char c;
		HashMap<Character,TrieNode> children = new HashMap<Character,TrieNode>();
		boolean isLeaf;
		
		public TrieNode(){
		}
		
		public TrieNode(char c){
			this.c = c;
		}
		
	}

}
