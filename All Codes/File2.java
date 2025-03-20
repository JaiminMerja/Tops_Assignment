
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Read a File Line by Line Using BufferedReader
public class File2 
{
    public static void main(String[] args) 
    {
        String c = "f2.txt";

        try(FileWriter fw = new FileWriter(c))
        {
            fw.write("First.\n");
            fw.write("Second.\n");
            fw.write("Third.");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader(c)))
        {
            String line;
            System.out.println("Reading the file line by line:");
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
