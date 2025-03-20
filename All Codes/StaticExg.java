public class StaticExg 
{
    //Static Variable
    static int a = 1;

    //Static method to increment
    public static void increment()
    {
        a++;
    }
    
    //Static method to represent
    public static void display()
    {
        System.out.println("Display:"+a);
    }
    public static void main(String[] args) 
    {
        StaticExg.increment();
        StaticExg.increment();
        StaticExg.display();
    }
}