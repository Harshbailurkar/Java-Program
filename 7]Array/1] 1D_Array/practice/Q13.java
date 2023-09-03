//to reverse the array

public class Q13 {

    // static void reverse(int arr[]){
    // int[] arr1=new int[arr.length];
    // int j=0;
    // for(int i=arr.length-1;i>=0;i--){
    // arr1[j++]=arr[i];
    // }
    // for (int a : arr1) {
    // System.out.print(a+" , ");
    // }
    // }
    static void swap(int arr[], int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[]) {

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {

            swap(arr, i, j);
            j--;
            i++;
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverse(arr);
    }
}
