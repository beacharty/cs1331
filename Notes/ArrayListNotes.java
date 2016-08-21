import java.util.*; //need to import utils

public class ArrayListNotes{
    public static void main(String[] args) {
        //Arraylists are dynamically-allocated and are one of the two types
        //of list Collections that we will study

        ArrayList nums0 = new ArrayList();
            //warning when compiling bc type not defined
            //ArrayLists auto hold reference types
        nums0.add(8); //Arraylist does autobox primitives when adding
        //int n = nums0.get(0); //will error bc Arraylist does not unbox
        //primitives when untyped
        int n = (Integer) nums0.get(0);//old solution to cast type
        System.out.println(n);

        //typed Arraylists can only contain that type
        //typed Arraylists also autobox and unbox primitives automatically
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(nums.size()); //initial size is always 0
        for(int i = 0; i < 10; i++) {
            nums.add(i);
        }
        //use a for-each to traverse
        for(int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //any clas stored in a collection must have a proper equals methods
        //when overriding equals, usually best to override hashcode too
            //this will be necessary with maps
    }
}