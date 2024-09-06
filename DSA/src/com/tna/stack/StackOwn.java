package com.tna.stack;

import java.util.Arrays;

public class StackOwn {
	private int top;
	private int maxSize;
	int[] stack;
	
	StackOwn(int size){
		top = -1;
		maxSize = size;
		stack = new int[maxSize];
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	
	Integer peek() {
		if(isEmpty()) {
			System.out.println("Peek: Stack is Empty");
			return null;
		}else {
			return stack[top];
		}
	}
	
	boolean isFull() {
		return maxSize -1 == top ;
	}
	
	void push(int n) {
		System.out.println(isFull());
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		
		top++;
		stack[top] = n;
	}
	
	void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		
		top--;
	}
	
	int[] display() {
		int[] finalStack = new int[top+1];
		
		for(int i = 0; i <= top ; i++) {
			finalStack[i] = stack [i];
		}
		
		return finalStack;
	}
	
	public static void main(String args[]) {
		StackOwn stack = new StackOwn(5);
		 stack.push(1);
		 stack.push(2);
		 stack.push(3);
		 stack.push(4);
		 stack.push(5);
		 stack.push(6);
		 System.out.println(Arrays.toString(stack.display()));
		 System.out.println("Peek: "+stack.peek());
		 
		 stack.pop();
		 stack.pop();
		 stack.pop();
		 stack.pop();
		 stack.pop();
		 stack.pop();
		 System.out.println(Arrays.toString(stack.display()));	
		 System.out.println("Peek: "+stack.peek());
		 
		 stack.push(5);
		 System.out.println(Arrays.toString(stack.display()));
		 System.out.println("Peek: "+stack.peek());
		 
	}
}
