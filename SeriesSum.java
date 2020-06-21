import java.util.Scanner;

class SeriesSum
{
    public static void main(String[] args)
    {
        int firstNumber, noOfTerms, sum = 0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the first number");
        firstNumber = s.nextInt();  
        System.out.println("Enter the nth number");
        noOfTerms = s.nextInt();
        
        if(firstNumber < 0 || noOfTerms < 0)
            System.out.print("Invalid Input");
        else
        {
            for(int i = 1; i <= noOfTerms; i++)
            {
                if(i % 2 == 0)
                {
                    sum = sum + firstNumber;
                    System.out.print("+" + firstNumber);
                }    
                else
                {
                    System.out.print("-" + firstNumber);
                    sum = sum - firstNumber;
                }
                firstNumber++;
            }
            System.out.println("=" + sum);
            if(sum < 0)
                System.out.print("The sum of the series is a negative number");
            else
                System.out.print("The sum of the series is a positive number");
        }
        s.close();
    }
}