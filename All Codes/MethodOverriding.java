class school
{
    void boys()
    {
        System.out.println("How many boys are there in school?");
    }
}
class college extends school
{
    @Override
    void boys()
    {
        System.out.println("How many girls are there in college?");
    }
}
public class MethodOverriding 
{
    public static void main(String[] args)
    {
        college c = new college();
        c.boys();
    }
}
