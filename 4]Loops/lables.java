import java.util.Scanner;

class lables{

    public static void main( String[] args){
       Scanner sc= new Scanner(System.in);
       
       // labaling a loop eg.
       myloop:for(int i=1; i<50 ;i++){
        
        if(i%3==0){
            break myloop;  // used in nasted loops
        }
         System.out.println(i);
       }
       sc.close();
    }
}