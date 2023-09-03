class Bitwise{
  
    public static void main(String[] args){
            int p=9,q=10;
            System.out.println( p | q);
            System.out.println( p & q);
            System.out.println( p ^ q);
            System.out.println( p >> 1);
            System.out.println( p >> 2);
            System.out.println( q <<1);
            System.out.println( q <<2);
    }
}
   // work at bit level:

        //Bitwise OR (|)
        // 1 1 =1
        // 1 0 =1
        // 0 1 =1
        // 0 0 =0

        // bitwise AND (&)
        // 1 1 =1
        // 1 0 =0
        // 0 1 =0
        // 0 0 =0

        // Bitwise exclusive OR (^)
        // 0 0 =0
        // 1 1 =0
        // 1 0 =1
        // 0 1 =1

        //Bitwise Compliment (~)

        // 0101 = 1010

        // Left Shift (<<)   a<<2= a^2

        // 9(1001)<< 1 = 10010 (18)
        // 9(1001)<< 2 =100100 (36)
         
        // Right Shift  (>>)  a>>b =(a/(2^b))

        // 1001 >>1 =100 (4)  
        // 1001 >>2= 10 (2)
        