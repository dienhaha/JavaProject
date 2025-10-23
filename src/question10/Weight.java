package question10;
/*
    10. Write a program RecommendedWeightWithTest by extending the
    RecommendedWeight (see Exercise 8 on page 209). The extended program
    will include the following test:
    if (the height is between 140cm and 230cm)
        compute the recommended weight
    else
        display an error message
 */

public class Weight {
    public static void main(String[] args) {
        Height height = new Height();
        height.setHeight(180);
        height.setAge(18);
        if (height.getHeight() <= 230.0 && height.getHeight() >= 140.0){
            System.out.println("Recommended Weight: " + height.getRecommendedWeight());
        }
        else System.out.println("ERROR");
    }
}
