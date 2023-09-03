import  java.util.Scanner;

class ForLoop{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number till tou want to add !!");
        int num=sc.nextInt();
        int sum=0;

        for(int i=1; i<=num;i++){

            sum+=i;

        }
        System.out.println("thr sum of "+ num + " natural number is "+ sum);
        sc.close();
    }
    }