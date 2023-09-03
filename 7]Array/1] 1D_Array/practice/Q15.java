
// rotating the array k times in same array
import java.util.Scanner;

public class Q15 {
    static void swap(int arr[], int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[], int i, int j) {

        while (i < j) {

            swap(arr, i, j);
            j--;
            i++;
        }

    }

    static void rotateInPlace(int arr[], int n, int k) {
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();

        System.out.println("Enter the array elements");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println("enter how many times you want to rotate array :");
        int k = sc.nextInt();
        sc.close();
        rotateInPlace(arr, n, k);

        for (int a : arr) {
            System.out.print(a);
        }

    }
}
