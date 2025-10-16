import java.util.Scanner;

/*
    15. The velocity of a satellite circling around the Earth is computed by the
    formula

                    v = sqrt(G*ME/r)

    where ME = 5.98 * E24 kg is the mass of the Earth, r the distance from the
    center of the Earth to the satellite in meters, and G = 6.67 * E-11 m^3/kg * s^2
    the universal gravitational constant. The unit of the velocity v is m/s. Write a
    program that inputs the radius r and outputs the satellite’s velocity. Confirm
    that a satellite that is closer to the Earth travels faster. Define symbolic
    constants for ME and G. The distance to the Hubble Space Telescope from
    the center of the Earth, for example, is approximately 6.98 * E6 m.
 */
public class Ques15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double ME = 5.98E24, G = 6.67E-11;

        System.out.print("Enter the distance from the center of the Earth to the satellite in meters(m): ");
        double r = scanner.nextDouble();

        double v = Math.sqrt(G * ME / r);
        System.out.printf("The satellite’s velocity = %.2f (m/s)", v);
    }
}
