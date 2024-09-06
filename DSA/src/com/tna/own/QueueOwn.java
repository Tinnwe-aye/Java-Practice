package com.tna.own;

public class QueueOwn{
	int front;
	int rear;
	int[] queue;
	int capacity;

	QueueOwn(int c){
		front = 0;
		rear = -1;
		capacity = c;
		queue = new int[capacity];
	}

	boolean isEmpty() { return rear == -1; }
	
	boolean isFull() { return rear == capacity -1;}
	
	Integer peek() {
		if(isEmpty()) {
			return null;
		}
		return queue[front];
	}

	void enqueue(int n) {
		if(isFull()){
			System.out.println("Queue is Full");
			return;
		}
		
		rear++;
		queue[rear] = n;
	} 

	void dequeue() {
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		
		for(int i = 0; i < rear ; i++){
			queue[i] = queue[i+1];
		}
		rear--;
	} 

	void display() {
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		
		for (int i = 0; i <= rear ; i++){
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	} 
	
	public static void main(String args[]) {
		QueueOwn qo = new QueueOwn(5);
		qo.enqueue(1);
		qo.enqueue(2);
		qo.enqueue(3);
		qo.enqueue(4);
		qo.enqueue(5);
		qo.enqueue(6);		
		qo.display();
		System.out.println("Peek: " + qo.peek());
		
		qo.dequeue();
		qo.dequeue();
		qo.dequeue();
		qo.display();
		System.out.println("Peek: " + qo.peek());
		
		qo.dequeue();
		qo.dequeue();
		qo.display();
		System.out.println("Peek: " + qo.peek());
		
		qo.enqueue(7);
		qo.enqueue(8);		
		qo.display();
		System.out.println("Peek: " + qo.peek());
		
	}

}
