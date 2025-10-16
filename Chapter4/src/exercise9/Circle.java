package exercise9;

/*  Define a Circle class that has
    methods to compute the area and circumference. You set the circle’s radius
    with the setRadius method or via a constructor.
 */


public class Circle {

    //DATA MEMBER
    private final double pi = Math.PI;
    private double arena;
    private double circumference;
    private double radius;

    //CONSTRUCTOR
    public Circle() {
        arena = 1;
        circumference = 0;
        radius = 0;

    }

    //METHOD
    public void setCircleRadius(double r) {
        radius = r;
    }

    public double getArena() {
        arena = pi * Math.pow(radius, 2);
        return arena;
    }

    public double getCircumference() {
        circumference = 2 * pi * radius;
        return circumference;
    }

}
