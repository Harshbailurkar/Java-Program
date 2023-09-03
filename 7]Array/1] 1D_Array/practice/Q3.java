
//search the given elements in array
import java.util.Scanner;

class Find {

    int[] arr = { 12, 32, 4, 6, 3, 2, 7 };
     int y=-1;
    int search(int x) {
        Find f= new Find();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                
                f.y=0;
                System.out.println("the num" + arr[i] + "is found at the index " + i);
                break;
            }
        }
        if(f.y==-1){
            System.out.println("num not found!");
        }
        return 0;
    }
}

public class Q3 {
    public static void main(String[] args) {
        System.out.println("ENter the number that you want to search ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Find f = new Find();
        f.search(num);
        sc.close();
    }
}
