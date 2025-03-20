// Using Method Name
public class MethodOverloading 
{
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static double sum(double a, double b)
    {
        return a+b;
    }
    public static float sum(float a, float b, float c)
    {
        return a+b+c;
    }
    public static void main(String[] args) 
    {
        System.out.println("Sum of Interger:"+sum(2, 3));
        System.out.println("Sum of Double:"+sum(11.5, 12.5));
        System.out.println("Sum of Float:"+sum(5.5f, 6.5f, 7.5f));
    }
}
