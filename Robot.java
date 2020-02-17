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