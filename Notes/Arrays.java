public class Arrays {
    public static void main(String[] args) {
        Boolean[] arr1 = new Boolean[5];
        String arr2[] = new String[6];
        //both declarations valid, but first one is standard
        //Arrays are fixed length types, must allocate size in initialization

        //initialized to default in above declarations
        //  0 for numeric | false for boolean | null for references

        System.out.println(arr2.length); // length saved in public instance var

        // double[] arr4 = new double[-5]; //compiles bc dynamic allocation
        //                                 //runtime error: index out of bounds
        // arr2[-1] = "hi"; //runtime error: index out of bounds

        double arr3[], d; // declare arrays & variables of same type together

        arr3 = new double[4];
        //initializing arr3 using for loop
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = Math.random()*10*i;
        }
        System.out.println(arr3); //output:[D@6d06d69c - address location

        double s = 0;
        //using enhanced for loop to access values in array
        for (double num: arr3) { //for each num in arr3
            s += num;
        }
        System.out.println(s);

        //variable arity - both function calls below are valid
        //the last parameter of a function can be variable arity
        s = sum(1.0, 2.3);
        s = sum(4.6, 6.5, 38, 2.3);

        //Multidimensional Arrays
        double[][] arr5 = new double[2][3]; //2 rows, 3 columns
        System.out.println(arr5.length); //.length returns # rows
        System.out.println(arr5[0].length); //returns # col bc arr5[0] is
                                            //an array of the first row
        //traverse with for loop (row or column major)
        //Ragged Arrays
        double[][] arr6 = new double[2][];
        arr6[0] = new double[] {1.1, 2.3, 4.5, 9};
        arr6[1] = new double[2] ;

        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[i].length; j++) {
                System.out.print(arr6[i][j] + " ");
            }
            System.out.println();
        } // pay attention to the order of traversing
          // can't traverse this one in column major order


        int[] arr = new int[] {1, 1, 1, 1, 1};
        int[] temp = arr;
        arr = new int[6];

        for (int j = 0; j < temp.length; j++) {
            arr[j] = temp[j];
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println(arr.length);

        /////////////////////////////////////////////////////////////////
        // Creating instance of IntArrList
        IntArrList ial = new IntArrList();
        IntArrList ial1 = new IntArrList(5);
        // IntArrList ial2 = new IntArrList(-1); exception works
        System.out.println(ial.size() + " " + ial1.size());
        // adding elements
        for(int i = 0; i < ial1.size(); i++) {
            ial1.add(i*40);
        }
        // getting elements & printing
        for(int i = 0; i < ial1.size(); i++) {
            System.out.print(ial1.get(i) + " ");
        }
        System.out.println();
        //adding extra - testing auto expanding - works well
        ial1.add(1);
        // printing expanded array
        for(int i = 0; i < ial1.size(); i++) {
            System.out.print(ial1.get(i) + " ");
        }
        System.out.println();
        //testing remove - works well
        ial1.remove(1);
        //reprinting
        for(int i = 0; i < ial1.size(); i++) {
            System.out.print(ial1.get(i) + " ");
        }
        System.out.println();
        /////////////////////////////////////////////////////////////////
    }

    //the function treats a variable arity parameter as an array
    public static double sum (double ... nums) {
        double sum = 0;
        for (double num:nums) {
            sum += num;
        }
        return sum;
    }
}