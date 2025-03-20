class car
{
    void model()
    {
        System.out.println("Which model is that?");
    }
}
class bike extends car
{
    void color()
    {
        System.out.println("Which color you want?");
    }
}
class Scooty extends bike
{
    void price()
    {
        System.out.println("What is the price?");
    }
}
public class MultilevelInheritance 
{
    public static void main(String[] args) 
    {
    Scooty s = new Scooty();
    s.model();
    s.color();
    s.price();
    }
}
