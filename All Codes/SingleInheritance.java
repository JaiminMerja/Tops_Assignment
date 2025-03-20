class Animal
{
    void eat()
    {
        System.out.println("Animal are eating");
    }
}
class Birds extends Animal
{
    void fly()
    {
        System.out.println("Birds are flying");
    }
}
public class SingleInheritance 
{
    public static void main(String[] args) 
    {
        Birds b = new Birds();
        b.eat();
        b.fly();
    }
}
