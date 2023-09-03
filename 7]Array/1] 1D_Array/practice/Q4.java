
//calculate the number of occurances on element in array

import java.util.*;

public class Q4 {
    int occurance = 0;

    public static void main(String[] args) {

        Q4 q = new Q4();

        int arr[] = { 12, 43, 6, 7, 12, 34, 67, 12 };

        System.out.println("enter the number that you want to find out there occurance:");
        Scanner sc = new Scanner(System.in);
        int find = sc.nextInt();
        sc.close();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == find) {
                q.occurance += 1;
            }
        }
        System.out.println("the no is occured " + q.occurance + " times in the given array");
    }
}
