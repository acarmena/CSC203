import java.util.Random;//import random class first step +++++++
import java.util.Scanner;

public class TFL {
    public static void main (String[] args){
        // create our random number generator out second step
        Random randNum = new Random();

        // create our scanner for user input
        Scanner input = new Scanner(System.in);

        // Title
        System.out.println("\n\n Tie Fighter Launch Control \n");
        System.out.println("=================================\n");

        // loop so wen launch multiple TIE Fighters group
        while(true){

            // tell the user to get input
            System.out.println("Flight Control, should we launch? (1) Yes (2) Exit: ");

            // get user input
            int choice = input.nextInt();
            if(choice == 1){
                // generate a random number between 5 and 20
                int numOfTF = randNum.nextInt(16) + 5 //0-15 + 5 = 5-20

                // output the reult for the user
                System.out.println("\n\nLunch time shutting down the tie fighter Launch Control. Goodbye!\n");
                break;
            }

            else if(choice == 2){
                System.out.println("\n\nLunch time shutting down the tie fighter Launch Control. Goodbye!\n");
                break;
            }
        } 

    }
}
