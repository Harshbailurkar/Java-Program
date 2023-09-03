import java.util.Scanner;

class Switch{

    public static void main(String[] args){

         Scanner sc= new Scanner(System.in);

        System.out.println("Enter day ");
        String day=sc.next();

        switch(day){
            case "monday":
               System.out.println("its monday");
               break;
            case "tuesday":
               System.out.println("its Tuesday");
               break;
            case "wednesday":
               System.out.println("its wednesday");
               break;
            case "Thursday":
               System.out.println("itsfridayday");
               break;
             case "friday":
               System.out.println("its friday");
               break;
            case "saturday":
               System.out.println("its saturday");
               break;
            case "sunday":
               System.out.println("its sunday");
               break;
            default:
             System.out.println("invalid day");


            

        }
        sc.close();
    }
}