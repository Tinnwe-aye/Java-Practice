package polymorphism;

class Animals{
	protected void bite() {
		System.out.println("Bite...");
	}
}

class Dog extends Animals{
	protected void bite() {
		System.out.println("Dog is bite.");
	}
}

class Cat extends Animals{
	protected void bite() {
		System.out.println("Cat is bite.");
	}
}

public class overridingTest{	
	public static void main(String args[]) {
		Dog d=new Dog();
		d.bite();
		
		Cat c=new Cat();
		c.bite();
	}
}
