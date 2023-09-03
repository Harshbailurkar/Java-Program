// 1
// 12
// 123
// 1234

import java.util.Scanner;

class Q11{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the nos of rows");
        int r=sc.nextInt();

        for(int i=1;i<=r; i++){
            
            for(int j=1;j<=i; j++){

                    System.out.print(j);
                }
         
              System.out.println();
            }

           
        }
    }
