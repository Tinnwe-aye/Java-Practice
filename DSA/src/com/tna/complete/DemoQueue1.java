package com.tna.complete;

import java.util.Arrays;

public class DemoQueue1 {
	int front,rear,capacity;
	int[] queue;
	
	public DemoQueue1(int c) {
		front = 0;
		rear = -1;
		capacity = c;
		queue = new int[c];
	}
	
	boolean isEmpty() {
		return (rear == -1) ? true : false;
	}

	int size() {
		return rear+1;
	}
	int[] display() {		
		if(isEmpty()) return new int[0];		
		int[] finalQueue = new int[rear+1];
		for(int k = 0; k <= rear ;k++) {
			finalQueue[k] = queue[k];
		}
		return finalQueue;
	}
	
	int[] enqueue(int n) {
		if(rear == capacity -1) {
			System.out.println("Queue is full");
			return this.display();
		}		
		queue[++rear] = n;
		return this.display();
	}
	
	int dequeue(){
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int tmp = queue[front];
		for(int k = 0; k < rear ;k++) {
			queue[k] = queue[k+1];
		}
		rear--;
		return tmp;
	}	
	int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		} else {
			return queue[front];
		}
	}
	public static void main(String[] args) {
		 DemoQueue1 q = new DemoQueue1(4);
		 
		 System.out.println(Arrays.toString(q.display()));
		 q.enqueue(1);
		 q.enqueue(2);
		 q.enqueue(3);
		 System.out.println(Arrays.toString(q.enqueue(4)));
		 System.out.println("Peek: "+ q.peek());
		 System.out.println("-----------------------------------");
		 
		 
		 System.out.println(Arrays.toString(q.display()));
		 q.dequeue();
		 q.dequeue();
		 System.out.println("Dequeue: "+q.dequeue());
		 System.out.println("Peek: "+ q.peek());
		 System.out.println("-----------------------------------");
		 
		 System.out.println(Arrays.toString(q.display()));
		 System.out.println("Dequeue: "+q.dequeue());
		 System.out.println("Peek: "+ q.peek());
		 System.out.println("-----------------------------------");
		 

//		 Convert character array to String using StringBuilder
//		 char[] nums = {'A','B','C'};
//		 StringBuilder str = new StringBuilder();
//	     str.append(nums);
//	     System.out.println(str);
		 
		 

	 }
}
