// write a program to print a prifix sum/ running sum array of givrn array (with another array)

public class Q20 {

    public static void makerun(int[] arr) {

        int arr1[] = new int[arr.length];
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j <= i; j++) {

        //         sum = sum+arr[j];

        //  }
        //     arr1[i] = sum;
        //     sum = 0;
        // }
        // Second method:

        arr1[0]=arr[0];
        for(int i=1;i<arr.length;i++){

            arr1[i]=arr1[i-1]+ arr[i];
        }
        

        for (int i : arr1) {
            System.out.print("|"+i );
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 1, 3, 4, 5 };

        makerun(arr);
    }
}
