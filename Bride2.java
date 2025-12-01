import java.util.Scanner;
public class Bride2 
{
    private int age;
    private int currentYr;
    
    public Bride2(int age, int currentYr)
    {
        this.age = age;
        this.currentYr = currentYr;
    }
    public int ageCalc()
    {
        return currentYr + (100 - age);
    }
    public int monthsOld()
    {
        return age * 12;
    }
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        int memory = 100; //intact, wrong choices make you forget more
        System.out.println("\n\n*** Welcome to The Vanishing at the Veranda ***\n\n");// quaint town of Willowmere
        System.out.println("You have just arrived to a quaint town known as Willowmere. Say hello to your home for the next week.");
        System.out.println("Your cousin, Ezra, is finally getting married. But you wouldn't expect any less from a man like him.");
        System.out.println();

        //scenario 1 & user choice
        System.out.println("As you hop into your respective taxi, the driver indirectly asks for your name.");
        System.out.println("'Welcome to Willowmere, uh...'");
        String name = input.nextLine();
        System.out.println("'Welcome, " + name + "! Where to?'");
        System.out.println("Your reply is short and sweet, 'The Veranda, please'");
        System.out.println("You decide to look at the driver for the first time. He is an older black gentleman, with creases on his eyes that tell a story.");
        System.out.println("You admire how easliy the driver gets through the flow of traffic.");
        System.out.println();

        System.out.println("As the car takes you to the wedding venue, you let your mind wander.");
        System.out.println("Your thoughts are interrupted with a loud question. '" + name + "! Isn't that crazy?'");
        System.out.println("You jolt and look a bit confused, 'I am sorry, what were you saying?'");
        System.out.println();
        
        System.out.println("'Oh,' he laughs. 'No worries! Just tell me how old you are'");
        int userAge = input.nextInt();
        Bride2 user = new Bride2(userAge, 2025);
        System.out.println("'Oh, I am " + userAge + " years old.'");
        System.out.println("'Okay.. that means you would be...' you watch as he thinks a little too hard.");
        System.out.println("'" + name + ", you will turn 100 years old in the year " + user.ageCalc() + "!'");
        System.out.println("You were so confused and caught off guard that you burst into laughter, as did the driver.");
        System.out.println();
        
        System.out.println("As you approach the venue's inn, the driver says one last fun fact:");
        System.out.println("Did you know you are about "  + user.monthsOld() + " months old right now!");
        System.out.println();

        System.out.println("You offer a slight chuckle as you take in the timeless guilded edge estate. 'It is gorgeous' you stare unable to look away.");
        System.out.println("The taxi pulls to the cast-iron gate's guard. 'Hey, Jay! What package are you delievering today?'");
        System.out.println("You watch as the driver, or Jay as the guard called him, use his charm to introduce you and lead you to the inn.");
        System.out.println();

        System.out.println("Jay looks at you through his rearview mirror one last time before parking and walking around to open your door.");
        System.out.println("You take his hand and follow him to the trunk. 'Thank you, Jay! I hope I see you on my way out too.'");
        System.out.println("He sighs and offers a sincere smile. 'It was nice meeting you, " + name + ". I beg you to be careful and whatever you do, do not forget'");
        System.out.println("He kisses your hand, scurries back to his driver's seat and drives away. You are left at a loss,*what did he mean 'don't forget?'*");
        System.out.println();

        System.out.println("You brush off the strange thought and uneasy feeling as you only knew that guy for as long as the car drove.");
        System.out.println("You take a deep breath, one last look at the exterior, and begin to search for help with your bags.");
        System.out.println("Your eyes meet a scrawny, awkwardly cool, jet-black haired boy. The feeling of familiarity hits you and causes you to run over.");
        System.out.println();

        System.out.println("You run over and hug him. 'Hey, Mikey! How are you?'");
        System.out.println("");

        input.close();
    }
}
