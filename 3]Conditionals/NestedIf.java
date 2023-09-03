import java.util.Scanner;

class NestedIf{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your age(in years old): ");
        float age= sc.nextFloat();

        if(age>18){
            System.out.println("you are adult");
        }
        else if(age<18 && age >12){
            System.out.println("you are teenager");
        }
        else if(age>0 && age<13){

            if(age>5){
                System.out.println("you are Toddler");
            }
            else{
                System.out.println("you are child");
            }
        }

        else{
            System.out.println("Invaid age !!");
        }
        sc.close();
    }
}