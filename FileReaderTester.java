public class FileReaderTester
{
    public static void main (String [] args)
    {
        String fileName = "1-1000.txt";
        System.out.println (Files.readFile (fileName));
        Files.writeString ("Jumanji.txt", "Welcome to the Jungle");

        //testing countChars
        System.out.println ( Files.countCharacters(fileName) ) ;
    }
}