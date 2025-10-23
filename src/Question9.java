import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the power of 10: ");
        int number = scanner.nextInt();
        String word;
        switch (number) {
            case 6 -> {
                word = "Million";
                break;
            }
            case 9 -> {
                word = "Billion";
                break;
            }
            case 12 -> {
                word = "Trillion";
                break;
            }
            case 15 -> {
                word = "Quadrillion";
                break;
            }
            case 18 -> {
                word = "Quintillion";
                break;
            }
            case 21 -> {
                word = "Sextillion";
                break;
            }
            case 30 -> {
                word = "Nonillion";
                break;
            }
            case 100 -> {
                word = "Googol";
                break;
            }

            default -> word = null;
        }

        if (word != null)
            System.out.println("10 to the power of " + number + " is a " + word + ".");
        else
            System.out.println("No corresponding word for 10^" + number + ".");
    }
}
