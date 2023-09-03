// 12345
// 23451
// 34512
// 45123
// 51234

import java.util.Scanner;
class Q7{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

         System.out.println("Enter a number of rows !!");
        int r= sc.nextInt();

        for(int i=1; i<=r; i++){
            
            for(int j=i; j<=(r);j++){

               System.out.print(j);  

                }

            for(int k=1; k<=(i-1); k++) {
                
                 System.out.print(k);
            }

        System.out.println();
        }
              
    }
    }