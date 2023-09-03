import java.util.Scanner;

class sumOfTwoNo{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in); 
    System.out.println("Enter two nos: ");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int ans= num1+num2;
    System.out.println("the addition of nos is " + ans);
     
    sc.close();
    }
}