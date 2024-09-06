package com.tna.own;

public class LinkedList{
    Node head;
	public static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	static boolean isEmpty(LinkedList list){
		return list.head == null;
	}
	
	void clear(LinkedList list){
		list.head = null;
	}
	
	public static LinkedList insert(LinkedList list, int d) {
		Node newNode = new Node(d);
		newNode.next = null;
		
		if(list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		 
		return list;
	}
	
	public static void print(LinkedList list){
		Node currNode = list.head;
		System.out.print("LInkedList: ");
		while(currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}

	public static LinkedList removeFirst(LinkedList list) {
		
		Node currNode = list.head;
		if(currNode != null ) {
			list.head = currNode.next;
		}					
		return list;
	}
	
	public static LinkedList removeLast(LinkedList list) {
		
		Node currNode = list.head,prev = null;
		
		while(currNode.next != null) {
			prev = currNode;
			currNode = currNode.next;
		}
		
		prev.next = currNode.next;
		
		return list;
	}
	
	
	public static LinkedList deleteByValue(LinkedList list, int value)
	{	
		Node currNode = list.head,prev = null;
		
		if(currNode != null && currNode.data == value) {
			list.head = currNode.next;
			return list;
		} 
		while(currNode != null && currNode.data != value) {
			prev = currNode;
			currNode = currNode.next;
		}
		
		prev.next = currNode.next;
		
		return list;
	}
	
	public static LinkedList deleteByIndex(LinkedList list,int index){
		
		Node currNode = list.head,prev = null;
		int count = 0;
		
		if(currNode != null && count == index) {
			list.head = currNode.next;
			return list;
		}
		
		while(currNode != null && count != index) {
			prev = currNode;
			currNode = currNode.next; 
			count++;
		}
		
		prev.next = currNode.next;		
		
		return list;
	}
	
	public static int getByIndex(LinkedList list,int index) {
		Node currNode = list.head;
		int count = 0;
		
		while(currNode != null && count != index) {
			currNode = currNode.next;
			count++;
		}
		return currNode.data;
	}
	
	public static int getMax(LinkedList list) {
		Node currNode = list.head;
		int max = Integer.MIN_VALUE;
		while(currNode != null) {
			if(currNode.data > max) {
				max = currNode.data;
			}
			currNode = currNode.next;
		}
		return max;
	}
	
	//Method
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		
		boolean a = list.isEmpty(list);
		System.out.println(a);
		
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		print(list);
		
//		list = removeFirst(list);
//		print(list);
//		
//		list = removeLast(list);
//		print(list);
		
		list = deleteByValue(list,3);
		print(list);
		
		list = deleteByIndex(list,2);
		print(list);
		
		System.out.println("Index 1 : "+ getByIndex(list,1));
		System.out.println("Maximum: " + getMax(list));
		
		
	}
}
