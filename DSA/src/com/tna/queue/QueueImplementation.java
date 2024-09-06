package com.tna.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
	
	public static void main(String args[]) {		
		Queue<String> queue = new LinkedList<>();
		System.out.println("Initial Queue: " + queue);  
		queue.add("Apple");
		queue.add("Balcony");
		queue.add("Coffee");
		queue.add("Durian");
		System.out.println("Initial Queue: " + queue);  
		
		String peekQueue = queue.peek();
		System.out.println("Peek Queue: " + peekQueue); 
		
		String removeQueue = queue.remove();
		System.out.println("Remve Queue: " + removeQueue);
		
		queue.add("Elderberry");
		System.out.println("Add Queue: " + queue);
		
	}

}
