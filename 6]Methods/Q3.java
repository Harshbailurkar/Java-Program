//waping 2 numbers

public class Q3 {

    static void swap(int a, int b) {
        // with temp
        // int temp=a;
        // a=b;
        // b=temp;

        // without temp
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("the value of a abd b are " + a + " " + b);
    }

    public static void main(String[] args) {

        swap(12, 23);
    }
}