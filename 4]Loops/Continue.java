// print all the values betyween 1 and 50 except for the multiple of 3
import java.util.Scanner;

class Continue{

    public static void main( String[] args){
       Scanner sc= new Scanner(System.in);
       sc.close();
       
       for(int i=1; i<50 ;i++){
        
        if(i%3==0){
            continue;
        }
         System.out.println(i);
         //or
        // if( i%3!=0){
        //       System.out.println(i);
        // }
       }

    //    While(i<50){

    //     if(i%3==0){
    //         i++;      // here increment
    //         continue;
    //     }
    //     System.out.println(i);
    //    }


    }
}