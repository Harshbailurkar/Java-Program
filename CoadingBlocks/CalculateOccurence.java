// calculate the first and last occurence of a number in an array
public class CalculateOccurence {

    static int firstOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int firstOccurence = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                firstOccurence = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return firstOccurence;
    }

    static int lastOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int lastOccurence = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                lastOccurence = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastOccurence;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8 };
        int target = 4;
        int firstOccurence = firstOccurence(arr, target);
        int lastOccurence = lastOccurence(arr, target);
        System.out.println("First occurence of " + target + " is at " + firstOccurence);
        System.out.println("Last occurence of " + target + " is at " + lastOccurence);

    }
}
