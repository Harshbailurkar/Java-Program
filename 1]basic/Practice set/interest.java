import java.util.Scanner;

class interest{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 

        System.out.println("enter the pricipal amount ");
        float amount= sc.nextFloat();
        System.out.println("enter the rate of interest ");
        float rate= sc.nextFloat();
        System.out.println("enter for what time you need this amount(in year) ");
        float time= sc.nextFloat();
        System.out.println("the simple interest on this amount is "+((amount*rate*time)/100));
    }
}