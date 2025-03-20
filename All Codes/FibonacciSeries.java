public class FibonacciSeries 
{
    public static void main(String[] args) 
    {
        int n=9;
        int a=0, b=1;
        System.out.println("Series:"+a+ " "+b);
        for(int i=1; i<n; i++)
        {
            int next = a + b;
            System.out.println(next +" ");
            a=b;
            b=next;
        }
    }
}
