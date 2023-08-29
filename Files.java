import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Files
{
    public static void writeString(String outputFile, String input) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(input);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public static String readFile (String inputFile)
    { 
        try (BufferedReader reader = new BufferedReader (new FileReader(inputFile)))
        {
            StringBuilder message = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null)
            {
                message.append (line).append ("\n");
            }
            return message.toString();
        } catch (IOException e)
        {
            System.out.println ("Error:" + e.getMessage());
        }
        return null;
    }

    public static int countCharacters (String fileName)
    {
        try 
        {
            BufferedReader br = new BufferedReader (new FileReader(fileName));
            
            int count = 0;
            while (br.ready())
            {
                br.read();
                count++; 
            }
            
            br.close();
            return count; 
        }
        catch (IOException e)
        {
            System.out.println (e.getMessage());
            return -1; 
        }
    }
}