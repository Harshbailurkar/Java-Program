
// calculating the sum of elements in array
import java.util.Scanner;

class Array {

    int sum;
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);

    void Add() {

        System.out.println("Enter the elemets");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }

        System.out.println(sum);
    }

}

class Q1 {

    public static void main(String[] args) {

        Array arr = new Array();
        arr.Add();

    }
}