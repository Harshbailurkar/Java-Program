public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println("loop run");
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 23, 34, 45, 56, 67, 78, 89, 90 };
        int target = 12;
        int ans = binarySearch(arr, target);
        System.out.println("the element is found at " + (ans + 1) + "th position.");
    }
}
