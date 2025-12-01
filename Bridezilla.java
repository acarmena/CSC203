import java.util.Scanner;
public class Bridezilla 
{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        int memory = 100; //intact, wrong choices make you forget more
        System.out.println("\n\n*** Welcome to The Vanishing at the Veranda ***\n\n");// quaint town of Willowmere
        System.out.println("You have just arrived to a quaint town known as Willowmere.");
        System.out.println("Your cousin, Ezra, is finally getting married. But you wouldn't expect any less from a man like him.");

        //scenario 1 & user choice
        System.out.println("As you hop into your respective taxi, the driver indirectly asks for your name.");
        System.out.println("Welcome to Willowmere, uh...");
        String name = input.nextLine();
        System.out.println("Welcome, " + name + "! Where to?");
        System.out.println("Your reply is short and sweet, The Veranda, please");
        System.out.println("As the car begins to take you to the wedding venue, you let you mind wander.");
        System.out.println("Your thoughts are inturrupted with a loud question. " + name + "! Isn't that crazy?");
        System.out.print("You jolt and look a bit confused, I am sorry, what were you saying?");
        System.out.print("Oh, he laughs no worries! How old are you? ");
        int age = input.nextInt();
        System.out.print("Okay.. that means you would be... you watch as he thinks a little too hard.");
        int currentYr = 2025;  // You can change this to the current year dynamically if needed
        int when = currentYr + (100 - age);
        System.out.println(name + ", you will turn 100 years old in the year " + when + "!");
        System.out.println("You were so confused and caught off guard that you burst into laughter as did the driver.");
        int monthsOld = age * 12;
        System.out.println("As you approach the venue's inn, the driver says one last fun fact:");
        System.out.println("Did you know you are about "  + monthsOld + " months old right now!"); 
    }
}