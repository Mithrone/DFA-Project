import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Robot
{
    public static void main(String[] args) 
    {
        int mode = Integer.parseInt(args[0]);
        String file = args[1];

        switch(mode)
        {
            case 1:
            {
                System.out.println("Hello");
                break;
            }
        }
    }
}