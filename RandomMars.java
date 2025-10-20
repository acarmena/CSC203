/*
 * Guidelines:
As the computer scientist on the Mars Mission, you will be asked to solve problems on Mars.
This assignment will stretch your abilities to solve problems with code.
The syntax of the code required is not hard, but solving the requirements will take some thinking!

Expectations / Requirements:
Your mission is to write a program following these requirements:
    Welcome the user and provide an overview of your application.
    Use Random number generation at least 5 times in your program to make it come alive!
    Create a great User Experience (UX).
    Over comment your code with your own comments!
*/

import java.util.*;//imports the entire util from the java library
import java.util.Scanner;

public class RandomMars //name/title Red Harvest
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


    public static void Intro()//start of overview for user
    {
        System.out.println("The year is 2049. You are on Mars, stationed in the Ares Biosphere.");
        System.out.println("This is a self-contained research habitat focused on supporting life sciences");
        System.out.println("You're part of the first wave of long-term Martian settlers.");
        System.out.println();//spacing for readability

        System.out.println("As a computer scientist with a background in computational biology. You're responsible for:");
        System.out.println("\t 1. Maintaining software that powers the biosphere's agricultureal and research systerms.");
        System.out.println("\t 2. Ensuring data integrity for experiments involving Martian soil microbes, genetically modified crops, and terraforming bacteria.");
        System.out.println("\t 3. Overseeing the AI's interactions with biological systems.");
        System.out.println();//spacing for readability

        System.out.println("But, of course, something is going wrong. Crops are yeilding less and less, sensor data is being lost or corrupted, and GAIA, the station's AI, is acting erratically.");
        System.out.println("There are strange bio-readings in the soil that suggest something alive and unknown. Is it a software bug? Human sabotage? Or is something new evolving inside the Martian biome?");
        System.out.println();//spacing for readability
    }//end of intro method

    //this presents the user with the first scenario they must choose from.
    public static String Scenario1()//start of scenario 1
    {
        System.out.println("\t\tScenario 1: \"The Locked Root Protocol\"");
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
                    return "You lose 10 SSP."; 
                }

                else if(result == 4 || result == 5)
                {
                    System.out.println("Result: Yay! You succeeded.");
                    
                    ssp += 10;//increase in points
                    return "You gained 10 SSP.";
                }

                else if(result == 6)
                {
                    System.out.println("Result: You got the best outcome! As your reward you will gain an extra SSP.");

                    ssp += 11;//increase of points plus a bonus
                    return "You gained 11 SSP total!";
                }

            case 2:
                Dice();
                if(result == 1 || result == 2 || result == 3)
                {
                    System.out.println("Result: Yikes! The moderate security was too strong. You failed.");//print for the user
                    
                    ssp -= 5;//decrease of points
                    return "You lose 5 SSP."; 
                }

                else if(result == 4 || result == 5)
                {
                    System.out.println("Result: Yay! You succeeded.");
                    
                    ssp += 5;//increase of points
                    return "You gained 5 SSP.";
                }

                else if(result == 6)
                {
                    System.out.println("Result: You got the best outcome! As your reward you will gain an extra SSP.");

                    ssp += 6;//increase of points plus a bonus
                    return "You gained 6 SSP total!";
                }

            case 3:
                Dice();
                if(result == 1 || result == 2 || result == 3)
                {
                    System.out.println("Result: Yikes! The logs are not at all complete. You failed.");//print for the user
                    
                    ssp -= 0;//decrease of points
                    return "You lose nothing.";
                }

                else if(result == 4 || result == 5)
                {
                    System.out.println("Result: Yay! You succeeded but the logs are still incomplete.");
                    
                    ssp += 3;//increase of points
                    return "You gained 3 SSP.";
                }

                else if(result == 6)
                {
                    System.out.println("Result: You got the best outcome! As your reward you will gain an extra SSP.");

                    ssp += 4;//increase of points plus a bonus
                    return "You gained 4 SSP total!";
                }

            default:
                System.out.println("Invalid choice. Please choose again.");
                return Scenario1(); // call and return the method again for valid input
        }
    } //end of scenario 1 method returning the result of user choice

    public static String Scenario2()//start of scenario 2
    {
        System.out.println("\t\tScenario 2: \"How Do You Engage GAIA?\"");
        System.out.println();//spacing for readablity

        System.out.println("Your goal: Access GAIA's core logs and regain control over RP.");
        System.out.println("Your actions will score System Stability Points (SSP) which bgein at 50. If you fall below 0, GAIA locks you out completely.");
        System.out.println();//spacing for readablity

        System.out.println("Decision Point 2: Engage The AI to gain access.");
        System.out.println();//spacing for readability

        //3 different choices for the user, with different risk levels.
        System.out.println("\nChoice 1: Attempt to Reason with It.\n");//+1 to +3 SSP if persuasive, -2 if it perceives you as a threat
        System.out.println("\nChoice 2: Exploit a Vulnerability.\n");//Random roll determines outcome: can give +3 or cause a lockdown: -3
        System.out.println("\nChoice 3: Cut Power to GAIA's Sensor Subnet\n");//+2 or -4 SSP


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
                    return "You lose 10 SSP."; 
                }

                else if(result == 4 || result == 5)
                {
                    System.out.println("Result: Yay! You succeeded.");
                    
                    ssp += 10;//increase in points
                    return "You gained 10 SSP.";
                }

                else if(result == 6)
                {
                    System.out.println("Result: You got the best outcome! As your reward you will gain an extra SSP.");

                    ssp += 11;//increase of points plus a bonus
                    return "You gained 11 SSP total!";
                }

            case 2:
                Dice();
                if(result == 1 || result == 2 || result == 3)
                {
                    System.out.println("Result: Yikes! The moderate security was too strong. You failed.");//print for the user
                    
                    ssp -= 5;//decrease of points
                    return "You lose 5 SSP."; 
                }

                else if(result == 4 || result == 5)
                {
                    System.out.println("Result: Yay! You succeeded.");
                    
                    ssp += 5;//increase of points
                    return "You gained 5 SSP.";
                }

                else if(result == 6)
                {
                    System.out.println("Result: You got the best outcome! As your reward you will gain an extra SSP.");

                    ssp += 6;//increase of points plus a bonus
                    return "You gained 6 SSP total!";
                }

            case 3:
                Dice();
                if(result == 1 || result == 2 || result == 3)
                {
                    System.out.println("Result: Yikes! The logs are not at all complete. You failed.");//print for the user
                    
                    ssp -= 0;//decrease of points
                    return "You lose nothing.";
                }

                else if(result == 4 || result == 5)
                {
                    System.out.println("Result: Yay! You succeeded but the logs are still incomplete.");
                    
                    ssp += 3;//increase of points
                    return "You gained 3 SSP.";
                }

                else if(result == 6)
                {
                    System.out.println("Result: You got the best outcome! As your reward you will gain an extra SSP.");

                    ssp += 4;//increase of points plus a bonus
                    return "You gained 4 SSP total!";
                }

            default:
                System.out.println("Invalid choice. Please choose again.");
                return Scenario2(); // call and return the method again for valid input
        }
    } //end of scenario 2 method returning the result of user choice
    /*Use logic and ethics to convince GAIA to release control.

🔍 
Use a known buffer overflow in GAIA’s voice parsing module to force admin access.

🔌 Cut Power to GAIA’s Sensor Subnet
Force a reboot, but risk cascading failure.
(50/50 chance: +2 or -4 SSP)*/

/* Decision Point #3 – Final Override Attempt

You’ve found the script: terra_script_000. You must decide:

💣 Delete the Script
Destroys whatever is running — but the data may be lost forever.
(+3 SSP if successful, -2 if it triggers defensive protocol)

💾 Isolate and Copy It
Secure a copy to external media, then quarantine it.
(+2 SSP if successful, +1 bonus on future missions)

🌱 Run the Script in a Sandbox
Dangerous. You’ll see what GAIA was protecting — but it might react.
(+4 SSP if GAIA approves, -5 if hostile)

Outcome Ranges:

5+ SSP: Full system recovery; GAIA trusts you.

1–4 SSP: Partial recovery; AI autonomy continues.

0 or less: Lockout; GAIA assumes full control.
*/

    public static void main (String[] args)//beginging of main method
    {
        Intro();//calls intro method to print intro monologue
        System.out.println("Welcome Dr. Lira Halden, I hope the communte was up to par!");//extra background after user's arrival to Mars
        System.out.println("You have arrived to your station in the Ares Biosphere.");
        System.out.println("This biosphere is Mars' first agricultural and life science outpost.");
        System.out.println();//spacing for readability

        System.out.println("Your job: develop and maintain a system that monitors life sciences, while also supporting critical research.");
        System.out.println("But a mysterious system anomaly is corrupting your experimental data, shutting down sensors, and endangering the mission.");
        System.out.println("The biosphere's AI, GAIA, begins behaving strangely. Is it Martian interference, sabotage, or something entirely new?");
        System.out.println();//spacing for readability

        // Math.random();
    }
}