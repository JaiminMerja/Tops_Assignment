class Mul
{
    int x,y;
    public Mul()  //Default
    {
        x=10;
        y=20;
        System.out.println("Multiplication: "+(x*y));
    }
    public Mul(int a) // Paramertized
    {
        x=a;
        y=a;
        System.out.println("Multiplication2: "+(x*y));
    }
    public Mul(int b, int c) // Constructor Overloading
    {
        x=b;
        y=c;
        System.out.println("Multiplication3: "+(x*y));
    }
}
public class ConstructorOverloading 
{
    public static void main(String[] args) 
    {
        Mul m = new Mul();
        new Mul(30);
        new Mul(50, 60);
    }
}
