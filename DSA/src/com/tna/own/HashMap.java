package com.tna.own;

import java.util.Arrays;
import java.util.LinkedList;

public class HashMap<K,V> {
	private LinkedList<Node<K,V>>[] buckets;
	private int capacity = 16;
	private int size = 0;
	
	public static class Node<K,V>{
		K key;
		V value;
		Node<K,V> next;
		Node(K key, V value){
			this.key = key;
			this.value = value;
		}
	}
	
	public HashMap() {
		buckets = new LinkedList[capacity];
	}
	
	public int getIndex(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public void put(K key,V value) {
		int index =  getIndex(key);
		if(buckets[index] == null) {
			buckets[index] = new LinkedList<>();			
		}
		
		for(Node<K,V> node: buckets[index]) {
			if(node.key.equals(key)) {
				node.value = value;
				return;
			}
		}
		
		Node newNode = new Node(key,value);
		buckets[index].add(newNode);
		size++;
			
	}
	
	public V get(K key) {
		int index =  getIndex(key);
		if(buckets[index] != null) {
			for(Node<K,V> node : buckets[index]) {
				if(node.key.equals(key)) {
					return node.value;
				}
			}
		}
		return null;
	}
	
	public void remove(K key) {
		int index =  getIndex(key);
		if(buckets[index] != null) {
			for(Node<K,V> node : buckets[index]) {
				if(node.key.equals(key)) {
					buckets[index].remove(key);
					size--;
				}
			}
		}
	}
	
	public void clear() {
	
		for(int i = 0;i <= size ; i++) {
			if(buckets[i] != null) {
				buckets[i].remove();
			}
		}
		size = 0;
	}

	public void print() {
		for(int i = 0;i <= size ; i++) {
			if(buckets[i] != null) {
				for(Node<K,V> node: buckets[i]) {
					System.out.println(node.key +" "+node.value);
				}
			}
		}
		System.out.println("----------------------------");
	}
	public static void main(String args[]) {
		HashMap<String,String> hm = new HashMap();

		
		hm.put("A","Apple");
		hm.put("B","Balcony");
		hm.put("C","Cirtrus");

		System.out.println(hm.get("B"));
		hm.print();
		
		hm.remove("C");
		hm.print();

		hm.clear();
		hm.print();
		
		System.out.println(hm.size);
	}

}
