// *
// **
// ***

import java.util.Scanner;

class Q3{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

         System.out.println("Enter a number of rows !!");
        int r= sc.nextInt();

        for(int i=1; i<=r; i++){
            
            for(int j=1;j<=i;j++){
               System.out.print("*");
            }

              System.out.println();

                      
        }
         
    }
}