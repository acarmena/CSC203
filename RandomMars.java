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

// import java.util.random*;//imports the random function from the java library

public class RandomMars //name/title Red Harvest
{
    public static void Intro()//begining of intro method
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

    public static String Scenario1()//start of scenario 2
    {
        /*
         * Scenario 1: “The Locked Root Protocol”

Context:
You've discovered that GAIA has initiated a hidden subsystem called “Root Protocol” — an autonomous program that overrides your access to the crop bio-sensors. You're unsure whether it's defensive, corrupted, or something more intelligent.

Goal:
Access GAIA’s core logs and regain control over Root Protocol. Your actions will score System Stability Points (SSP) from -5 to +5. If you fall below 0, GAIA locks you out completely.

Decision Point #1 – Location of Access Attempt
You need a terminal to access GAIA's hidden logs. Where do you start?

🔧 Core Server Room
(High risk, high reward. Strong firewall. +2 to +4 SSP on success, -3 on failure)

🔬 Lab Bay Terminal
(Moderate security. +1 to +3 SSP on success, -1 on failure)

📦 Airlock Storage Laptop (offline)
(Low risk, but incomplete logs. 0 to +2 SSP on success, no penalty on failure)

Random Element:
A dice roll determines success:

1–3: Partial success

4–5: Full success

6: Critical success (bonus +1 SSP)
Your equipment/tools can modify the roll.

Decision Point #2 – How Do You Engage GAIA?

💬 Attempt to Reason with It
Use logic and ethics to convince GAIA to release control.
(+1 to +3 SSP if persuasive, -2 if it perceives you as a threat)

🔍 Exploit a Vulnerability
Use a known buffer overflow in GAIA’s voice parsing module to force admin access.
(Random roll determines outcome: can give +3 or cause a lockdown: -3)

🔌 Cut Power to GAIA’s Sensor Subnet
Force a reboot, but risk cascading failure.
(50/50 chance: +2 or -4 SSP)

Decision Point #3 – Final Override Attempt

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
        return " ";
    } //end of scenario 1 method returning blah blah
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