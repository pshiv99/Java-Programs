import java.util.Scanner;

class CombinationLock {
    public static void main(String[] args) {
        String firstNumber, secondNumber = "";
        int i = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        firstNumber = s.nextLine();

        try {
            int number = Integer.parseInt(firstNumber);
            if(number == 8888 || number < 0)
                System.out.print("Invalid Input");
            else {
                try {
                    // checks for the leading 0
                    while(firstNumber.charAt(i) == '0') {
                        i++;
                    }
                    // checks for the leading 8
                    while(firstNumber.charAt(i) == '8') {       
                        i++;
                    }

                    while(i < firstNumber.length()) {
                        int temp = (int)firstNumber.charAt(i);
                        if(temp >= 56)
                            temp = temp - 10;
                        secondNumber = secondNumber + (char)(temp + 2);
                        i++;
                    }
                    System.out.print("The second number is: " + secondNumber);
                }
                catch(StringIndexOutOfBoundsException e) {
                    System.out.print("Invalid Input");
                }
            }
        }
        catch(NumberFormatException e) {
            System.out.print("Invalid Input");
        }
        s.close();
    }
}