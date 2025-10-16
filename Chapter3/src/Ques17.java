/*
    17. When you say you are 18 years old, you are really saying that the Earth has
    circled the Sun 18 times. Since other planets take fewer or more days than
    Earth to travel around the Sun, your age would be different on other planets.
    You can compute how old you are on other planets by the formula

                           X * 365
                    Y = --------------
                              d

    where x is the age on Earth, y is the age on planet Y, and d is the number of
    Earth days the planet Y takes to travel around the Sun. Write an application
    that inputs the user’s Earth age and print out his or her age on Mercury,
    Venus, Jupiter, and Saturn. The values for d are listed in the table.

        d = Approximate Number of Earth Days
            for This Planet to Travel around the Sun
        +---------+-------------------------------+
        | Planet  | Days to Travel Around the Sun |
        +---------+-------------------------------+
        | Mercury | 88                            |
        | Venus   | 225                           |
        | Jupiter | 4,380                         |
        | Saturn  | 10,767                        |
        +---------+-------------------------------+
 */

import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {

        final int MERCURY = 88, VENUS = 225, JUPITER = 4380, SATURN = 10767;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age on the Earth: ");
        int userEarthAge = scanner.nextInt();

        double ageInDay = userEarthAge*365;

        System.out.printf("Your age on Mercury is %.1f   (y0)\n", ageInDay / MERCURY);
        System.out.printf("Your age on Venus   is %.1f   (y0)\n", ageInDay / VENUS);
        System.out.printf("Your age on Jupiter is %.1f   (y0)\n", ageInDay / JUPITER);
        System.out.printf("Your age on Saturn  is %.1f   (y0)\n", ageInDay / SATURN);

        scanner.close();
    }
}
