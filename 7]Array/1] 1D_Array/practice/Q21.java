
//in a given array, ans q queries where you need to print the sum of values in a given ranges of indices from l to r( both inclided and incexing start from 1)
import java.util.Scanner;

public class Q21 {
        static int[] makeprefix(int arr[]){

            for(int i=1;i<arr.length;i++){

                arr[i]=arr[i-1]+arr[i];
            }
            
            return arr;

        }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("eneter the elements");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int prefixarr[]= makeprefix(arr);
        
        
         
        System.out.println("enter the queies");
        int q=sc.nextInt();

        while(q-- > 0){

        System.out.println("eneter the range from which you want sum");
        int l = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("the sum is : "+ (prefixarr[r]-prefixarr[l-1]));
    }
    sc.close();

    }

}
