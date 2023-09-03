
class Find {
    static int repeated = -1;

    protected int findarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    repeated = arr[i];
                    return arr[i];
                }
            }
        }
        if (repeated == -1) {
            System.out.println("Element is not repeated");
            return ;
        }

        
    }

}

public class Q12 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 2, 1, 3 };
        Find f = new Find();
        System.out.println(f.findarr(array) + " is first element to repeat");

    }
}
