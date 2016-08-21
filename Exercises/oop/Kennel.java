public class Kennel {
    private Dog[] dogs;
    //variable arity
    public Kennel(Dog ... dogs) {
        this.dogs = dogs;
    }

    public void soundOff() {
        for(Dog dog: dogs) {
            System.out.println(dog.getName() + " says " + dog.speak());
        }
    }

    public static void main(String[] args) {
        Kennel a = new Kennel(new Dog("a"), new Dog("b"), new Dog("c"));
        a.soundOff();
    }
}