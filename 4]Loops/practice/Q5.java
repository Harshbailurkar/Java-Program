//Find the sum of the following series  1-2+3-4+5-6......

import  java.util.Scanner;

class Q5{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till you want to add !!");
        int n= sc.nextInt();
        int original=n;
        int sum=0;


       for(int i=1;i<=n;i++){

        if(i%2==0){
            sum-=i;
        }
        else{
            sum+=i;
        }
       }

        System.out.print("the sum of series till "+ original + " number is "+ sum);
        sc.close();
    }
}