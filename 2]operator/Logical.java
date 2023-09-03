class Logical{

     public static void main(String[] args){

        int p=3,q=2,r=3;
        System.out.println(p==q || p==r && p<q);//false
        System.out.println(p==q && p==r && p>q);//false
        System.out.println(p!=q && p==r);//true
        System.out.println(!(p==q) && p==r && p>q);//true
        System.out.println(p>q && q>r);//false
}
}