
import java.util.Scanner;

public class StringReverseandPalindromes 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a = s.nextLine();
        String reverse ="";
        for(int i=a.length()-1; i>=0; i--)
        {
            reverse += a.charAt(i);
        }
        System.out.println("Reverse String:"+reverse);
        if (reverse.equalsIgnoreCase(a))
        {
            System.out.println("Is a Palidrome");
        }
        else 
        {
            System.out.println("Not a Palidrome");
        }
    }
}
