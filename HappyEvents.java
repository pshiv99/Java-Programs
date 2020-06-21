import java.util.Scanner;

class HappyEvents {
    public static void main(String[] args) {
        int noOfGuests;
        String customerName, date;
        float totalAmount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the customer");
        customerName = sc.nextLine();
        System.out.println("Enter the date");
        date = sc.nextLine();
        System.out.println("Enter the number of guests");
        noOfGuests = sc.nextInt();

        if(noOfGuests > 200) {
            System.out.print("Check for a separate plan");
        }
        else {
            totalAmount = noOfGuests * 350;
            if(noOfGuests >= 50 && noOfGuests <=99) {
                totalAmount = totalAmount + totalAmount * 0.12f;
            }
            else if(noOfGuests >=100 && noOfGuests <=149) {
                totalAmount = totalAmount + totalAmount * 0.15f;
            } 
            else if(noOfGuests >= 150) {
                totalAmount = totalAmount + totalAmount * 0.18f;
            }

            System.out.println("Happy Events");
            System.out.println("Name of the customer: " + customerName);
            System.out.println("Date of the event: " + date);
            System.out.println("No. of guests: " + noOfGuests);
            System.out.printf("Total Amount: Rs.%.0f", totalAmount);
        }
        sc.close();
    }
}