// 123456
// 123456
// 123456
// 123456

import java.util.Scanner;

class Q9{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the nos of rows");
        int r=sc.nextInt();
        System.out.println("enter the nos of rows");
        int c=sc.nextInt();

        for(int i=1;i<=r; i++){
            
            for(int j=1;j<=c; j++){

                    System.out.print(j);
                }

            System.out.println();
        }
    }
}