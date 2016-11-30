class Dog3{

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

    boolean isBigger(Dog3 d){
        return (this.getSize() > d.getSize());
    }
}

class DogTestClass3{
    public static void main (String[] args){
        Dog3 [] dogs = new Dog3[10];
        int x = 0;
        while (x < dogs.length){
            dogs[x] = new Dog3();
            dogs[x].setSize(x*10);
            x = x + 1;
        }
        x = 0;
        while (x < dogs.length){
            dogs[x].bark();
            x = x + 1;
        }
        x = 0;
        Dog3 biggestDog = dogs[0];
        while (x < dogs.length){
            if (dogs[x].isBigger(biggestDog)){
                biggestDog = dogs[x];
            }
            x = x + 1;
        }
        System.out.println(biggestDog.getSize());
        System.out.println (dogs[3].isBigger(dogs[2]));
        System.out.println (dogs[2].isBigger(dogs[3]));
    }
}