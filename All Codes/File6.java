import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Read from 1 file and writer in 2 file 
public class File6 
{
    public static void main(String[] args) 
    {
        String inputFile = "f1.txt";    
        String outputFile = "f5.txt";  

        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) 
            {
            int data;
            while ((data = reader.read()) != -1) 
            {  
                writer.write(data);  
            }
            System.out.println("Content copied successfully");
            } 
        catch (IOException e) 
            {
                e.printStackTrace();
            }
    }
}
