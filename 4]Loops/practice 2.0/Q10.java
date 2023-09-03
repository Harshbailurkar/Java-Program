// 12345
// 2   1
// 3   2
// 4   3
// 51234

import java.util.Scanner;

class Q10{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the nos of rows");
        int r=sc.nextInt();
        System.out.println("enter the nos of rows");
        int c=sc.nextInt();

        for(int i=1;i<=r; i++){
            
            for(int j=i;j<=c; j++){

                if(i==1 || j==i || i==r ){

                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                } 
            }
            for(int k=1;k<=(i-1);k++){
                
                if(i==1 || k==i || i==r || k==(i-1)){

                    System.out.print(k);
                }
                else{
                    System.out.print(" ");
                }
             
            }

            System.out.println();
        }
    }
}