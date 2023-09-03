// rotating the array k times

import java.util.Scanner;

public class Q14 {

    static void rotate_array(int arr[], int k, int n) {
        int[] arr1 = new int[n];
        k = k % n;
        int j = 0;

        for (int i = n - k; i < arr.length; i++) {

            arr1[j++] = arr[i];

        }
        for (int i = 0; i < n - k; i++) {
            arr1[j++] = arr[i];
        }
        for (int z : arr1)
            System.out.print(z + " ");

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

        rotate_array(arr, k, n);
    }
}
