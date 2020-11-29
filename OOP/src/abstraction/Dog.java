package abstraction;

public class Dog extends Animal implements IAnimal, IPerson{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void animalSound() {
		System.out.println("The dog says: hav hav!");
	  
	}

	@Override
	public String GetNameWithDesciption() {
		// TODO Auto-generated method stub
		return null;
	}


}
