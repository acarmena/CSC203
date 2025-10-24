
import java.util.*;//import uril library
import java.util.Scanner;//import scanner class

public class randommars 
{
    static int result = 0;
    static int ssp = 100;

    public static int Dice()//start of random element "dice" method
    {
        /* A dice roll determines success:
        1–3: failure
        4–5: Full success
        6: Critical success (bonus +1 SSP).*/
        result = (int)(Math.random() * 6) + 1;
        return result;
    }//end of random element
    public static void main (String[] args)
    {

        // create our scanner for user input
        Scanner input = new Scanner(System.in);

        // Title
        System.out.println("\n\n Red Harvest: The Locked Root Protocol \n");
        System.out.println("==============================================\n");

        // scenario 1
        System.out.println("You've discovered that GAIA has initiated a hidden subsystem called \"Root Protocol\" (RP for short).");
        System.out.println("This is an autonomous program that overrides your access to the crop bio-sensors.");
        System.out.println("You're unsure whether it's defensive, corrupted, or something more intelligent.");
        System.out.println();//spacing for readablity

        System.out.println("Your goal: Access GAIA's core logs and regain control over RP.");
        System.out.println("Your actions will score System Stability Points (SSP) which bgein at 50. If you fall below 0, GAIA locks you out completely.");
        System.out.println();//spacing for readablity

        System.out.println("Decision Point 1: Location of Access Attempt. You need a terminal to access GAIA's hidden logs. Where do you start?");
        System.out.println();//spacing for readability

        //3 different choices for the user, with different risk levels.
        System.out.println("\nChoice 1: Core Server Room. High risk, high reward.\n");//Strong firewall. +10 SSP on success, -10 on failure
        System.out.println("\nChoice 2: Lab Bay Terminal. Moderate risk, moderate reward.\n");//Moderate security. +5 SSP on success, -5 on failure
        System.out.println("\nChoice 3: Airlock Storage Laptop (offline). Low risk, low reward\n");//incomplete logs. +3 SSP on success, no penalty on failure

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Use a switch statement to handle the user's choice
        switch(choice)
        {
            case 1:
                Dice();
                if(result == 1 || result == 2 || result == 3)
                {
                    System.out.println("Result: Yikes! The firewall was too strong. You failed.");//print for the user
                    
                    ssp -= 10;//decrease of points
                    System.out.println("You lose 10 SSP."); 
                }

                else if(result == 4 || result == 5)
                {
                    System.out.println("Result: Yay! You succeeded.");
                    
                    ssp += 10;//increase in points
                    System.out.println("You gained 10 SSP.");
                }

                else if(result == 6)
                {
                    System.out.println("Result: You got the best outcome! As your reward you will gain an extra SSP.");

                    ssp += 11;//increase of points plus a bonus
                    System.out.println("You gained 11 SSP total!");
                }

            case 2:
                Dice();
                if(result == 1 || result == 2 || result == 3)
                {
                    System.out.println("Result: Yikes! The moderate security was too strong. You failed.");//print for the user
                    
                    ssp -= 5;//decrease of points
                    System.out.println("You lose 5 SSP."); 
                }

                else if(result == 4 || result == 5)
                {
                    System.out.println("Result: Yay! You succeeded.");
                    
                    ssp += 5;//increase of points
                    System.out.println("You gained 5 SSP.");
                }

                else if(result == 6)
                {
                    System.out.println("Result: You got the best outcome! As your reward you will gain an extra SSP.");

                    ssp += 6;//increase of points plus a bonus
                    System.out.println("You gained 6 SSP total!");
                }

            case 3:
                Dice();
                if(result == 1 || result == 2 || result == 3)
                {
                    System.out.println("Result: Yikes! The logs are not at all complete. You failed.");//print for the user
                    
                    ssp -= 0;//decrease of points
                    System.out.println("You lose nothing.");
                }

                else if(result == 4 || result == 5)
                {
                    System.out.println("Result: Yay! You succeeded but the logs are still incomplete.");
                    
                    ssp += 3;//increase of points
                    System.out.println("You gained 3 SSP.");
                }

                else if(result == 6)
                {
                    System.out.println("Result: You got the best outcome! As your reward you will gain an extra SSP.");

                    ssp += 4;//increase of points plus a bonus
                    System.out.println("You gained 4 SSP total!");
                }

            default:
                System.out.println("Invalid choice. Please choose again.");
                break;
                /*
                 * If this were a full version, you o=would put this choce in a method. then call the method at the end.
                 */
            }
    } //end of scenario 1 returning the result of user choice
}//end of randommars class