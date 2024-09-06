package linkedlistpractice;

import java.util.LinkedList;

class Person{
	int id;
	String name;
	int age;
	Person(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class userdefinedclass {
	public static void main(String args[]) {
		LinkedList<Person> plist=new LinkedList();
		
		Person p1=new Person(1,"Peter",15);
		Person p2=new Person(2,"Snare",16);
		
		plist.add(p1);
		plist.add(p2);
		
		for(Person p:plist) {
			System.out.println(p.id+" "+p.name+" "+p.age);
		}
	}
	
}
