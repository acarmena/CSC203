import java.util.Scanner;
public class MarsBase 
{
    public static void printArray(int arr[]) //method to override the default toString
    {
        System.out.print("[ ");
        for(int a : arr) //traverses through every item in array
        {
         System.out.print(a + ", ");
        }
        System.out.print("]");
    }

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] solar_panels = new int[5]; //an int array of length 5 for the panels
        int[] wind_turbines = new int[5]; //an int array of length 5 for the turbines
        int solarSum = 0;
        int windSum = 0;

        System.out.println("Hello, Agent! Today's mission is an Energy Grid!"); //intro
        System.out.println("To do that you will need to follow a few simple rules.");
        System.out.println(); //separates text

        System.out.println("Step 1: Log the energy of solar panels and the wind turbines."); //instructions
        System.out.println("Step 2: I will calculate the total energy output, then you will ensure correctness.");
        System.out.println("Got it? Great, let's begin with the solar panels.");
        System.out.println();

        for(int i = 0; i < solar_panels.length; i++) //for loop to take inputs quickly
        {
            System.out.println("Okay, enter the energy output: ");
            solar_panels[i] = input.nextInt(); //takes the input and replaces the first place in the array with it
        }
        printArray(solar_panels);//print the list of outputs
        System.out.println();

        System.out.println("Great! Now Let's do the inputs for the wind turbines!");
        System.out.println();

        for(int i = 0; i < wind_turbines.length; i++) //for loop to take inputs quickly
        {
            System.out.println("Okay, enter the energy output: ");
            wind_turbines[i] = input.nextInt(); //takes the input and replaces the first place in the array with it
        }
        printArray(wind_turbines);
        System.out.println();

        System.out.println("Great! Now Let's do the calculations.");
        System.out.println();

        for(int i = 0; i < solar_panels.length - 1; i++)
        {
            solarSum = solar_panels[i] + solar_panels[i + 1];
        }

        for(int i = 0; i < wind_turbines.length - 1; i++)
        {
            windSum = wind_turbines[i] + wind_turbines[i + 1];
        }

        int total_sum = solarSum + windSum;
        System.out.println("The total energy output is: " + total_sum + " megawatts.");
    }
}