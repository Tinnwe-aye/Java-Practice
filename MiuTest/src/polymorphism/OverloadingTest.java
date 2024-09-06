package polymorphism;

class AddMethod{
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	static double add(double a,double b, double c) {
		return a+b+c;
	}
	
}
public class OverloadingTest {
	
	public static void main(String args[]) {
		AddMethod am=new AddMethod();
		System.out.println(am.add(2,2));
		System.out.println(am.add(3,3,3));
		System.out.println(am.add(2.5,2.5,2.5));
	}

}
