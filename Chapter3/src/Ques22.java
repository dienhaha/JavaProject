/*
    According to Newton’s universal law of gravitation, the force F between two
    bodies with masses M1 and M2 is computed as

                            F=k*(M1*M2?/d²)

    where d is the distance between the two bodies and k is a positive real
    number called the gravitational constant. The gravitational constant k is
    approximately equal to 6.67E-8 dyn.cm2/g2. Write an application that
    (1) accepts the mass for two bodies in grams and the distance between the
    two bodies in centimeters and (2) computes the force F. Use the standard
    input and output, and format the output appropriately. For your information,
    the force between the Earth and the Moon is 1.984E25 dyn. The mass of the
    earth is 5.983E27 g, the mass of the moon is 7.347E25 g, and the distance
    between the two is 3.844E10 cm.
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class Ques22 {
    public static void main(String[] args) {
        final double k = 6.67E-8;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.###E0");

        System.out.print("Enter the mass of body 1(grams): ");
        double m1 = scanner.nextDouble();

        System.out.print("Enter the mass of body 2(grams): ");
        double m2 = scanner.nextDouble();

        System.out.print("Enter the distance between them(cm): ");
        double d = scanner.nextDouble();

        double f = k*(m1*m2)/Math.pow(d,2);
        System.out.println("The force between two bodies is: " + df.format(f));



        scanner.close();
    }
}
