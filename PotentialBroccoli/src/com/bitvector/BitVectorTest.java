package com.bitvector;

import java.util.BitSet;

public class BitVectorTest {

	public BitVectorTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static Integer findDuplicate(int array[]){
		
		BitSet bs = new BitSet(32000);
		for(int i=0;i<array.length;i++){
			if(bs.get(array[i])){
				return array[i];
			} else {
				bs.set(array[i], true);
			}
		}
		return null;
	}
	
	public static void main(String[] args){
		
		String s1 = "cd";
		String s2 = "abcde";
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i) == s2.charAt(j)){
					System.out.println("Got here");
					break;
				}
			}
		}
		
		int array[] = new int[32000];
		for(int i=0;i<array.length;i++){
			array[i] = i;
			if(i==54){
				array[i+1] = 54;
				i++;
			}
		}
		
		System.out.println("Duplicate value = " + findDuplicate(array));
		BitSet bs = new BitSet(Integer.MAX_VALUE);
		for(int i=0; i<500;i++){
			bs.set(i, true);
		}
		
		System.out.println("Bitset length" + bs.length());
		for(int i=0;i<503;i++){
			if(bs.get(i) == false){
				System.out.println(i);
			}
		}
	}

}
