package stackpractice;

import java.util.PriorityQueue;

class Person implements Comparable<Person>{
	int id;
	String name;
	int age;
	
	Person(int id,String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;				
	}

	@Override
	public int compareTo(Person o) {
		if(id>o.id){  
	        return 1;  
	    }else if(id<o.id){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}
}

public class priorityqueue {

	public static void main(String args[]) {
		
		PriorityQueue<Person> pqueue=new PriorityQueue<Person>();
		Person p1=new Person(1,"Peter",15);
		Person p2=new Person(2,"Smith",16);
		Person p3=new Person(3,"Jas",17);
		
		pqueue.add(p1);
		pqueue.add(p3);
		pqueue.add(p2);
		
		
		for(Person p:pqueue) {
			System.out.println(p.id+" "+p.name+" "+p.age);
		}
	}
}
