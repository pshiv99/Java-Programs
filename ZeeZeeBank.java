import java.util.Scanner;

class Account {
    private long accountNumber;
    private double balanceAmount;
    
    public Account(long accountNumber, double balanceAmount) {
        this.accountNumber = accountNumber;
        this.balanceAmount = balanceAmount;
    }

    public double getBalanceAmount() {
        return this.balanceAmount;
    }

    public void deposit(double depositAmount) {
        this.balanceAmount += depositAmount;
    }

    public int withdraw(double withdrawAmount) {
        if(withdrawAmount <= this.balanceAmount) {
            this.balanceAmount -= withdrawAmount;
            return 1;
        }
        else
            return -1;
    }
}
class ZeeZeeBank {
    public static void main(String[] args) {
        long accountNumber;
        double balanceAmount, depositAmount, withdrawAmount;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the  account number:");
        accountNumber = s.nextLong();
        System.out.println("Enter the available amount in the account:");
        balanceAmount = s.nextDouble();
        System.out.println("Enter the amount to be deposited:");
        depositAmount = s.nextDouble();

        Account account = new Account(accountNumber, balanceAmount);
        account.deposit(depositAmount);

        System.out.printf("Available balance is:%.2f\n", account.getBalanceAmount());
        System.out.println("Enter the amount to be withdrawn:");
        withdrawAmount = s.nextDouble();
        
        if(account.withdraw(withdrawAmount) == -1)
            System.out.println("Insufficient Balance");
        
        System.out.printf("Available balance is:%.2f", account.getBalanceAmount());
        s.close();
    }
}