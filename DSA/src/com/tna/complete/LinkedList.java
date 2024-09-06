package com.tna.complete;

/*\
 * addFirst()
 * addLast()
 * removeFirst()
 * removeLast()
 * getFirstLast()
 * getLast()
 * add with key
 * remove with key
 */
//Java program to implement
//a Singly Linked List , there has other , 
//Singly linked lists
//Doubly linked lists
//Circular linked lists - Circular Singly , Circular Doubly
//Header Linked List
public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static LinkedList insert(LinkedList list, int d) {
		
		Node new_node = new Node(d);  
		new_node.next = null;
		
		if(list.head == null) {
			list.head = new_node;
		} else {
			
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}		
		return list;
	}
	
	public static LinkedList removeFirst(LinkedList list)
	{
		Node current = list.head;
		if(current != null) {
			list.head = current.next;
		}
		return list;
	}
	
	public static LinkedList removeLast(LinkedList list)
	{
		Node currNode = list.head,prev = null;
		
		while(currNode.next != null) {
			prev = currNode;
			currNode = currNode.next;
		}

		//currNode is last one
		if (currNode != null) {
			prev.next = currNode.next;
		}
				
		return list;
	}
	
	public static LinkedList deleteByKey(LinkedList list, int key)
	{
		Node currNode = list.head;
		Node prev = null;		
		
		//Case 1
		//when current node is key,delete it
		if(currNode != null && currNode.data == key) {
			list.head = currNode.next;
			return list;
		}	
		
		//Case 2
		//when current node is not key,find it until key is current
		while (currNode != null && currNode.data != key) {
			// continue to next node
			prev = currNode;
			currNode = currNode.next;
		}
		// delete it
		if (currNode != null) {
			prev.next = currNode.next;
		}
		
		//Case 3
		//current is null , list is empty
		if (currNode == null) {
			System.out.println(key + " not found");
		}
		
		return list;
	}
	
	public static LinkedList deleteByPosition(LinkedList list, int position) {
		Node currNode = list.head,prev = null;
		
		//Case 1 , position is 0
		if(currNode != null && position == 0) {
			list.head = currNode.next;
			return list;
		}
		
		//case 2
		int counter = 0;
		while(currNode != null) {
			if(counter == position) {
				prev.next = currNode.next;
				break;
			} else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}
		return list;
	}
	
	public static LinkedList clear(LinkedList list) {
		list.head = null;
		return list;
	}	
	
	public static void printList(LinkedList list)
	{
		Node current = list.head;
		System.out.print("\nLinkedList: ");
		while(current != null) {
			System.out.print(current.data+ " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static int getLength(LinkedList list) {
		int length = 0;
		Node currNode = list.head;
		while(currNode != null) {
			currNode = currNode.next;
			length++;
		}
		System.out.println("Length: "+length);
		return length;
	}

	public static int getValueByPosition(LinkedList list,int position) {
		
		Node currNode = list.head,prev = null;
		
		if(currNode != null && position == 0) {
			System.out.println("Position "+position+": " +currNode.data);
			return  currNode.data;
		}
		
		int counter = 0;
		while(currNode != null) {
			if(position == counter) {
				System.out.println("Position "+position+": " +currNode.data);
				return  currNode.data;
			} else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}
		System.out.println("Position not found");
		return -1;
	}
	
	public static int getMiddleValue(LinkedList list) {
		
		int length = getLength(list)/2;
		return getValueByPosition(list,length);
	}
	
	public static int getMax(LinkedList list) {
		
		int max = Integer.MIN_VALUE;
		Node currNode = list.head;
		
		while(currNode != null) {
			if(currNode.data > max) {
				max = currNode.data;
			}
			currNode = currNode.next;
		}
		System.out.println("Max: "+ max);
		return max;
	}
	
	public static int getMin(LinkedList list) {
		int min = Integer.MAX_VALUE;
		
		Node currNode = list.head;
		while(currNode != null) {
			if(currNode.data < min) {
				min = currNode.data;
			}
			currNode = currNode.next;
		}
		System.out.println("Min: "+ min);
		return min;
	}
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		printList(list);
		
		// Insert the values
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 1);
		list = insert(list, 7);
		list = insert(list, 8);
		list = insert(list, 9);
		printList(list);
		
		//remove First Element
		list.removeFirst(list);	
		printList(list);
		
		//remove Last Elements
//		list.removeLast(list);	 
//		printList(list);
		
//		deleteByPosition(list,1);
//		printList(list);		
		
//		list.deleteByKey(list,1);
//		printList(list);
		
//		clear(list);
//		printList(list);
		
		//getLength(list);
		
		//getValueByPosition(list,0);
		
		//getMiddleValue(list);	
		
		//getMax(list);
		//getMin(list);
		
	}
}
