package question11;
import question10.Height;

import java.util.Scanner;

/*
    11. Extend the RecommendedWeightWithTest program in Exercise 12 by
    allowing the user to enter his or her weight and printing out the message You
    should exercise more if the weight is more than 10 lb over the ideal weight
    and You need more nourishment if the weight is more than 20 lb under the
    recommended weight.
     */
public class Question11 {
    public static void main(String[] args) {
        Height height = new Height();
        height.setHeight(180);
        height.setAge(18);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        if (height.getHeight() <= 230.0 && height.getHeight() >= 140.0){
            System.out.println("Recommended Weight: " + height.getRecommendedWeight());

            if(weight >= height.getRecommendedWeight() +10 ){
                System.out.println("Exercise more");
            } else if (weight <= height.getRecommendedWeight() -20) {
                System.out.println("You need more nourishment");
            }
        }
        else System.out.println("ERROR");


    }
}
