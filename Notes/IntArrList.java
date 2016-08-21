public class IntArrList {
    //trying to build my own class like arraylist
    private int size;
    private int[] elements;

    public IntArrList() {
        this(10); // setting default size to 10
    }

    public IntArrList(int initialSize) {
        if (initialSize < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " +
                initialSize);
        }
        this.elements = new int[initialSize];
    }

    public int size() {
        return elements.length;
    }

    public void add(int num) {
        if (size == elements.length) {
            int[] temp = elements;
            this.elements = new int[size + 1];
            for (int j = 0; j < temp.length; j++) {
                elements[j] = temp[j];
            }
        }
        elements[size++] = num;
    }

    public int get(int ind) {
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
        int[] temp = new int[size - 1];
        for (int i = 0; i < elements.length; i++) {
            if (i != ind) {
                temp[count] = elements[i];
                count++;
            }
        }
        this.elements = temp;
    }
}