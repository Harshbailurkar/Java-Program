class Copy{

    void printarray(int arr[]){
         
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}
public class Cloning {
    public static void main(String[] args) {
        
    
    int[] arr={ 1,2,3,4,5,6};
        Copy c =new Copy();
        c.printarray(arr);
    int[] arr1=arr.clone();
    arr1[1]=0;
    arr1[2]=0;
    c.printarray(arr1);
    c.printarray(arr);
    


    }
}
