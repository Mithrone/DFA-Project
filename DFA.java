import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.lang.Thread.State;
import java.text.StringCharacterIterator;
import java.util.Scanner; // Import the Scanner class to read text files

public class DFA
{
    int statesCount;
    int edgesCount;
    int transitionsCount;

    final String[] posName = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","AA","BB","CC","DD","EE","FF","GG","HH","II","JJ","KK","LL","MM","NN","OO","PP","QQ","RR","SS","TT","UU","VV","WW","XX","YY","ZZ"};

    
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
                    statesCount = Integer.parseInt(val[0]);
                    edgesCount = Integer.parseInt(val[1]);
                    transitionsCount = Integer.parseInt(val[2]);

                    firstLine = false;
                }
                else
                {
                    String[] val = line.split(" ");
                    
                    
                    
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


    class States
    {
        int edgeCount = 1;
        String[] edges = new String[edgeCount];

        int conCount = 1;
        String[] connected = new String[conCount];
        
        States()
        {

        }

        public void addEdge(String e)
        {
            String[] temp = edges;

            edges = new String[++edgeCount];

            for(int i = 0; i< edgeCount - 1; i++)
            {
                edges[i] = temp[i];
            }

            edges[edgeCount] = e;
        }

        public void addConnection(String c)
        {
            String[] temp = edges;

            connected = new String[++conCount];

            for(int i = 0; i< conCount - 1; i++)
            {
                edges[i] = temp[i];
            }

            connected[conCount] = c;
        }
    }
}