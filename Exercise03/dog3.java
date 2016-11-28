class Dog{

    private int size;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }

    public int getSize() {
        this.size;
    }

    public void setSize(int s) {
        this.size = s;
    }

    boolean isBigger(Dog d){
        return (this.getSize() > d.getSize())
    }
}

class DogTestClass{
    public static void main (String[] args){
        Dog d = new Dog();
        d.setsize(40);
        System.out.println(d.getSize());
        d.bark();
    }
}