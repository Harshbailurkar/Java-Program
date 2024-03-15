public class FindSquareRoot {

    public static int calculateSqrt(int number) {
        if (x == 0 || x == 1) {
            return x;
        }
        long left = 0;
        long right = x;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
    }

    public static void main(String[] args) {
        int number = 13;
        int ans = calculateSqrt(number);
        System.out.println("Square root of " + number + " is " + ans);
    }

}
