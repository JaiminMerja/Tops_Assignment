class Parent
{
    Parent()
    {
        System.out.println("Parent class Constructor");
    }
    void display()
    {
        System.out.println("Parent class method");
    }
}
class Child extends Parent
{
    Child()
    {
        super();
        System.out.println("Child class constructor");
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Child class method");
    }
}
public class SuperDemo 
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        c.display();
    }
}
