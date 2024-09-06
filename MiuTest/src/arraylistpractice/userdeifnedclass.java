package arraylistpractice;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	int id;
	String name;
	int age;
	
	Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
}

public class userdeifnedclass {
	
	public static void main(String args[]){
		
		List<Student> list=new ArrayList<Student>();
		Student stu1=new Student(1,"Smith",25);
		Student stu2=new Student(2,"Peter",20);
		list.add(stu1);
		list.add(stu2); 
		
		for(Student s:list) {
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
	}

}
