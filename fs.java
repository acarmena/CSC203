// I am going to create a text adventurer about time travel
// Import the libraries I need for this app
// To take user input I will need Scanner lib
import java.util.Scanner;

// Let's create the class
public class fs
{
    // Create a method to display the introduction of the game
    public static void displayIntroduction()
    { // The displayIntroduction method starts here
        System.out.println("\n\n ***** Welcome to THE FORGOTTEN STATION! ***** \n\n");
        System.out.println("You wake up in a cold, sterile room with no memory of how you got here. Your head throbs with pain, and your vision is blurry. As your eyes adjust to the dim emergency lighting, you realize you're in some kind of research facility. The walls are white, clinical, but stained with something dark. A sign on the wall reads \"DEEP SEA RESEARCH STATION EREBUS - Level 7.\"");
        System.out.println("Through a small porthole window, you see only darkness and the occasional bioluminescent creature drifting past. You're underwater. Deep underwater.");
        System.out.println("Your health starts at 80. The facility's oxygen is failing. You need to find a way to the surface before it runs out... or before you discover why the station was abandoned.");
    } // The end of the displayIntroduction method

    // Create a method to for the first senario The medical bay
    public static int medicalBay(int playerHealth)
    {
        // The medicalBay method starts here
        System.out.println("\n\n Scenario 1: The Medical Bay \n\n");
        System.out.println("You stumble into the medical bay, hoping to find supplies. The room is in chaos—cabinets torn open, equipment smashed, and medical charts scattered everywhere. You notice three things:");
        System.out.println("A locked medicine cabinet with a glowing keypad, a surgical table with restraint straps torn apart, and a computer terminal that's still flickering with power.");
        System.out.println("\nChoice 1: Force open the medicine cabinet\n");
        System.out.println("\nChoice 2: Access the computer terminal\n");
        System.out.println("\nChoice 3: Investigate the surgical table\n");

        // Here I will need to take user input to decide what to do next
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Use a switch statement to handle the user's choice
        switch(choice){
        case 1:
            System.out.println("Result: You slam your shoulder into the cabinet door repeatedly until it breaks open. Inside you find painkillers, antibiotics, and a strange syringe filled with glowing blue liquid labeled \"NEURAL ENHANCER - EXPERIMENTAL.\" You take the painkillers and antibiotics but hesitate at the syringe. You pocket it for later. However, forcing the cabinet open has left your shoulder badly bruised and possibly dislocated.");
            // decrease player health
            System.out.println("Health Impact: -10 (injury from forcing the cabinet, but you gained medical supplies that might help later)");
            playerHealth -= 10;
            break;
        case 2:
            System.out.println("Result: You boot up the terminal. It requires a password, but you notice a sticky note under the keyboard: \"LEVIATHAN_7.\" The system grants you access. You discover logs from Dr. Sarah Chen describing an organism discovered in the trench below—something intelligent, something that can mimic human voices. The last entry reads: \"It's in the station. It's learning. Don't trust anyone who—\" The log cuts off. You also find a map showing a route to the escape pods. The knowledge is valuable, but reading the horrifying details has left you shaken and anxious.");
            // Increase player health but also add a risk factor
            // playerHealth += 10; // Uncomment this line if playerHealth is accessible here
            break;
        case 3:
            System.out.println("Result: You examine the restraint straps—they're torn from the inside, not cut. Something with incredible strength broke free. Underneath the table, you find a medical kit intact with bandages, antiseptic, and a shot of adrenaline. You also discover a hand-written note: \"If you're reading this, stay away from the bio-containment sector. They released Subject Zero.\" You treat your head wound and feel immediately better.");
            // Maybe add an oxygen level variable here
            break;
        default:
            System.out.println("Invalid choice. Please choose again.");

        medicalBay(playerHealth); // Call the method again for valid input
        }
        return playerHealth; // Return the updated player health
    } // The medicalBay method ends here
    
    // The class starts here
    // Create the main method which is the entry point of any Java application
    public static void main(String[] args)
    {
        // The main method starts here
        // Create a Scanner object to read user input
        // The scanner object came from the Scanner library
        Scanner scanner = new Scanner(System.in);
        // Create a variable to hold the player's health
        int playerHealth = 80;
        // Call the method to display the introduction of the game
        displayIntroduction();
        // Display the player's initial health
        System.out.println("\nYour initial health is: " + playerHealth);
        // Call the medicalBay method and update playerHealth
        playerHealth = medicalBay(playerHealth);
        // Display the player's health after the medical bay scenario
        System.out.println("\nYour health after the medical bay scenario is: " + playerHealth);

    } // The end of the main method

} // The end of the class