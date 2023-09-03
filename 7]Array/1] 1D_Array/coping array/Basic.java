class Copy{

    void printarray(int arr[]){
         
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
}
public class Basic {
    public static void main(String[] args) {
        
        int[] arr={ 1,2,3,4,5,6};
        Copy c =new Copy();
        c.printarray(arr);
        int[] arr1=arr;
        arr1[1]=0;
        arr1[2]=0;
        c.printarray(arr1);
        c.printarray(arr); // here we changed the arr1 but the arr is also changed because for arr1 there is no new memory is allocated by 'new' it arr1 refere to the arr we can avoid this by diff methods

        int arr2[]=new int[5];
        arr2=arr;

        arr2[1]=1;
        arr2[2]=2;
        c.printarray(arr2);

    }
}
