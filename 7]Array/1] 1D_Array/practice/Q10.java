// find the unique value from the array where all the values are repeated

class Find {

    protected int findarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != -1) {
                System.out.println("the unique no is " + arr[i]);
            }
        }
        return 0;
    }

}

public class Q10 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 2, 1, 3 };
        Find f = new Find();
        f.findarr(array);

    }
}
