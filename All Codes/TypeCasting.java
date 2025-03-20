public class TypeCasting
{
    public static void main(String[] args) 
    {
        // Implicit 
        int a = 100;
        double b = a;

        System.out.println("Implicit Casting (int to double): " + b);

        // Explicit 
        double c = 99.99;
        int d = (int) c;

        System.out.println("Explicit Casting (double to int): " + d);

    }
}
