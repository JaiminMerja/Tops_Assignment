
import java.util.Scanner;


// program to read input from console using Scanner
public class File4 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Name:");
        String name = s.nextLine();
        System.out.println("Age:");
        int age = s.nextInt();

        System.out.println("Hello "+ name + " You are "+ age + " years old");
        
    }
}
