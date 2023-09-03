
// 21212
// 12121
// 21212
// 12121
import java.util.Scanner;
class Q8{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

         System.out.println("Enter a number of rows !!");
        int r= sc.nextInt();
        System.out.println("Enter a number of cloumn!!");
        int c= sc.nextInt();
       for (int i =1; i <= r;i++)
    {
        for (int j =1; j<=c; j++)
        {
            if ((i+j)%2==0)
            {
                 System.out.print("2");
            }
            else
            {
                 System.out.print("1");
            }
        }
        System.out.println();
    }
    }
    }