

public class OopPractice 
{ 
    // properties (2)
    private int width;
    private int height;
    
    public OopPractice(int w, int h)
    {
        width = w;
        height = h;
    }
    // method (2)
    public void getArea()
    {
        int area = width * height;
        System.out.println("The area of your parallelogram is " + area + ".");
    }

    public void getPerimeter()
    {
        int perimeter = 2 * (width + height);
        System.out.println("The perimeter of your parallelogram is " + perimeter + ".");
    }

    public static void main (String[] args)
    {
        // initiate objects (5)
        OopPractice shape1 = new OopPractice(12, 15);
        shape1.getArea();
        shape1.getPerimeter();

        OopPractice shape2 = new OopPractice(24, 13);
        shape2.getArea();
        shape2.getPerimeter();

        OopPractice shape3 = new OopPractice(34, 25);
        shape3.getArea();
        shape3.getPerimeter();

        OopPractice shape4 = new OopPractice(42, 31);
        shape4.getArea();
        shape4.getPerimeter();

        OopPractice shape5 = new OopPractice(67, 13);
        shape5.getArea();
        shape5.getPerimeter();
    }
}
