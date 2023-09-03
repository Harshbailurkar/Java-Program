// Find the first n factorial number ie. 5 = 1!+2!+3!+4!+5! 


import java.util.Scanner;

class Q7{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

         System.out.println("Enter a number that you want to factorise !!");
        int n= sc.nextInt();
        int sum=0;

        int factorial=1;

        for(int i=1; i<=n; i++){
            
            factorial*=i;
            //System.out.println(factorial);   // to printing all the factorial from 1 to n
            sum+=factorial;
           
        }
         System.out.println(sum);
         sc.close();
    }
}