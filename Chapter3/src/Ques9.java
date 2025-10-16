import java.util.Scanner;

/*
    9.Write a program that accepts a person’s weight and displays the number of
      calories the person needs in one day. A person needs 19 calories per pound
      of body weight, so the formula expressed in Java is

                calories = bodyWeight * 19;

      (Note: We are not distinguishing between genders.)
 */
public class Ques9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter body weight in pound: ");
        double bodyWeight = scanner.nextDouble();
        double calories = bodyWeight*19;

        System.out.printf("The number of calories needs in one day is: %.1f",calories);

        scanner.close();
    }
}
