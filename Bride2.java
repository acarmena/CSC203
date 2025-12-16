/*Final Project

Title: The Vanishing at the Veranda

Idea: 
You arrive in a quaint town to attend a cousin’s wedding—only to find the bride missing and everyone pretending she never existed.
You will get a intro to the theme and setting the game.

Instructions:
How to Play "Vanishing at the Veranda":

There will be a part when the user can add their name, but should they choose to not, the program will assign them the gender neutral name "Eden".
There is another input where the user will have to enter their age.

From there, the program will as the user to press enter to aid in readability and comprehension.
As for the rest of the game, it will be an interactive text-based adventure where you make choices that affect your memory and sanity as you uncover secrets.
Each choice is numbered 1-3. To choose, simply type the number of your selection and press Enter. */

import java.util.Scanner;
public class Bride2 
{
    //user's "health" values being initialized
    static int memory = 100; //intact, wrong choices make you forget more
    static int sanity = 80; // don't lose your mind, wrong choices make you more stressed
    static Scanner input = new Scanner(System.in);

    private int age;
    private int currentYr;
    
    public Bride2(int age, int currentYr) // this section of the code is just for a fun tidbit to add to the story and the character's backgrounds
    {
        this.age = age;
        this.currentYr = currentYr;
    }
    public static void Intro()
    {
        System.out.println("You arrive in a quaint town to attend a cousin's wedding, only to find the bride missing and everyone pretending she never existed.");
        System.out.println("In this interactive text-based adventure game, you will navigate through a mysterious wedding scenario.");
        System.out.println("Make choices that will affect your memory and sanity as you uncover secrets.");
        System.out.println("Good luck, and remember: not everything is as it seems!");
        System.out.println("Press Enter to begin your journey...");
        input.nextLine(); // waits for user to press enter to continue
    }
    public int ageCalc() // the age is calculated to see what year the character will turn 100 to add to the dialogue of the driver and y/n
    {
        if (age >= 100)
        {
            System.out.println("Wow! You have already hit 100 years old! What an old fart like me."); //fun dialogue if the user is already 100 or older
            return currentYr; // if the user is already 100 or older, just return the current year
        }
        else
        {
            int yearTurns100 = currentYr + (100 - age);
            System.out.println("You will be 100 in the year " + yearTurns100); //fun dialogue for the calculation
            return yearTurns100;
        }
    }
    public int monthsOld()
    {
        return age * 12;
    }

    public static String GameOver() // method to check if game is over
    {
        if (memory <= 0 || sanity <= 0) //if memory or sanity reaches 0, game over
        {
            System.out.println("\nYour mind has completely faded. You can't remember who you are or why you're here.");
            return "Game Over.";
        }
        else
        {
            return "\nYou have " + memory + " memory remaining. and " + sanity + " sanity remaining.\n";
        }
    }

    //this presents the user with the first scenario they must choose from.
    public static String Scenario1()//start of scenario 1
    {
        System.out.println("\t\tScenario 1: \"Wrong Guest\"");
        System.out.println("Inside The Veranda, the lobby is buzzing but not with wedding joy.");
        System.out.println("Guests murmur, pacing, clutching papers.");
        System.out.println("Mikey leads you to the check-in desk where a tall woman with icy blonde, pixie-cut flips through a guest list.");
        System.out.println("When she sees you, her expression tightens.");
        System.out.println("Name?' she asks, eyes narrowing.");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();//spacing for readability

        System.out.println("You give your name, and she checks her list, frowning.");
        System.out.println("You watch anxiously.");
        System.out.println("'Hmm, I don't see your name here. Are you sure you're in the correct place?'");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();//spacing for readability

        System.out.println("Mikey looks upset, but not surprised. 'That can't be right. I know her and she definitely has an invitation.'");
        System.out.println("The woman folds her arms. 'We can't check in someone who isn't listed.'");
        System.out.println("You feel the unease from earlier return. Jay's warning echoing in your ears.");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();//spacing for readability

        System.out.println("Decision Point 1: Choose, how will you respond?");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();//spacing for readability

    //3 different choices for the user with  different outcomes
            System.out.println("\nChoice 1: Firmly insist you belong here.\n");
            System.out.println("\nChoice 2: Calmly ask if someone else can double-check.\n");
            System.out.println("\nChoice 3: Ask Mikey privately if something happened before you arrived.\n");

            // Read and validate user input in a loop
            while (true) {
                System.out.print("Enter choice (1-3): ");
                String line = input.nextLine();
                int choice;
                try {
                    choice = Integer.parseInt(line.trim());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter 1, 2, or 3.");
                    continue;
                }

                switch(choice) {
                    case 1:
                        System.out.println("Result: She relents and agrees to look again, but she clearly doesn't trust you. She writes something on a slip of paper you can't see.");
                        memory -= 10;
                        sanity -= 5;
                        return "Lose 10 memory and lose 5 Sanity (her distrust makes you question yourself). You your bags to Mikey but the unease lingers.";
                    case 2:
                        System.out.println("Result: A younger staff member recognizes your name from the rehearsal dinner list and apologizes profusely, fixing the issue.");
                        sanity += 5;
                        memory += 10;
                        return "Gain +5 Sanity and you feel better knowing you are not losing your mind. You also gain 10 memory and feel more grounded.";
                    case 3:
                        System.out.println("Result: Mikey hesitates, then admits: 'Many of the guests have been... forgetting things. Big things.' He won't explain more.");
                        memory += 10;
                        sanity -= 5;
                        return "Gain +10 memory and lose -5 Sanity. You are being more aware and alert, but the mystery is unsettling.";
                    default:
                        System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                        break; // loop continues
                }
            }
        }//end of method #1/ choice 1

    
       //this presents the user with the second scenario they must choose from.
    public static String Scenario2()//start of scenario 2
    {
        System.out.println("\t\tScenario 2: \"The Photograph\"");
        System.out.println("You watch as Mikey takes your bags and disappears into the ascending spiral staircase."); 
        System.out.println("While he's gone, you explore the lobby.");
        System.out.println("As you walk through the ornate hallways, you can't shake the feeling of being watched.");
        System.out.println("A wall of framed photos catches your eye. Weddings from years past.");
        System.out.println("Then one photo freezes your breath.");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();//spacing for readability

        System.out.println("It's Ezra.");
        System.out.println("Your cousin.");
        System.out.println("Standing at an altar... with a woman you don't recognize.");
        System.out.println("Your heart pounds as you study the photo, trying to place her.");
        System.out.println("The plaque reads:\n\"Ezra & Dawn. Joined in Union, June 2023\"");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();//spacing for readability

        System.out.println("Ezra wasn't married last year.");
        System.out.println("He's marrying this week. To a woman named Estelle. So who is Dawn?");
        System.out.println("You stare longer, hoping for a hint of resemblance.");
        System.out.println("Suddenly, you feel a tap on your shoulder.");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();//spacing for readability

        System.out.println("'Hey Kiddo!' a male voice startles you.");
        System.out.println("It is your Uncle Ashton, Ezra's father.");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();//spacing for readability

        System.out.println("Decision Point 1: Choose, how will you respond?");
        System.out.println();//spacing for readability

    //3 different choices for the user with  different outcomes
            System.out.println("\nChoice 1: Demand an explanation from Uncle Ashton.\n");
            System.out.println("\nChoice 2: Examine the photo frame more closely.\n");
            System.out.println("\nChoice 3: Touch the photo.\n");
            // Read and validate user input in a loop
            while (true) {
                System.out.print("Enter choice (1-3): ");
                String line = input.nextLine();
                int choice;
                try {
                    choice = Integer.parseInt(line.trim());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter 1, 2, or 3.");
                    continue;
                }

                switch(choice) {
                    case 1:
                        System.out.println("Result: He grabs your shoulders firmly and leads you to a quiet corner. 'Dawn was Ezra's first love. They were to be married, but she... disappeared. Just vanished without a trace.'");
                        memory -= 10;
                        sanity -= 5;
                        return "Lose 10 memory and lose 5 Sanity (this news confuses you and causes unease). You take the nearest seat.";
                    case 2:
                        System.out.println("Result: You notice the glass is cracked on the inside, like someone punched it from within.");
                        sanity -= 5;
                        memory -= 10;
                        return "Gain -5 Sanity and you feel as if you are being left out of the loop. You also lose 10 memory and cannot seems to find peace.";
                    case 3:
                        System.out.println("Result: The world sways. For a split second, you see the bride turn her head toward you in the picture. Uncle Ashton grabs your wrist, pulling you away. You turn back and the photo is normal again.");
                        memory += 10;
                        sanity -= 5;
                        return "Gain +10 memory and lose -5 Sanity. You feel disoriented from the experience yet you gain a slight memory of Dawn";
                    default:
                        System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                        break; // continue loop
                }
            }
        }//end of method #2/ choice 2

    public static void main(String[] arg)
    {
        System.out.println("\n\n*** Welcome to The Vanishing at the Veranda ***\n\n");// quaint town of Willowmere
        System.out.println("\tCHAPTER 1: The Arrival\t\n");
        Intro();
        System.out.println("You have just arrived to a quaint town known as Willowmere. Say hello to your home for the next week.");
        System.out.println("Your cousin, Ezra, is finally getting married. But you wouldn't expect any less from a man like him.");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();


        //scenario 1 & user choice
        System.out.println("As you hop into your respective taxi, the driver indirectly asks for your name.");
        System.out.println("'Welcome to Willowmere, uh...'");
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        if (name == null || name.trim().equals("")){
            name = "Eden"; //default unisex name if user does not input one
        }

        

        System.out.println("'Welcome, " + name + "! Where to?'");
        System.out.println("Your reply is short and sweet, 'The Veranda, please'");
        System.out.println("You decide to look at the driver for the first time. He is an older black gentleman, with creases on his eyes that tell a story.");
        System.out.println("You admire how easily the driver gets through the flow of traffic.");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();

        System.out.println("As the car takes you to the wedding venue, you let your mind wander.");
        System.out.println("Your thoughts are interrupted with a loud question. '" + name + "! Isn't that crazy?'");
        System.out.println("You jolt and look a bit confused, 'I am sorry, what were you saying?'");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();
        
        System.out.println("'Oh,' he laughs. 'No worries! Just tell me how old you are'");
        int userAge;
        while (true) {
            System.out.print("Please enter your age (number): ");
            String ageLine = input.nextLine();
            try {
                userAge = Integer.parseInt(ageLine.trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number for your age.");
            }
        }
        Bride2 user = new Bride2(userAge, 2025);
        System.out.println("'Oh, I am " + userAge + " years old.'");
        System.out.println("'Okay.. that means you would be...' you watch as he thinks a little too hard.");
        System.out.println("'" + name + ", " + user.ageCalc() + "!'");
        System.out.println("You were so confused and caught off guard that you burst into laughter, as did the driver.");
        System.out.println("As you approach the venue's inn, the driver says one last fun fact:");
        System.out.println("Did you know you are about "  + user.monthsOld() + " months old right now!");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();

        System.out.println("You offer a slight chuckle as you take in the timeless gilded-esque estate. 'It is gorgeous' you stare unable to look away.");
        System.out.println("The taxi pulls to the cast-iron gate's guard. As the window rolls down, you hear, 'Hey, Jay! What package are you delivering today?'");
        System.out.println("You watch as the driver, or Jay as the guard called him, use his charm to introduce you and lead you to the inn.");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();

        System.out.println("Jay looks at you through his rear view mirror one last time before parking and walking around to open your door.");
        System.out.println("You take his hand and follow him to the trunk. 'Thank you, Jay! I hope I see you on my way out too.'");
        System.out.println("He sighs and offers a sincere smile. 'It was nice meeting you, " + name + ". I beg you to be careful and whatever you do, do not forget'");
        System.out.println("He kisses your hand, scurries back to his driver's seat and drives away. You are left at a loss, *what did he mean 'don't forget?'*");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();

        System.out.println("You brush off the strange thought and uneasy feeling as you only knew that guy for as long as the car drove.");
        System.out.println("You take a deep breath, one last look at the exterior, and begin to search for help with your bags.");
        System.out.println("Your eyes meet a scrawny, awkwardly cool, jet-black haired boy. The feeling of familiarity hits you and causes you to run over.");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();

        System.out.println("It is your cousin on the bride's side. You run over and hug him. 'Hey, Mikey! How are ya?'");
        System.out.println("Mikey jumps a little, surprised but happy. 'Whoa! Hey, " + name + "! It's been a minute! I'm good, how are you?'");
        System.out.println("'I'm great! Just tired from the trip. Can you help me with my bags?'");
        System.out.println("'Yeah, for sure! Let's get you checked in first though. It is a little hectic today with the wedding and all.'");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();

        System.out.println("As you follow Mikey into the inn, you can't help but feel like you have fell through a fog, as if you have forgotten something important...");
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();

        //calling scenario 1 method and storing the result to show user
        String result1 = Scenario1();
        System.out.println(result1);//displays the result of the user's choice in scenario 1
        System.out.println(GameOver()); //checks if game is over after scenario 1
        System.out.println("Continue (Press Enter)");
        input.nextLine(); // waits for user to press enter to continue
        System.out.println();//spacing for readability
        
        System.out.println("Once the issue of the guest list is resolved, you allow Mikey to take your bags and head to your room.");
        String result2 = Scenario2();
        System.out.println(result2);//displays the result of the user's choice in scenario 2
        System.out.println(GameOver()); //checks if game is over after scenario 2

        System.out.println("\nThank you for playing The Vanishing at the Veranda. To Be Continued...\n");

        input.close();
    }
}
