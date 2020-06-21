import java.util.Scanner;

class ClearanceSale
{
    public static void main(String[] args)
    {
        String itemName;
        int noOfItems, sum = 0, price, noOfDays = 0, totalAmount = 0;
        int[] itemsSoldEachDay = new int[4];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the item:");
        itemName = s.nextLine();
        System.out.println("Enter the price of the item:");
        price = s.nextInt();
        System.out.println("Enter the number of items for sale:");
        noOfItems = s.nextInt();

        for(int i=0; i<4; i++)
        {
            System.out.print("Enter the number of items sold on Day" + (i+1) + ":");
            itemsSoldEachDay[i] = s.nextInt();
            noOfDays++;
            sum = sum + itemsSoldEachDay[i];
            if(sum == noOfItems)
                break;
        }

        System.out.println(itemName);
        System.out.printf("%-10s%-30s%-10s", "Day", "No.of items_available", "Price");
        int noOfItemsAvailable = noOfItems;
        for(int i=0; i<noOfDays; i++)
        {   
            System.out.printf("\n%-10s%-30d%-10d", ("Day"+(i+1)), noOfItemsAvailable, price);
            noOfItemsAvailable = noOfItemsAvailable - itemsSoldEachDay[i];
            totalAmount = totalAmount + itemsSoldEachDay[i] * price;
            price = (price*93)/100;
        }
        System.out.print("\nTotal amount of Sales = Rs." + totalAmount);
        s.close();
    }
}
