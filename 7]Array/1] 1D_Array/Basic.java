import java.util.Scanner;
class Array{

    protected int[] Arr={1,2,3,4,5,6,7};
    protected int[] Arr1= new int[5];
    protected int Arr2[]= new int[4];

    public void Parr1(){

    Arr1[0]=32; 
    Arr1[1]=12;
    Arr1[2]=72;
    Arr1[3]=42;
    Arr1[4]=52; 

    }
   
    void Adding(){
         Scanner sc=new Scanner(System.in);
        for(int k=0; k<Arr2.length; k++){
            System.out.println("array elements");
            Arr2[k]=sc.nextInt();
            System.out.println(Arr2[k]);
        }
        sc.close();
    }
    


}
public class Basic {
    public static void main(String[] args) {
        Array ar= new Array();
        ar.Adding();
        ar.Parr1();
        for(int i=0; i<ar.Arr.length; i++){
            System.out.println(ar.Arr[i]);
        }
        for(int i=0; i<ar.Arr1.length; i++){
            System.out.println(ar.Arr1[i]);
        }
    }
}
