import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Files
{
    String input;
    public void writeString(String outputFile, String input) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(input);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public String readFile (String inputFile)
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
}