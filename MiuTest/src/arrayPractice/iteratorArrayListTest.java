package arrayPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iteratorArrayListTest {
	
	public void IteratorSample() {
		//Default ArrayList
		System.out.println("***Default ArrayList***");
		ArrayList al=new ArrayList();
		al.add("A");
		al.add(1);
		al.add("B");
		al.add(2);
		System.out.println(al);
			
		//Integer Array List
		System.out.println("***Integer Array List***");
		ArrayList<Integer> itint=new ArrayList<>();
		itint.add(1);
		itint.add(2);
		
		Iterator<Integer> iteratorint=itint.iterator();
		while(iteratorint.hasNext()) {
			Integer number = iteratorint.next();
			System.out.println(number);
		}
		
		ArrayList<String> num=new ArrayList<>();
		num.add("a");
		num.add("b");
		num.add("c");
		
		ArrayList<String> number=new ArrayList<>();
		number.add("1");
		number.add("2");
		number.add("3");
		// number.addAll(num);
		
		//add in index
		number.addAll(2,num);
		System.out.println("***Add Two ArrayList***");
		System.out.println(number);
		
		//Iterator
		System.out.println("***Iterator***");
		Iterator<String> it=num.iterator();
		
		while(it.hasNext()) {
			String i = it.next();  
			System.out.println(i);  
		}
		
		//ListIterator
		System.out.println("***ListIterator***");
		ListIterator<String> listit=num.listIterator();
		ListIterator<String> listitreverse=num.listIterator(num.size());
		
		while(listit.hasNext()) {
			String i = listit.next();  
			System.out.println(i);  
		}
		System.out.println("***Reverse ListIterator***");
		while(listitreverse.hasPrevious()) {
			String j = listitreverse.previous();  
			System.out.println(j);
		}
	}
}
