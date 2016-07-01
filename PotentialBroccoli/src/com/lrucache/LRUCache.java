package com.lrucache;

import java.util.LinkedHashMap;

public class LRUCache<K,V> extends LinkedHashMap<K, V>{
	int capacity;

	public LRUCache(int capacity) {
// The third argument forces the cache to use access order. If false, then it uses insertion order.
		super(0, (float)0.75, true);
		this.capacity = capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		// remove the oldest element when size limit is reached
				return size() > capacity;
//		return super.removeEldestEntry(eldest);
	}
	
	public static void main(String args[]){
		LRUCache<String,Integer> lru = new LRUCache<>(3);
		lru.put("a", 2);
		lru.put("b", 3);
		lru.put("c", 3);
		
		for(String s: lru.keySet()){
			System.out.print(s + " ");
		}
		System.out.println();
		lru.get("a");
		for(String s: lru.keySet()){
			System.out.print(s + " ");
		}
		lru.put("d",7);
		System.out.println();
		for(String s: lru.keySet()){
			System.out.print(s + " ");
		}
		
	}
	

}
