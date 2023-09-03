// count the number of digit for a given number n

import  java.util.Scanner;

class Q2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to Count !!");
        int NoOfDigits=0,num= sc.nextInt();
        int original=num;

        while(num>0){
          
            num=num/10;
            NoOfDigits ++;    
        }
        System.out.print("the count of "+ original + " number is "+ NoOfDigits);
        sc.close();
    }
}