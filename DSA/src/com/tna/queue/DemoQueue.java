package com.tna.queue;

public class DemoQueue {
	
	int front,rear,capacity;
	int[] queue;
	
	public DemoQueue(int c) {
		this.front = 0;
		this.rear = -1;
		this.capacity = c;
		this.queue = new int[capacity];
	}
	
	void enqueue(int n) {
		if(rear == capacity -1) {
			System.out.println("Queue is full.");
			return;
		}		
		queue[++rear] = n;
	}
	
	void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty.");
		}
		
		for(int i = 0; i < rear ; i++) {
			queue[i] = queue[i+1];
		}		
		rear--;
	}
	
	void peek()
	{
		if(isEmpty()) {
			System.out.println("Queue is Empty.No Peek.");
			return;
		}		
		System.out.println("Peek: "+queue[front]);
	}
	
	boolean isEmpty() {
		if(rear == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	int size() {
		return rear+1;
	}
	
	void display() {
		if(rear == -1) {
			System.out.println("Queue is Empty.");
			return;
		}
		for(int i = 0; i <= rear ; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println(" ");
	}
	
	 public static void main(String[] args) {
		 DemoQueue q = new DemoQueue(3);
	     
		 q.display();
		 q.peek();
		 System.out.println("Size: " + q.size());
		 System.out.println(q.isEmpty());
		 System.out.println("-----------------------------------");
		 
		 q.enqueue(1);
		 q.peek();
	     q.enqueue(2);
	     q.peek();
	     q.enqueue(3);
	     q.peek();
	     q.display();
	     System.out.println("Size: " + q.size());
	     System.out.println(q.isEmpty());
	     System.out.println("-----------------------------------");
	     
	     q.display();
	     q.peek();
	     System.out.println("Size: " + q.size());
	     System.out.println(q.isEmpty());
	     System.out.println("-----------------------------------");
	     
	     q.dequeue();
	     q.peek();
	     q.display();
	     q.dequeue();
	     q.peek();
	     q.display();
	     q.dequeue();
	     q.peek();
	     q.display();
	     System.out.println("Size: " + q.size());
	     System.out.println(q.isEmpty());
	     System.out.println("-----------------------------------");
	     
	     q.enqueue(4);
		 q.peek();
	     q.enqueue(5);
	     q.peek();
	     q.enqueue(6);
	     q.peek();
	     q.display();
	     System.out.println("Size: " + q.size());
	     System.out.println(q.isEmpty());
	     System.out.println("-----------------------------------");
	     
	    
	     
	 }
}

