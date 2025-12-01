package CSC203;
import java.util.Scanner;
public class StarBase13 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n *** It is the year 2491. You are a reporter approaching Acme Intergalactic Space Agency's recently opened space station Starbase13.***");
        System.out.println("*** Here, you will figure out how to build the space station computer!***");
        System.out.println("As you awake from the nap you on your journey, you exit the Space Shuttle, the Trace, and rub your eyes."); // Trace = Space + Train
        System.out.println("It is your last day on the job before you go on vacation. You groan as you see the same buliding you have for the past 27 years"); // in alien years she is 99. human: 29
        System.out.println("In reality, the buliding you are groaning bout it is a goregeous piece of architecture.");
        System.out.println("This 34-floor building is known for its luxury and sleek look.");
        System.out.println("If a vistor were to observe this very tall buliding from a Trace, they would see each rigid diamond like structure.");
        System.out.println("Each floor stacked with several window panes and sharp edges.");
        System.out.println("As you enter the first floor of Acme Intergalactic Space Agency, or AISA for short.");
        System.out.println("You are greeted with a dark and mysterious interior. The reflective walls are lined with warm. oranege tinted lights.");
        System.out.println("Before you can get too far, a computer welcomes you to Starbase 13. For a new vistor, Caren would say:");
        System.out.println("Hi, I am Caren! What is your name?");
        String demoName = input.nextLine();//takes String input
        System.out.println("Hi ," + demoName + "! Welcome to Acme Intergalactic Space Agency's new space station, Starbase13!");//displays input as string
        System.out.println("But! For you, Caren already knows your name, so she says");
        System.out.println("Hi, Ashton! Welcome back to Acme Intergalactic Space Agency's new space station, Starbase13!");
    }
}
