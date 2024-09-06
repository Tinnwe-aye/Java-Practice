package inheritancePractice;

interface C1{
	default void draw(){System.out.println("This is Circle.");}
}

interface C2{
	default void draw() {System.out.println("This is Triangle.");}
}

class Test implements C1,C2{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		C1.super.draw();
		C2.super.draw();
	}
	
}
public class multipleInterfaceInheritance {
	
	public static void main(String args[]) {
		Test t=new Test();
		t.draw();
	}
}
