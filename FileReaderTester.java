public class FileReaderTester
{
    public static void main (String [] args)
    {
        Files file = new Files();
        System.out.println (file.readFile ("1-1000.txt"));
        file.writeString ("Jumanji", "Welcome to the Jungle");
    }
}