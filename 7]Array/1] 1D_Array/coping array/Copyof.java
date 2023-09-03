import java.util.*;

class Copy {

    void printarray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}

public class Copyof {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Copy c = new Copy();
        c.printarray(arr);
        int[] arr1 = Arrays.copyOf(arr, arr.length); // copyOf function takes 2 parameters first in array and 2nd is length till you want copy the array.
        arr1[1] = 0;
        arr1[2] = 0;
        c.printarray(arr1);
        c.printarray(arr);

    }
}
