import java.util.Scanner;

class NMSCompany {
    public static void main(String[] args) {
        int totalTickets, needTickets, totalEmployees = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Total number of tickets: ");
        totalTickets = s.nextInt();

        if(totalTickets <= 100) {
            while(true) {
                System.out.print("Enter the number of tickets u need: ");
                needTickets = s.nextInt();
    
                if(needTickets > 3) {
                    System.out.println("Maximum of 3 tickets per person");
                }
                else {
                    if(needTickets > totalTickets) {
                        System.out.println("Check the ticket availability.");
                    }
                    else {
                        totalTickets -= needTickets;
                        totalEmployees++;
                        if(totalTickets == 0) {
                            System.out.println("No more tickets.");
                            break;
                        }
                        else 
                            System.out.println("Tickets Available: " + totalTickets);
                    }
                }
            }
            System.out.print("Number of Employees who got the tickets: " + totalEmployees);
        }
        else
            System.out.print("Bulk purchase of tickets is limited to 100");
        s.close();
    }
}