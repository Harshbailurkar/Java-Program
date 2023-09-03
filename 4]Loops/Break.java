// print the first multiple of 5 which is also a multiple of 7

import java.util.Scanner;

class Break{

    public static void main( String[] args){
       Scanner sc= new Scanner(System.in);
       sc.close();
       
       for(int i=1; true ;i++){

        if( i%5==0 && i%7==0){
              System.out.println(i);
              break;
        }
       }


    }
}