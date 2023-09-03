// find the tatal no. of pairs whose sum is equal to x

public class Q8 {

    int x = 10;
    int no_of_pairs = 0;

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Q8 q = new Q8();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == q.x) {
                    q.no_of_pairs += 1;
                }
            }
        }
        System.out.println(q.no_of_pairs);
    }
}