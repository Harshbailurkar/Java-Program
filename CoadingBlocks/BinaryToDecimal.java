package CoadingBlocks;

public class BinaryToDecimal {

    public static void main(String[] args) {
        int num = 10000000;
        int decimal = 0;
        int base = 1;
        int temp = num;

        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            decimal += lastDigit * base;
            base = base * 2;
        }
        System.out.println(decimal);
    }
}
