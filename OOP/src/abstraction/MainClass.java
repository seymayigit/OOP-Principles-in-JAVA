package abstraction;

public class MainClass {

	public static void main(String[] args) {
		Dog myDog = new Dog("Lucifer");
		// or
		Animal myDog1 = new Dog("Angel");

		myDog.run();
		myDog1.run();

	}

}
