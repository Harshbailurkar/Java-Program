// write a program to add 2 numbers
import java.util.Scanner;
class Add{
    
    void add(int a,int b){

        int c=a+ b;
        System.out.println("the Addition of 2 number is "+ c);    }
}

class Q1{

    public static void main(String[] args) {
        Add a= new Add();
        System.out.println("Enter the 2 numbers");
         Scanner sc =new Scanner(System.in);
         int x=sc.nextInt();
         int b=sc.nextInt();
        a.add(x,b);
        sc.close();
    }
}