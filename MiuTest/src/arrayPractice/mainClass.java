package arrayPractice;

import java.util.Arrays;

public class mainClass {

	public static void main(String args[]) {
		
		SimpleArray sa = new SimpleArray("Array","Array");
		System.out.println(sa.type+" "+sa.process);
		System.out.println(Arrays.toString(sa.CreateArray()));
		System.out.println("-------------------------------");
		
		SimpleArray al = new SimpleArray("Array","ArrayList");	
		System.out.println(al.type+" "+al.process);
		System.out.println(al.CreateArrayList());
		System.out.println("-------------------------------");
		
		System.out.println(sa.CreateListOfArrayList());
		System.out.println("-------------------------------");
		
		
		retainAllExample retain = new retainAllExample();
		retain.retainAllTest();
		System.out.println("-------------retainAll Finish------------");
		
		iteratorArrayListTest it=new iteratorArrayListTest();
		it.IteratorSample();
		System.out.println("----------Iterator Finish----------------");
	}
}
