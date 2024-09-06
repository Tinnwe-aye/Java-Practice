package com.tna.stack;

import java.util.Arrays;

public class StackTest {
	
	int front,rear,capacity;
	int[] stack;
	
	public StackTest(int c) {
		front = 0;
		rear = -1;
		capacity = c;
		stack = new int[capacity];
	}
	int[] display() {
		if(isEmpty()) return new int[0];
		int[] finalQueue = new int[rear+1];
		for(int k = 0; k <= rear ;k++) {
			finalQueue[k] = stack[k];
		}
		return finalQueue;
	}
	boolean isEmpty() {
		return (rear == -1) ? true : false;
	}
	
	int Size() {
		return rear+1;
	}
	int[] push(int n) {
		if(rear == capacity -1) {
			System.out.println("Stack is full");
			return this.display();
		}		
		stack[++rear] = n;
		return this.display();
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int tmp = stack[rear];
		rear--;
		return tmp;
	}
	int peek() {
		if(isEmpty()) {
			System.out.println("Since Queue is Empty,Peek will be -1");
			return -1;
		} else {
			return stack[rear]; 
		}
	}
	
	public static void main(String args[]) {
		StackTest stack = new StackTest(3);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Peek: "+ stack.peek());
		System.out.println(Arrays.toString(stack.push(4)));

		System.out.println(stack.pop());
		System.out.println("Peek: "+ stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("Peek: "+ stack.peek());
		
		System.out.println(Arrays.toString(stack.push(4)));
		System.out.println("Peek: "+ stack.peek());
	}

}
