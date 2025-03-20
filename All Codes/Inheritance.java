class money
{
    void price()
    {
        System.out.println("The price is high");
    }
}
class dollar extends money
{
    void paisa()
    {
        System.out.println("The price is in dollar");
    }
}
public class Inheritance 
{
    public static void main(String[] args) 
    {
        dollar c = new dollar();
        c.price();
        c.paisa();
    }
}
