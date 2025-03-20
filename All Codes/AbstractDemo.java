abstract class boss
{
    abstract void project();
}
class worker extends boss
{
    @Override
    void project()
    {
        System.out.println("Money is good");
    }
}
public class AbstractDemo 
{
    public static void main(String[] args) 
    {
        worker w = new worker();
        w.project();
    }
}
