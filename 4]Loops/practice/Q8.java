// Given 2 number a and b. find a raise to b(a^b)

import java.util.Scanner;

class Q8{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

         System.out.println("Enter a number that is in the base !!");
        int a= sc.nextInt();
         System.out.println("Enter a number that is in the raise !!");
        int b= sc.nextInt();

        int ans=1;


        for(int i=1; i<=b; i++){
            
            ans*=a;           
        }
         System.out.println(ans);
         sc.close();
    }
}