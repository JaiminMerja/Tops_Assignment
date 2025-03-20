
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Read and Write Content Using FileReader and FileWriter
public class File1 
{
    public static void main(String[] args) 
    {
        String s = "f1.txt";
        String a = "This is FileWriter and FileReader";

        try (FileWriter w = new FileWriter(s))
        {
        w.write(a);
        System.out.println("Content Done...");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try (FileReader r = new FileReader(s))
        {
            int b;
            System.out.println("Reading the File:");
            while((b = r.read()) != -1)
            {
                System.out.print((char) b);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
