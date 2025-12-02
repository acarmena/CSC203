/* Create a Person class.
The Person class should have a first name, last name, and title public properties.
The Person class should have a public talk method.
The Person class should have a public eat method.
The Person class should have a public sleep method.
The Person class should have a private property location.
The Person class should have public methods to get and set the private property location. */

public class Person { //this is the parent class
    // variables for THIS person class
    public String f;
    public String l;

    // constuctor for parent class
    public Person(String f, String l){
        this.f = f;
        this.l = l;
    }

    // methods for the person class
    public void Talk(String talk) {
        System.out.println(f + " " + l + " says: " + talk);
    }
    public void getLocation(String location) {
        System.out.println(f + " " + l + " is walking to " + location);
    }
}
