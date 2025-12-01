import java.util.Scanner;
//import javax.sql.rowset.spi.SyncFactory;

public class MidnightCaller //this starts the scope of the class
{
    //user's "health" values being initialzed
    static int wealth = 0;
    static int sanity= 100;
    static int reputation= 50;

    //the intro to the text-adventure story
    public static void Introduction()
        {
            /*Midnight Caller
            A late-night radio host begins receiving cryptic calls that seem to predict crimes. Can you trace the caller before it's too late?*/

            System.out.println("You're Zane Vance, host of The Midnight Frequency.");
            System.out.println("This is a late-night radio show known for its eerie callers, strange theories, and lonely insomniacs.");
            System.out.print("The station is nearly empty, ");
            System.out.println("the hum of the fluorescent lights above you and the sound of shutting doors, the only sign of life.");
            System.out.println("Then, at 12:07 a.m., the phone line crackles.");
            System.out.println("\n\n'You can't stop it, Zane. The first one's tonight.'\n\n");
            System.out.println("\n\n ** Click. **\n\n");
            System.out.println(); //spacing for user readiblity

            System.out.println("The call ends. You stare at the receiver, the on-air light flickering faintly.");
            System.out.println("Something about the voice makes your pulse quicken as if it wasn't a prank.");
            System.out.println("Your show must go on... but now, so must your investigation.");
            System.out.println("Your sanity, wealth, and reputation are all on the line. Which will rule?");
            System.out.println(); //spacing for user readiblity

        }

        //this presents the user with the first scenario they must choose from.
        public static String Scenario1() //method begins here
        {
            // sanity, wealth, and reputation are typically all effected
            System.out.println("\n\n Scenario 1: The First Call \n\n");
            System.out.println("'Check the old bridge before dawn. The river remembers.'");
            System.out.println("As the phone clicks once more, you think of the only old brigde in town. Telling you the caller is either a well-versed traveller or a local.");
            System.out.println();//spacing for user readiblity

            //3 different choices for the user with  different outcomes
            System.out.println("\nChoice 1: Investigate the bridge yourself.\n");
            System.out.println("\nChoice 2: Call the police and report the tip anonymously.\n");
            System.out.println("\nChoice 3: Ignore it and keep the show running.\n");

            // Here I will need to take user input to decide what to do next
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            // Use a switch statement to handle the user's choice
            switch(choice)
            {
                case 1:
                    System.out.println("Result: You drive into the foggy outskirts alone. You find tire marks, a broken cell phone, and police lights in the distance. You decide to go home and leave it to the police.");

                    reputation += 10;
                    sanity -= 15;

                    //returns the result of this decision
                    return "Gain +10 Reputation (your tip gets you noticed by local detectives), lose -15 Sanity (you glimpse something under the water that shouldn't be there).";

                case 2:
                    System.out.println("Result: They thank you, but when the story hits the morning news, you get no credit.");
                    
                    sanity += 5;
                    reputation -= 10; 

                    //returns the result of this decision
                    return "Gain +5 Sanity (you sleep better knowing it's not your problem), lose -10 Reputation (listeners think you faked the call).";

                case 3:
                    System.out.println("Result: Your ratings spike, listeners love the suspense, but you wake up to the headline: Body Found Beneath Ashcroft Bridge.");

                    wealth += 200;
                    sanity -= 20;
                    reputation -= 10;

                    //returns the result of this decision
                    return "Gain +200 Wealth (ad revenue surges), lose -20 Sanity, lose -10 Reputation";

                default:
                    System.out.println("Invalid choice. Please choose again.");
                    return Scenario1(); // cal and return the method again for valid input
            }
        }//end of method #1

        public static String Scenario2() //begining of method #2
        {
            System.out.println("\n\n Scenario 2: The Producer's Dilemma \n\n");
            System.out.println("'Your producer, Claire, confronts you in the booth.'");
            System.out.println("'Zane, you're scaring people. You need to stop taking those calls.'");
            System.out.println();//spacing for user readiblity

            System.out.println("\nChoice 1: Confide in Claire and show her the call logs.\n");
            System.out.println("\nChoice 2: Lie and say it's all part of a performance.\n");
            System.out.println("\nChoice 3: Fire Claire and handle the show solo.\n");

            // Here I will need to take user input to decide what to do next
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            // Use a switch statement to handle the user's choice
            switch(choice)
            {
                case 1:
                    System.out.println("Result: She believes you, and together you trace a partial number linked to a decommissioned mental hospital.");

                    reputation += 10;
                    sanity += 15;
                    wealth -= 100;

                    return "Gain +15 Sanity (shared burden), gain +10 Reputation, lose -100 Wealth (Claire demands overtime pay).";

                case 2:
                    System.out.println("Result: Claire relaxes, but word spreads that you're sensationalizing tragedy.");
                    
                    sanity -= 5;
                    reputation -= 10;
                    wealth += 150;

                    return "Gain +150 Wealth (higher engagement), lose -10 Reputation, lose -5 Sanity (guilt gnaws at you).";

                case 3:
                    System.out.println("Result: You cut her off live on-air. The moment goes viral.");

                    wealth += 300;
                    sanity -= 25;
                    reputation -= 15;

                    return "Gain +300 Wealth, lose -25 Sanity, lose -15 Reputation.";

                default:
                    System.out.println("Invalid choice. Please choose again.");
                    return Scenario2(); // Call and return the method again for valid input
            }
        } // The method ends here

    public static String Scenario3()//begins method #3
        {
            System.out.println("\n\n Scenario 3: The Cryptic Tape \n\n");
            System.out.println("A brown envelope arrives at the station. No return address. Inside: a cassette labeled 'PLAY ME'.");
            System.out.println();//spacing for user readiblity

            System.out.println("\nChoice 1: Play the tape live on-air.\n");
            System.out.println("\nChoice 2: Analyze it privately before airing.\n");
            System.out.println("\nChoice 3: Destroy the tape immediately.\n");

            // Here I will need to take user input to decide what to do next
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            // Use a switch statement to handle the user's choice
            switch(choice)
            {
                case 1:
                    System.out.println("Result: The tape plays a distorted recording of someone begging for help. Then a scream. The audience erupts.");

                    reputation += 20;
                    sanity -= 20;
                    wealth += 100;

                    //returns the result of this decision
                    return "Gain +20 Reputation (listeners can't turn away), lose -20 Sanity, gain +100 Wealth";

                case 2:
                    System.out.println("Result: Slowed down, the voice sounds like you.");
                    
                    sanity -= 15;
                    reputation += 10;

                    //returns the result of this decision
                    return "Lose -15 Sanity, gain +10 reputation (professionalism noted), no change in wealth.";

                case 3:
                    System.out.println("Result: You feel a wave of calm but then the station's power flickers, and a whisper crackles through the speakers: ");
                    System.out.println("\n 'You shouldn't have done that, Zane'.");
                    System.out.println("Sponsors pull back after 'boring content'.");

                    wealth += 300;
                    sanity -= 25;
                    reputation -= 15;

                    //returns the result of this decision
                    return "Gain +300 Wealth, lose -25 Sanity, lose -15 Reputation.";

                default:
                    System.out.println("Invalid choice. Please choose again.");
                    return Scenario3(); // Call and return the method again for valid input
            }
        } // The method ends here

    public static void main (String[] args) //this starts the scope of the main method
    {
        // Create a Scanner object to read user input
        // The scanner object came from the Scanner library
        Scanner input = new Scanner(System.in);

        Introduction();//call intro
        
        // Display the player's initial health
        System.out.println("\nYour initial sanity is " + sanity + ", wealth is: " + wealth + ", and reputation is: " + reputation + ".");

        Scenario1();
        System.out.println("After your first nightly encounter with the mystery caller, all you can do is move on.");
        System.out.println("You go into work the next night and face the next issue.");

        Scenario2();
        System.out.println("After the talk you and Claire had, there is definetly a strain on the relationship.");
        System.out.println("But the show must go on right?");

        Scenario3();
        System.out.println("Gosh, creepy tape, huh?");
        System.out.println("Let's all hope you made the right decision for your own end goal.");

        System.out.println("\n Final Results:");
        System.out.println("Sanity: " + sanity + ", wealth: " + wealth + ", reputation: " + reputation);

    } //end scope of main method
}