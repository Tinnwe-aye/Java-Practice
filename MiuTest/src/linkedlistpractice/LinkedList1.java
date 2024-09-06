package linkedlistpractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	
	public static void LinkedListCreate(){
		LinkedList llist=new LinkedList();
		llist.add("A");
		llist.add(2);
		
		llist.addFirst(1);
		llist.addFirst(0);
		
		llist.addLast(3);
		llist.addLast(4);
		
		llist.removeFirst();
		llist.removeLast();
		
		llist.removeFirstOccurrence("A");
		llist.removeLastOccurrence(2);
		
		llist.clear();  
		
		llist.add("A");
		llist.add("A");
		llist.add("B");
		llist.add("B");
		llist.add("C");
		
		System.out.println();
		System.out.println(llist);
		System.out.println();
		
		System.out.println("***Iterator***");
		Iterator it=llist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("***descendingIterator to reverse***");
		Iterator itdec=llist.descendingIterator();
		while(itdec.hasNext()) {
			System.out.println(itdec.next());
		}
		
		System.out.println("***reverse with ListIterator***");
		ListIterator itlist=llist.listIterator(llist.size());
		while(itlist.hasPrevious()) {
			System.out.println(itlist.previous());
		}
		
		System.out.println("***Offer***");
		LinkedList<String> llistg=new LinkedList<String>();
		llistg.add("Add");
		//add last
		llistg.offer("Offer");
		//add first
		llistg.offerFirst("OfferFirst");
		//add last
		llistg.offerLast("OfferLast");
		System.out.println(llistg);
		
		System.out.println("***Peek***");
		LinkedList<String> peek=new LinkedList<String>();
		peek.clear();
		//peek -retrieve
		peek.add("Add1");
		peek.add("Add2");
		peek.peek();
		System.out.println(peek.peek());
		
		System.out.println("***PeekFirst***");
		LinkedList<String> peekFirst=new LinkedList<String>();
		//retrieve
		peekFirst.add("Add1");
		peekFirst.add("Add2");
		peekFirst.add("Add3");
		//peek -retrieve and return null
		peekFirst.peekFirst();
		System.out.println(peekFirst.peekFirst());
		System.out.println(peekFirst.peekLast());
		
		System.out.println("***poll***");
		LinkedList<String> poll=new LinkedList<String>();
		//retrieve and move
		poll.add("pool1");
		poll.add("pool2");
		poll.add("pool3");
		System.out.println(poll);
		System.out.println(poll.poll());
		System.out.println(poll);
		
		System.out.println("***pollFirst***");
		System.out.println(poll);
		System.out.println(poll.pollFirst());
		System.out.println(poll);
		System.out.println("***pollLast***");
		System.out.println(poll);
		System.out.println(poll.pollLast());
		System.out.println(poll);
		
		//pop - retrieve and move
		//push work like stack
		System.out.println("***pop***");
		LinkedList<String> pop=new LinkedList<String>();
		pop.add("pop1");
		pop.add("pop2");
		pop.add("pop3");
		
		while(pop.size()>0) {
			System.out.println(pop.pop());
			System.out.println(pop);
		}
		
		System.out.println("***push***");
		LinkedList<String> push=new LinkedList<String>();
		push.add("push1");
		push.add("push2");
		push.add("push3");
		
		push.push("push5");
		System.out.println(push);
			
	}
	
	public static void main(String args[]) {
		
		LinkedListCreate();
	}
}
