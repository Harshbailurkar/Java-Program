//sort array in which elements are sorted in such way that at lest all are even no and at right all are odd no
public class Q18 {
    public static void main(String[] args) {

        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        sort(arr);
        printArray(arr);
    }

    public static void sort(int arr[]) {

        int leftptr = 0;
        int rightptr = arr.length - 1;

        while (leftptr < rightptr) {

            if (arr[leftptr] % 2 != 0 && arr[rightptr] % 2 == 0) {
                swap(arr, leftptr, rightptr);

            }

            leftptr++;
            rightptr--;

        }
    }

    public static void swap(int arr[], int a, int b) {

        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    public static void printArray(int[] arr) {

        for (int a : arr) {
            System.out.print(a + "\t");
        }
    }
}
