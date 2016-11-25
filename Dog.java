class Dog{

	int size;
	String breed;
	String name;

	void bark() {
		System.out.println("Ruff! Ruff!");
	}
}

class Cat{
	int size;
	String breed;
	String name;

	void bark(){
		System.out.println("I'm a cat.");
	}
}

class DogTestClass{
	public static void main (String[] args){
		Dog d = new Dog();
		d.size = 40;
		d.bark();
		Cat c = new Cat();
		c.bark();
		c.breed = "Maine Coon";
	}
}