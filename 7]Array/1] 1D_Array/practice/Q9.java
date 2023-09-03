//find the triplets
public class Q9 {

    int x = 10;
    int no_of_triplets = 0;

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Q9 q = new Q9();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++)
                    if (arr[i] + arr[j] + arr[k] == q.x) {
                        q.no_of_triplets += 1;
                    }
            }
        }
        System.out.println(q.no_of_triplets);
    }
}
