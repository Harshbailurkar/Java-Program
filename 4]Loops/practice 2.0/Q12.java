//    1
//   123
//  12345
// 1234567

import java.util.Scanner;

class Q12{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the nos of rows");
        int r=sc.nextInt();

        for(int i=1;i<=r; i++){
            
            for(int j=1;j<=(r-i); j++){

                    System.out.print(" ");
                }
    
                for(int k=1; k<=(2*i-1); k++){
                
                 System.out.print(k);
            }
                       System.out.println();
           
        }
    }
}