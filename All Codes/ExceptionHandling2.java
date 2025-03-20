//Multipal Catch Block with different Exception
public class ExceptionHandling2 
{
    public static void main(String[] args) 
    {
        try
        {
            String s = null;
            System.out.println(s.length());

            int[] n = {1,2,3};
            System.out.println(n[5]);
        }
        catch (NullPointerException e)
        {
            System.out.println("Error:Null Pointer Exception");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error:Array Index Out Of Bound Exception");
        }
        catch (Exception e)
        {
            System.out.println("Error:Exception Has Occur");
        }
        finally
        {
            System.out.println("Finally its executed");
        }
    }
}
