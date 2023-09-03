//Java Program to print maximum among three numbers using if-else.

public class Q2 {
    public static void main(String[] args) {
        int a=50,b=90,c=30;

        if(a>b && a>c){
            System.out.println("1st number is largest");
        }
        else if(b>a && b>c){
            System.out.println("2nd number is largest");
        }
        else{
            System.out.println("3rd number is largest");
        }
        
    }
}
