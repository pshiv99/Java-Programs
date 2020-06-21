import java.util.Scanner;

class BambooHeight
{
    public static void main(String[] args)
    {
        int initialHeight = 3, finalHeight, noOfYears = 0;
        
        Scanner s = new Scanner(System.in);
        finalHeight = s.nextInt();

        if(finalHeight > 10000)
            System.out.print("Bamboo cannot grow more than 10000 feet");
        else if(finalHeight == 0)
            System.out.print("Bamboo height cannot be zero");
        else if(finalHeight < 0)
            System.out.print("Bamboo height cannot be negative");
        else
        {
            while(initialHeight < finalHeight)
            {
                initialHeight *= 2;
                noOfYears++;
            }
            if(initialHeight == finalHeight)
                System.out.printf("It will take %d years for the Bamboo tree to reach a height %d feet", noOfYears, finalHeight);
            else
                System.out.print("Invalid Input");
        }
        s.close();
    }
}