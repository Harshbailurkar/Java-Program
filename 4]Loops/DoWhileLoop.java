// WAP to print sum of n natural nos 

import  java.util.Scanner;

class DoWhileLoop{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number till tou want to add !!");
        int num=sc.nextInt();
        int sum=0,a=1;


           do{
            sum+=a;
            a++;
        } while(a<=num);

        System.out.println("thr sum of "+ num + " natural number is "+ sum);
        sc.close();
    }
}