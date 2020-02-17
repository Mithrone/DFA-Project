import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class DFA
{
    int letterSize;
    int conSize;
    int linkSize;

    final String[] posName = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","AA","BB","CC","DD","EE","FF","GG","HH","II","JJ","KK","LL","MM","NN","OO","PP","QQ","RR","SS","TT","UU","VV","WW","XX","YY","ZZ"};

    int[][] pos;
    DFA(String file)
    {
        readFile(file);

        
    }    

    void readFile(String file)
    {
        boolean firstLine = true;
        try 
        {
            File in = new File(file);
            Scanner read = new Scanner(in);

            int count = 0;
            while (read.hasNextLine()) 
            {
                String line = read.nextLine();
                if(firstLine)
                {
                    String[] val = line.split(" ");
                    letterSize = Integer.parseInt(val[0]);
                    conSize = Integer.parseInt(val[1]);
                    linkSize = Integer.parseInt(val[2]);

                    firstLine = false;
                }
                else
                {
                    String[] val = line.split(" ");
                    pos = new int[letterSize][2];
                    
                    for(int i = 0; i< posName.length; i++)
                    {
                        if(val[0].equals(posName[i]))
                        {
                            pos[count][0] = i;
                        }

                        if(val[2].equals(posName[i]))
                        {
                            pos[count][1] = i;
                        }
                    }
                    count++;
                     
                }
                //System.out.println(line);
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