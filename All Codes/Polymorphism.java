class husband
{
    void work()
    {
        System.out.println("Husband has more work in office");
    }
}
class wife extends husband
{
    @Override
    void work()
    {
        System.out.println("Wife has more work at home");
    }
}
class child extends wife
{
    @Override
    void work()
    {
        System.out.println("Child has more work at school");
    }
}

public class Polymorphism 
{
    public static void main(String[] args) 
    {
        husband h = new husband();
        h.work();
        wife w = new wife();
        w.work();
        child c = new child();
        c.work();
    }
}
