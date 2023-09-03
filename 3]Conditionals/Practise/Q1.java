import java.util.Scanner;
// WAP to print the values if it is even and dividible by 3
class Q1{

    public static void main(String[] args){
       
       Scanner sc= new Scanner(System.in);

       System.out.println("Enter a number");
       int num= sc.nextInt();

       if(num%2==0 && num%3==0){

        System.out.println("Num is perferct");
       }
       else{
        System.out.println("number is not good Try Again !");
       }
       sc.close();
    }
}