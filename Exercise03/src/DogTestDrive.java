class Dog{

//    Make some Doggies, set their size, and check if it is bigger than another dog

    private int size;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int s) {
        this.size = s;
    }

    boolean isBigger(Dog d){
        return (this.getSize() > d.getSize());
    }
}

class DogPack{

//    make an array of Doggies and also pick the biggest one

    private Dog[] dogs;

    public void makeArray(int size){
        Dog[] dogs = new Dog[10];
    }

    public void addDog(int index, Dog dog){
        dogs.add(index,dog);
    }

    public Dog biggestDog(){
        Dog biggest = dogs.get(0);
        for (Dog dog : dogs){
            if(dog.isBigger(biggest)){
                biggest = dog;
            }
        }
        return biggest;
    }

}

class DogTestDrive{

    // call DogPack and Dog to make 10 dogs and set their size

    public static void main (String[] args){;
        int[] sizes = new int[10];
        int x = 0;
        while (x < sizes.length){
            sizes[x] = x*10;
            x = x + 1;
        }

        DogPack dogpack = new DogPack();

        int y = 0;
        while (y < sizes.length){
            Dog d1 = new Dog();
            d1.setSize(sizes[y]);
            dogpack.addDog(y, d1);
            y = y + 1;
        }

    }
}