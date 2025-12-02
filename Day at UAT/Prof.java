/* Create a Professor child class of the Person class.
The Professor child class should have a public Teach method.*/

public class Prof extends Person{  //this is a child class
    // variables for the prof child class
    public String title;

    // constructor for child class
    public Prof(String f, String l, String title){
        super(f,l);
        this.title = title;
    }

    // methods for the prof class
    public void Teach(String subject){
        System.out.println("The " + title + ", " + f + " " + l + ", is teaching " + subject);
    }

    public String getTitle(){
        return title;
    }
}
