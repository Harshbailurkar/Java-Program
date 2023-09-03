import java.util.Scanner;

class readChar{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter a character");
        // Give both only one character and a string
        char ch=sc.next().charAt(0);    // slice the string 
        System.out.println("the char is "+ ch);
        
    }
}