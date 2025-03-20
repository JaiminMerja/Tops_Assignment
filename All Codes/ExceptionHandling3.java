//Custom Exception Handling
class InvalidAge extends Exception
{
    public InvalidAge(String message)
    {
        super(message);
    }
}
public class ExceptionHandling3 
{
    static void validage(int age) throws InvalidAge
    {
        if(age < 18)
        {
            throw new InvalidAge("Age must be above 18");
        }
        System.out.println("Valid Age");
    }
    public static void main(String[] args) 
    {
        try
        {
            validage(10);
        }
        catch (InvalidAge e)
        {
            System.out.println("Alert:"+e.getMessage());
        }
        finally
        {
            System.out.println("Age Apporved");
        }
    }
}
