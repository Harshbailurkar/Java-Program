// Given 2 number a abd b. find a raise to b(a^b)

// partern     ******
            // ****** 
            // ******

import java.util.Scanner;

class Q1{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

         System.out.println("Enter a number of rows !!");
        int r= sc.nextInt();
         System.out.println("Enter a number of column  !!");
        int c= sc.nextInt();

        for(int i=1; i<=r; i++){
            
            for(int j=1;j<=c;j++){
               
               System.out.print("*");
            }
              System.out.println();

                      
        }
         
    }
}