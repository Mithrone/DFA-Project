import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class DFA
{
    String file;
    DFA(String f)
    {
        file = f;

        try 
        {
            File in = new File(file);
            Scanner read = new Scanner(in);
            while (read.hasNextLine()) 
            {
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }    
}