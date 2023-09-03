
//find the last occurance of java
import java.util.Scanner;

public class Q5 {

    int lastocc = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number that you want to search the last occurance");
        int find = sc.nextInt();
        sc.close();
        Q5 q = new Q5();
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 21, 2, 3, 12, 34, 2 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                q.lastocc = i;
            }
        }
        if (q.lastocc == -1) {
            System.out.println("element is not present in array ");
        } else {
            System.out.println("the last occurance of element is at position" + (q.lastocc + 1));
        }

    }
}
