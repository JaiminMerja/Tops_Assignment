import java.util.Scanner;

public class StringCompare 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1 = s.nextLine();
        System.out.println("Enter String 2:");
        String s2 = s.nextLine();

        if(s1.equals(s2))
        {
            System.out.println("String are equals using equals()");
        }
        else
        {
            System.out.println("String are not equals");
        }
        int s3 = s1.compareTo(s2);
        if(s3 == 0)
        {
            System.out.println("String are equals using compareTo()");
        }
        else if (s3 < 0)
        {
            System.out.println("First String is smaller than Second String");
        }
        else
        {
            System.out.println("First String is greater than second String");
        }
    }
}
