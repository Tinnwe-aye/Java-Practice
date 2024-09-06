package stackpractice;

import java.util.Stack;

public class StackTest {

	static void StackTests() {
		System.out.println("*** Stack has only push,pop,peek and search***");
		Stack<Integer> stk=new Stack<>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		
		System.out.println(stk);
		
		stk.pop();
		System.out.println(stk);
		
		System.out.println(stk.peek());
		System.out.println(stk.search(1));
		
	}
	public static void main(String args[]) {
		StackTests();
	}

}
