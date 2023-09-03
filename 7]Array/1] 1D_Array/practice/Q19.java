//printing sorted array of given sorted array in assending oreder with their square
// input : {-10,-3,-2, 0, 1, 5, 9} output : {0, 1, 4, 9, 25, 81, 100}

public class Q19 {
    public static void main(String[] args) {
        Q19 q = new Q19();

        int[] arr = { -10, -3, -2, 0, 1, 5, 9 };

        q.square(arr);
        q.sort(arr);

        for (int a : arr) {
            System.out.print(a + "\t");
        }

    }

    public void square(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }

    public void sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

   
    
}
