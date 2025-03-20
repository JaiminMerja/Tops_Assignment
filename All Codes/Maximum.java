
import java.util.Scanner;

public class Maximum 
{
    //Method name
    public static int findmax(int a,int b, int c)
    {
        if(a>b && a>c) 
        return a;
        else if(b>a && b>c)
        return b;
        else 
        return c;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = s.nextInt();
        System.out.println("Enter b:");
        int b = s.nextInt();
        System.out.println("Enter c:");
        int c = s.nextInt();
        System.out.println("Maximum in three number:"+findmax(a, b, c));
    }
}