import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// File copy using File I/O Stream
public class File5 
{
    public static void main(String[] args) 
    {
        String a = "f1.txt";
        String b = "f4.txt";

        try(FileInputStream fis = new FileInputStream(a);
            FileOutputStream fos = new FileOutputStream(b))
            {
                int data;
                while((data = fis.read()) != -1)
                {
                    fos.write(data);
                }
                System.out.println("File Copied Successfully");
            } 
        catch (IOException ex) 
            {
                ex.printStackTrace();
            }
    }
}
