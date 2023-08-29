import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class FileWriter
{
    String input;
    public void writeFile(String outputFile, String inputMessage)
    {
        input = inputMessage;
        for (int i = 0; i < 1000; i++)
        {

        }
        System.out.println ("new message: ");
    }
    public String readFile (String inputFile)
    { 
        String finalString = "";
        try {
        BufferedReader reader = new BufferedReader(new FileReader (inputFile));
        String line = reader.readLine();

        while (line != null)
        {
            finalString = finalString + line;
            reader.readLine();
        }
        reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return finalString;
    }
}