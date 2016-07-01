package com.string;

import java.util.ArrayList;
import java.util.List;

public class AllPalindromes {

	public AllPalindromes() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPalindrome(String str){
		
		if(str == null){
			return false;
		} else {
			int i=0;
			int j=str.length()-1;
			while(i<j){
				if(str.charAt(i)!=str.charAt(j)){
					return false;
				}
				i++;
				j--;
			}
		}
		return true;
	}
	
	public List<String> allPalindromes(String str){
		List<String> l = new ArrayList<String>();
		if(str == null){
			return null;
		} else {
			for(int i=0;i<str.length();i++){
				l.add(Character.toString(str.charAt(i)));
				for(int j=i+1;j<str.length();j++){
					if(isPalindrome(str.substring(i,j+1))){
						l.add(str.substring(i,j+1));
					}
				}
			}
		}
		
		return l;
	}
	
	public static void main(String[] args){
		AllPalindromes p = new AllPalindromes();
		List<String> l1 = p.allPalindromes("aaaaaaaaaaaaa");
		for(String s: l1){
			System.out.print(s+ " ");
		}
		
		System.out.println();
		
		List<String> l2 = p.allPalindromes("rajeev");
		for(String s: l2){
			System.out.print(s+ " ");
		}
	}

}
