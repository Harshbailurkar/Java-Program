//sort the given array consisteing 0's and 1'ss

public class Q17 {
    static void sort(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count += 1;
            }
        }

        for (int j = 0; j < arr.length; j++) {

            if (j < count) {
                arr[j] = 0;
            } else {
                arr[j] = 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 0, 0, 1, 1 };
        sort(arr);
        for (int i : arr)
            System.out.print(i + "\t");
    }
}
