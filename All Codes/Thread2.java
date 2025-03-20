class Data
{
    public void number(int a)
    {
        synchronized (this) 
        {
            for (int i=1; i<=10; i++) 
            {
                System.out.println(Thread.currentThread().getName() + " Data: " +(a*i));
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class Thread2 
{
    public static void main(String[] args) 
    {
        Data d = new Data();
    }
}
