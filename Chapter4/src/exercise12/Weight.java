package exercise12;

public class Weight {
    public static void main(String[] args) {
        Height height = new Height();
        height.setHeight(180.0);
        height.setAge(18);
        System.out.println("Recommended Weight: " + height.getRecommendedWeight());
    }
}
