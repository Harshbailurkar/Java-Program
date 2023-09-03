public class Q17alt {
    public static void main(String[] args) {

        int arr[] = { 1, 0, 1, 1, 0, 0, 1 };
        sort(arr);

    }

    public static void sort(int[] arr) {

        int leftptr = 0;
        int n = arr.length;
        int rightptr = n - 1;
        while (leftptr < rightptr) {

            if (arr[leftptr]==1 && arr[rightptr]==0) {

                swap(arr, leftptr, rightptr);
                leftptr++;
                rightptr--;

            } else {
                
                leftptr++;
                rightptr--;

            }
        }

        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    public static void swap(int arr[], int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

}
