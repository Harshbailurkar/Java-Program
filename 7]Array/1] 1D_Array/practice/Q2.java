//calculating the maximum no of given array

public class Q2 {
    int max;

    public static void main(String[] args) {

        int arr[] = { 1, 5, 3, 6, 3 };
        Q2 q = new Q2();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    q.max = arr[j];
                }
            }
        }
        System.out.println(q.max);
    }
}
