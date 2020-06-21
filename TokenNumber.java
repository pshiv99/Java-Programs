import java.util.Scanner;

class Token {
    private static int tokenNumber;
    private int counterNumber;
    private String serviceType;
    
    public Token(String serviceType) {
        this.serviceType = serviceType;
        if(serviceType.equals("Deposit")) 
            counterNumber = 3;
        else if(serviceType.equals("Withdraw"))
            counterNumber = 2;
        else if(serviceType.equals("Cheque deposit"))
            counterNumber = 1;
        else 
            counterNumber = 4;
    }

    public static int getTokenNumber() {
        tokenNumber++;
        return tokenNumber;
    }

    public int getCounterNumber() {
        return counterNumber;
    }

    public String getServiceType() {
        return serviceType;
    }
}
class TokenNumber {
    public static void main(String[] args) {
        String serviceType;
        char ans = 'Y';
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the service type for first customer:");
        serviceType = s.nextLine();

        Token token = new Token(serviceType);
        System.out.printf("Your Token number is:%d and Counter number is:%d\n", Token.getTokenNumber(), token.getCounterNumber());

        System.out.print("Any more customers (Y/N)? ");
        ans = s.nextLine().charAt(0);
        while(ans == 'Y') {
            System.out.println("Enter the service type for next customer:");
            serviceType = s.nextLine();

            token = new Token(serviceType);
            System.out.printf("Your Token number is:%d and Counter number is:%d\n", Token.getTokenNumber(), token.getCounterNumber()); 
            System.out.print("Any more customers (Y/N)? ");
            ans = s.nextLine().charAt(0);
        }
        s.close();
    }
}