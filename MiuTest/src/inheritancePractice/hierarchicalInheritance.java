package inheritancePractice;

class Goat extends Animals{
	void pell() {System.out.println("Pell...");}
}
class Cat extends Animals{
	void meow() {System.out.println("Meow....");}
}

public class hierarchicalInheritance{
	public static void main(String args[]) {
		Goat g=new Goat();
		g.eat();
		g.pell();
		
		Cat c=new Cat();
		c.eat();
		c.meow();
		
	}
}
