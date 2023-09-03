//Find the sum of the digit in a given number new

import  java.util.Scanner;

class Q3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to Count !!");
        int sum=0,num= sc.nextInt();
        int original=num;

        while(num>0){
          
            sum+=num%10;
            num=num/10;    
        }
        System.out.print("the sum of "+ original + " digit is "+ sum);
        sc.close();
    }
}