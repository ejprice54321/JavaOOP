class Dog2{

	int size;
	String breed;
	String name;

	void bark() {
		System.out.println("Ruff! Ruff!");
	}
}

class DogTestClass{
	public static void main (String[] args){
		Dog2[] d = new Dog2[3];
		int x = 0;
		int y = 0;
		d[0] = new Dog2();
		d[1] = new Dog2();
		d[2] = new Dog2();
		d[0].size = 30;
		d[1].size = 40;
		d[2].size = 50;
		d[0].breed = "lab";
		d[1].breed = "hound";
		d[2].breed = "poodle";
		while (x <3){
			d[x].bark();
			x++;
			if (d[x].size > y){
				y = d[x].size;
				System.out.println(y);
				y++;
			}
		}
	}
}