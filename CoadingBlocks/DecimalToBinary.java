import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 10;
        int number = 0;
        int mul = 1;

        while (num > 0) {
            int rem = num % 2;
            number = number + rem * mul;
            mul = mul * 10;
            num = num / 2;
        }
        System.out.println(number);

    }
}
