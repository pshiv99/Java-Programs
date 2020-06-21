import java.util.Scanner;

class FuelConsumption
{
    public static void main(String[] args)
    {
        int noOfLitres, distance;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        noOfLitres = s.nextInt();
        
        if(noOfLitres <= 0) {
            System.out.print("Invalid Input");
        }
        else {
            System.out.println("Enter the distance covered");
            distance = s.nextInt();
            
            if(distance <= 0) {
                System.out.print("Invalid Input");
            }
            else {
                System.out.println("Liters/100KM");
                System.out.printf("%.2f",noOfLitres / (distance / 100.0));

                System.out.println("\nMiles/gallons");
                System.out.printf("%.2f",(distance * 0.6214f) / (0.2642f * noOfLitres));  
            }
        }
        s.close();
    }
}