class Test
{
    int m,n;
    Test(int x, int y)
    {
        m = x;
        n = y;
    }
    int largest()
    {
        if(m >= n)
            return(m);
        else
            return(n);
    }
    void display()
    {
        int large = largest();
        System.out.println("Largest = " + large);

    }
}

class Nesting_Method
{
    public static void main(String[] args)
    {
        Test t = new Test(50,40);
        t.display();
    }
}