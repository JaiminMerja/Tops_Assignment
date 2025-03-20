interface data
{
    void print();
}
interface show
{
    void information();
}
class document implements data, show
{
    @Override
    public void print()
    {
        System.out.println("Print the data");
    }
    @Override
    public void information()
    {
        System.out.println("Take the information");
    }
}
public class MultipalInterface 
{
    public static void main(String[] args)
    {
        document d = new document();
        d.print();
        d.information();
    }
}
