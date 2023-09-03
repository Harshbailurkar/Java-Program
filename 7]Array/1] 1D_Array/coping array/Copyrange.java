 import java.util.*;

class Copy {

    void printarray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}

public class Copyrange {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Copy c = new Copy();
        c.printarray(arr);
        int[] arr1 = Arrays.copyOfRange(arr, 1,3); // copyOf function takes 3 parameters first in array and 2nd (start index) length and 3rd is (last-1 index) till you want copy the array.here 2,3 will be copy from arr
        c.printarray(arr1);
        arr1[1] = 0;
        arr1[0]=0;
        c.printarray(arr1);
        c.printarray(arr);

    }
}

