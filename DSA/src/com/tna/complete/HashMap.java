package com.tna.complete;

import java.util.LinkedList;

public class HashMap<K,V> {
	
	private LinkedList<Node<K,V>>[] buckets;
	private int capacity = 16;
	private int size = 0;
	
	public static class Node<K,V>{
		K key;
		V value;
		Node<K,V> next;
		
		Node(K k,V v){
			key = k;
			value = v;
		}
	}
	
	public  HashMap(){
		buckets = new LinkedList[capacity];
	}
	
	private int getBucketIndex(K key) {
		int hashCode = key.hashCode();
		return Math.abs(hashCode) % capacity;
	}
	
	public void put(K key,V value) {
		int bucketIndex = getBucketIndex(key);
		if( buckets[bucketIndex] == null) {
			buckets[bucketIndex] = new LinkedList<>();
		}
		
		for(Node<K,V> node: buckets[bucketIndex]) {
			//update at same key
			if(node.key.equals(key)) {
				node.value = value;
				return;
			}
		}
		Node<K,V> newNode = new Node<>(key,value);
		buckets[bucketIndex].add(newNode);
		size++;
	}
	
	public V get(K key) {
		int bucketIndex = getBucketIndex(key);
		if(buckets == null) return null;
		for(Node<K,V> node: buckets[bucketIndex]) {
			if(node.key.equals(key)) {
				return node.value;
			}
		}
		return null;
	}
	
	public V remove(K key) {
		int bucketIndex = getBucketIndex(key);
		LinkedList<Node<K, V>> bucket = buckets[bucketIndex];
		if(buckets == null) return null;
		for(Node<K,V> node: bucket) {
			if(node.key.equals(key)) {
				bucket.remove(node);
				 size--;
	             return node.value;
			}
		}
		 return null;
	}
	
	public boolean containKey(K key) {
		return get(key) != null;
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
        for (int i = 0; i < capacity; i++) {
            if (buckets[i] != null) {
                buckets[i].clear();
            }
        }
        size = 0;
    }
	
	public void print() {
        for (int i = 0; i < capacity; i++) {
            if (buckets[i] != null) {
        		LinkedList<Node<K, V>> bucket = buckets[i];
            	for(Node<K,V> node: bucket) {
            		System.out.println(node.key+" "+node.value);
            	}             	
            }
        }
    }
	
	public static void main(String args[]) {
		HashMap<String,String> hm = new HashMap();
		hm.put("A","Apple");
		hm.put("B","Balcony");
		hm.put("C","Cirtrus");
		
		System.out.println(hm.get("A"));
		System.out.println(hm.get("C"));
		hm.print();
		hm.clear();
		hm.print();
	}
}
