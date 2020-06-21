import java.util.Scanner;

class CubeSum {
    public static void main(String[] args) {
        int firstNumber, lastNumber, counter, sum = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number");
        firstNumber = sc.nextInt();
        System.out.println("Enter the last number");
        lastNumber = sc.nextInt();

        if(firstNumber == lastNumber) {
            System.out.print("Invalid Input");
        }
        else {
            if(firstNumber < lastNumber)
                counter = 2;
            else
                counter = -2;
            
            if(firstNumber % 2 !=0)
                firstNumber += 1;

            for(int i = firstNumber; i <= lastNumber; i += counter) {
                sum = sum + (i*i*i);
            }
            System.out.print(sum);
        }
        sc.close();
    }
}