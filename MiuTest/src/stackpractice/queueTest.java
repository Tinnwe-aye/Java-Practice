package stackpractice;

import java.util.LinkedList;
import java.util.Queue;

public class queueTest {
	public static void main(String args[]) {
		System.out.println("***QueueWithLinkedList***");
		Queue<String> q=new LinkedList<>();
		q.add("a");
		q.add("b");
		q.add("c");
		System.out.println(q);
		//retrieve first, if queue is empty,return null
		System.out.println(q.peek());
		//if queue is empty, error will occur.
		System.out.println(q.element());
		//retrieve and remove
		System.out.println(q.poll());		
		
		System.out.println(q);
	}
}
