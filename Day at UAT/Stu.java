/* Create a Student child class of the Person class.
The Student child class should have a public Study method. */

public class Stu extends Person { //this is a child class
    // variables for the student child class
    public float gpa;

    // constructor for child class
    public Stu(String f, String l, float gpa){
        // call parent class
        super(f, l);
        this.gpa = gpa;
    }

    // methods for the stu class
    public void Study(String subject){
        System.out.println(f + " is studying " + subject);
    }
}
