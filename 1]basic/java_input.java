// java scanner  java.util
import java.util.Scanner;
class java_input{
     
     public static void main(String[] args){

          Scanner sc= new Scanner(System.in); 

        System.out.println("enter your lucy no.");

        int num_1= sc.nextInt();           // integer input
        
        System.out.println("the entered lucky no is: " + num_1);

        System.out.println("enter your name ");
      //  String name=sc.next();        // for string input (only take input without space)
       // for space use(eg. harsh bailurkar)
        String name=sc.nextLine();
        System.out.println("your name is: " + name);

       // sc.nextFloat();   for floating input
          //  nextBoolean(); for boolean input
          //  nextByte():
          //  nextLong();
          //  nextDouble();
          //  nextShort();
        
          sc.close();
     }
     
}

// 