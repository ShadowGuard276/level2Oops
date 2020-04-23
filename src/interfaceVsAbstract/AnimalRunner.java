package interfaceVsAbstract;

abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {
	public void sound() {
		System.out.println("bow bow");

	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("Meow meow");

	}
}

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals= {new Dog(), new Cat()};
		for(Animal animal:animals) {
			animal.sound();
		}
		
	}

}
