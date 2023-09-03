
//finsd the 2nd largest element in array
import java.util.Scanner;

class Find {

    static int slarge = Integer.MIN_VALUE;  //Integer.MIN_VALUE is a constant that represents the minimum value that can be stored in an int variable. Its value is -2,147,483,648.
    static int largest = Integer.MIN_VALUE;

    static int FindSecondLargest(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > largest) {
                largest = arr[j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largest) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > slarge) {
                slarge = arr[i];
            }
        }
        return slarge;
    }
}

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int SizeOfArray = sc.nextInt();

        int[] arr = new int[SizeOfArray];

        System.out.println("enter the array elements");

        for (int i = 0; i < SizeOfArray; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("the second largest element in array is " + Find.FindSecondLargest(arr));

    }
}
