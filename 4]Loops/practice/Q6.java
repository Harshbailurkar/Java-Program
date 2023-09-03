// finding factorial of number

import  java.util.Scanner;

class Q6{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that you want to factorise !!");
        int n= sc.nextInt();
        int factorial=1;

        for(int i=n; i>0;i--){

            if(n==0){
                break;
            }
            else if(n==1){
                break;
            }
            else{
                factorial*=i;
            }
        }
        System.out.println("the factorial of " + n +" is " + factorial);
        sc.close();
    }
}