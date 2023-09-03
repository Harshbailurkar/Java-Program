// Addition of stream of number
import  java.util.Scanner;

class Q1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a=1;
        int sum=0,num;
        while(a!=0){

        System.out.print("Enter a number you want to add !!");
        num=sc.nextInt();
        sum+=num;
        System.out.println("the sum of number is "+ sum);
         System.out.println("Want to add more? press 1 for add and 0 to Quit !!");
         a=sc.nextInt();
        }
        sc.close();
    }
}
