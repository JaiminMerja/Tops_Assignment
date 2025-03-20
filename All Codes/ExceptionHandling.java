// Try-Catch-Finally
import java.util.Scanner;

public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        try
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st Number:");
            int a = s.nextInt();
            System.out.println("Enter 2nd Number:");
            int b = s.nextInt();
            int c = a/b;
            System.out.println("Result is:"+c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("This is not possible");
        }
        finally
        {
            System.out.println("Result is Here");
        }
    }   
}
