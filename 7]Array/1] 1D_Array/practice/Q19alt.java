

public class Q19alt {

    public static void main(String[] args) {
        int arr[] = { -10, -3, -2, 0, 1, 5, 9 };
        sort(arr);
    }

    static void sort(int arr[]) {

        int ans[] = new int[arr.length];

        int leftptr = 0;
        int rightptr = arr.length - 1;
        int k = 0;

        while (rightptr >= leftptr) {

            if (Math.abs(arr[leftptr]) > Math.abs(arr[rightptr])) {

                ans[k++] = arr[leftptr] * arr[leftptr];
                leftptr++;
            } 
            else {

                ans[k++] = arr[rightptr] * arr[rightptr];
                rightptr--;
            }

        }
        reverse(ans);

    }

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
            System.out.print(a+", ");
        }
    }
}
