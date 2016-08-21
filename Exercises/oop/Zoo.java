//modified IntArrList to work with the Animal type instead
//will reimplement using arraylists once I get there

public class Zoo {
    AnimalArrList animals;

    public Zoo() {
        this.animals = new AnimalArrList();
    }

    public Zoo(Animal ... animals) {
        this.animals = new AnimalArrList();
        for(Animal animal: animals) {
            this.animals.add(animal);
        }
    }

    public void soundOff() {
        for(int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            System.out.println(animal.getName() + " says "
                + animal.speak());
        }
    }

    public void add(Animal anAnimal) {
        animals.add(anAnimal);
    }

    public void remove(int ind) {
        animals.remove(ind);
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(new Dog("a"));
        zoo.add(new Cat("z"));
        zoo.add(new Dog("b"));
        zoo.add(new Cat("y"));
        zoo.soundOff();
        zoo.remove(2);
        zoo.soundOff();
    }
}