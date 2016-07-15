package com.array;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class RopesMinimumCost {

	public RopesMinimumCost() {
		// TODO Auto-generated constructor stub
	}
	
	public int findMinimumCost(ArrayList<Integer> list){
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.addAll(list);
		
		int totalCost = 0;
		while(queue.size() >= 2){
			int a = queue.poll();
			int b = queue.poll();
			
			int cost = a+b;
			queue.add(cost);
			totalCost += cost;

		}
		
		return totalCost;
		
	}
	
	public static void main(String[] args){
		RopesMinimumCost obj = new RopesMinimumCost();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(6);
		
		System.out.println("Total cost = " + obj.findMinimumCost(list));
	}

}
