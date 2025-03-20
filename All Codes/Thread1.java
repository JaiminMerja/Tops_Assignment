//Write a program to create and run multiple threads 
//using the Thread class.
class First extends Thread
{
    public void run()
    {
        for (int i=1; i<=10; i++) 
        {
            System.out.println("How many number are there:"+i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class Thread1 
{
    public static void main(String[] args) 
    {
        First f = new First();
        f.start();
        for (int i=1; i<=10; i++) 
        {
            System.out.println("How many number are there:"+i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
