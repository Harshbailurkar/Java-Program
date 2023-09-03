// find the array is sorted or not

public class Q7 {
    boolean sort = true;

    public static void main(String[] args) {
        Q7 q = new Q7();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    q.sort = false;
                    
                    break;

                }
            }
        }
        if (q.sort == true) {
            System.out.println("the array is sorted");
        } else {
            System.out.println("array is not sorted");
        }
    }
}
