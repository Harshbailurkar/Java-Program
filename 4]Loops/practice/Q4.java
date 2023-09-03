// reverse the number

import  java.util.Scanner;

class Q4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to Reverse !!");
        int sum=0,num= sc.nextInt();
        int original=num;

        while(num>0){
          
            sum= sum*10+ num%10;
            num=num/10;    
        }
        System.out.print("the reverse of "+ original + " number is "+ sum);
        sc.close();
    }
}