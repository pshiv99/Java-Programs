import java.util.Scanner;

class WaterlemonShare
{
    public static void main(String[] args)
    {
        int weight_watermelon, no_of_friends;
        float my_share, brother_share, friends_share;
       
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the weight of watermelon in Kgs:");
        weight_watermelon = s.nextInt();
        System.out.println("Enter the number of friends:");
        no_of_friends = s.nextInt();
        
        if(weight_watermelon<=0 || no_of_friends<=0)
            System.out.print("Invalid input");
        else 
        {
            my_share = 0.25f * weight_watermelon;
            brother_share = 0.75f * weight_watermelon;
            friends_share = (0.25f * my_share + 0.75f * brother_share)/no_of_friends;
            my_share = 0.75f * my_share;
            brother_share = 0.25f * brother_share;
            
            System.out.printf("My share of watermelon: %.2f Kgs\n", my_share);
            System.out.printf("My brother's share: %.2f Kgs\n", brother_share);
            System.out.printf("Each of our friend's share: %.2f Kgs", friends_share);
        }  
        s.close();  
    }
}