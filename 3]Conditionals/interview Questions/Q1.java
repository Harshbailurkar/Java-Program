//Java Program to print maximum among two numbers using if-else.
import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
         
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        sc.close();

        if(a>b){
            System.out.println("1st number is Largest");
        }
        else{
            System.out.println("Second number is Largest");
        }
    }
}