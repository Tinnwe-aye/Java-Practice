package inheritancePractice;

class Animals
{
	void eat() {System.out.println("Eating..");}
}

class Dogs extends Animals{
	void bark() {System.out.println("Barking...");}
}

class BabyDog extends Dog{
	void cute() {System.out.println("Cute...");}
}
public class multipleLevelInheritance {
	
	public static void main(String args[]) {
		BabyDog d = new BabyDog();
		d.eat();
		d.bark();
		d.cute();
	}

}
