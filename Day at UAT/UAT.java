/* Make a Great UX.
Over comment your source code file (.java). 
In your Main.java file. Create a text-based program that allows the user to spend a virtual day at UAT. Have fun with this.*/

//main java file
public class UAT
{
    // method to welcome the user
    public static void displayWelcome(){
        System.out.println("\n\nt Welcome to the UAT Campus Simulation!\n");
    }
    
    public static void main(String[] args) {
        // Call the welcome message
        displayWelcome();

        // create intances of classes (these are objects!)
        // the created objects are using the child classes not the parent class
        Stu Kyle = new Stu("Kyle", "Van Hook", 3.8f);
        Stu Tom = new Stu("Tom", "Burton", 3.5f);
        Stu Aaron = new Stu("Aaron", "Hurst", 3.9f);
        Stu Alex = new Stu("Alex", "Pina", 3.6f);
        Prof Hinton = new Prof("Tony", "Hinton", "Computer Science");

        // lets use objs to create a simple scenario on campus
        Kyle.Talk("Hey, Tom! Are you ready for class?");
        Tom.Talk("Yeah, I am ready! Are you ready Aaron?");
        Aaron.Talk("I am ready! Professor Hinton, are you ready to teach?");
        Hinton.Talk("Yes, I am ready to teach " + Hinton.getTitle());
        Hinton.Teach(Hinton.getTitle());
        Kyle.Study(Hinton.getTitle());
        Tom.Study(Hinton.getTitle());
        Aaron.Study(Hinton.getTitle());
        Alex.Study(Hinton.getTitle());
        Aaron.getLocation("to the library");
    }
}
