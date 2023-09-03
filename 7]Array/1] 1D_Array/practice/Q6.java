
// count the number of elemnts which are strictly greater than x
import java.util.Scanner;

public class Q6 {

  int count = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Q6 q = new Q6();
    System.out.println("enter the number");
    int x = sc.nextInt();
    sc.close();
    int arr[] = { 12, 3, 4, 1, 7, 5, 7, 4, 9 };

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > x) {
        q.count += 1;
      }
    }
    if (q.count == 0) {
      System.out.println("element is not present in array ");
    } else {
      System.out.println("the total no of elements which are greater than x is " + q.count);
    }
  }
}
