package CSC203;
import java.util.Scanner;
public class Demo 
{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        int health = 100;
        System.out.println("\n\n*Welcome to your mission to Mars ***\n\n");
        System.out.println("Your space ship has just arrived on Mars, however on the way the water maker broke.");
        System.out.println("Your crew is very thirsty and depending on you for their survival.");

        //scenario 1
        System.out.println("You and your crew exit the rocket and are now on Mars.");
        System.out.println("From the north, you hear splashing of waves crashing.");
        System.out.println("From the south, you hear a growling.");

        //choices
        System.out.println("What are your orders, commander?");
        System.out.println("Enter 1 to go North");
        System.out.println("Enter 2 to go South");
       
        //user choice
        int choice = input.nextInt();
        if(choice == 1)
        {
            System.out.println("You went North and found a fresh water lake on Mars and your entire crew drank all they wanted.");
        }
        else if(choice == 2)
        {
            System.out.println("You went South and your crew was bitten and wounded by a martian bear.");
            health -= 25;
            System.out.println("You have lost 25 points of health");
        }
    }
}
