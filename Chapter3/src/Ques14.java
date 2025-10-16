import java.util.Scanner;

/*
    14. The volume of a sphere is computed by the equation

                V=4/3*PI*R^3

    where V is the volume and r is the radius of the sphere. Write a program that
    computes the volume of a sphere with a given radius r.
 */
public class Ques14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);

        System.out.printf("The volume of a sphere with a given radius  is: %.2f\n",volume);


        scanner.close();

    }
}
