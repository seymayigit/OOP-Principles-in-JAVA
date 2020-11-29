package abstraction;

//abstract class
public abstract class Animal implements IPerson{

	String name;

	public Animal(String name) {
		this.name = name;
	}

	// abstract method (unimplemented method)
	public abstract void animalSound();

	// implemented method
	public void run() {
		System.out.println(this.name + " can run.");
	}

}
