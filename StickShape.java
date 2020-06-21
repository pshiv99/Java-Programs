import java.util.Scanner;

class StickShape {
    public static void main(String[] args) {
        int side1, side2, side3, side4, angle;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the four sticks in cm");
        side1 = s.nextInt();
        side2 = s.nextInt();
        side3 = s.nextInt();
        side4 = s.nextInt();
        System.out.println("Enter one internal angle");
        angle = s.nextInt();

        if((side1 == side2) && (side2 == side3) && (side3 == side4)) {
            if(angle == 90)
                System.out.print("It's a square");
            else
                System.out.print("It's a rhombus");
        }
        else if((side1 == side2) && (side3 == side4)) {
            if(angle == 90)
                System.out.print("It's a rectangle");
            else    
                System.out.print("It's a parallelogram");
        }
        else
            System.out.print("It's a irregular quadrilateral");   
        
        s.close();
    }
}