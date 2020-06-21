import java.util.Scanner;

class HannahGarden {
    public static void main(String[] args) {
        double area, diameter;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area of terrace");
        area = sc.nextInt();
        if(area <= 0) {
            System.out.print("Invalid Input");
        }
        else {
            System.out.println("Enter the diameter of the pot");
            diameter = sc.nextInt();
            if(diameter <= 0 || diameter > area) {
                System.out.print("Invalid Input");
            }
            else {
                int noOfPots;
                noOfPots = (int)(Math.sqrt(area) / diameter * 12);
                System.out.print(noOfPots);
            } 
        }
        sc.close();
    }
}