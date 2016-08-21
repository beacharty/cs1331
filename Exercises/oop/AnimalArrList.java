public class AnimalArrList {
    //trying to build my own class like arraylist
    private int size;
    private Animal[] elements;

    public AnimalArrList() {
        this(1); // setting default size to 1
    }

    public AnimalArrList(int initialSize) {
        if (initialSize < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " +
                initialSize);
        }
        this.elements = new Animal[initialSize];
    }

    public int size() {
        return elements.length;
    }

    public void add(Animal ani) {
        if (size == elements.length) {
            Animal[] temp = elements;
            this.elements = new Animal[size + 1];
            for (int j = 0; j < temp.length; j++) {
                elements[j] = temp[j];
            }
        }
        elements[size++] = ani;
    }

    public Animal get(int ind) {
        if (ind < 0) {
            throw new IllegalArgumentException("IndexOutOfBounds: " +
                ind);
        }
        return elements[ind];
    }

    public void remove(int ind) {
        if (ind < 0) {
            throw new IllegalArgumentException("IndexOutOfBounds: " +
                ind);
        }

        int count = 0;
        Animal[] temp = new Animal[size - 1];
        for (int i = 0; i < elements.length; i++) {
            if (i != ind) {
                temp[count] = elements[i];
                count++;
            }
        }
        this.elements = temp;
    }
}