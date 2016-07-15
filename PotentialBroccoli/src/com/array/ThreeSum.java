package com.array;

import java.util.HashMap;
import java.util.Map;

public class ThreeSum {

	public ThreeSum() {
		// TODO Auto-generated constructor stub
	}
	
	public void store(Map<Integer, Integer> m, int ar[]){
		if(ar!=null){
			for(int i=0;i<ar.length;i++){
				m.put(ar[i], i);
			}
		}
	}

	public boolean threeSum(int[] ar){
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		store(m, ar);
		if(ar == null){
			return false;
		} else {
			for(int i=0;i<ar.length;i++){
				for(int j=i+1;j<ar.length;j++){
					int sum = ar[i] + ar[j];
					if(m.containsKey(-sum)){
						int index = m.get(-sum);
						if(index!=i && index!=j){
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}
	
	public static void main(String args[]){
		
		//three sum a + b + c = 0;
		ThreeSum ts = new ThreeSum();
		int ar[] = {-1,-2,5,7,3,2,1};
		System.out.println("Three sum exists ? " + ts.threeSum(ar));
		
		int ar1[] = {1,-1,2,-2,3,-1};
		System.out.println("Three sum exists ? " + ts.threeSum(ar1));
		
	}
}
