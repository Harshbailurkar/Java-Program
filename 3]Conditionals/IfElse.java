// odd even
import java.util.Scanner;
class IfElse{
    
    public static void main(String[] urgs){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number !");
        int num =sc.nextInt();
        if(num==0){
            System.out.println("number is Zero it can not be odd or even!");
        }
        else if( num>0){
        if(num%2==0){
            System.out.println("no is even !");
        }
        else{
            System.out.println("no is odd !");
        }
        }
        else{
            System.out.println("invalid number");
        }
        sc.close();
        // String ans= (num%2==0)? "even":"odd";  // ternary operator
        // System.out.println(ans);
    }
}

