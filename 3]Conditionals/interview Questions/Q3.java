import java.util.*;

public class Q3 {

  public static void main (String[] args)
  {
    System.out.println("Program to check digit or not in Java");
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter a input");
    
    char ch = sc.next ().charAt (0);
    sc.close();
     if(ch>='0' && ch<='9')
	 {
	  	System.out.println("Given Input is Digit.");
	 }
	 else
	 {
	  	System.out.println("Given Input is Not Digit.");
	 }
  }
}

