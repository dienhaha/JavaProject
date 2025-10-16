package exercise12;

public class Height {
    //DATA MEMBER
    private double height;
    private int age;
    private double recommendedWeight;
    //CONSTRUCTOR
    public Height(){
        height = 0.0;
        age = 0;
    }
    //METHOD
    public void setHeight(double inputHeight){
        height = inputHeight;
    }

    public void setAge(int inputAge){
        age = inputAge;
    }

    public double getRecommendedWeight(){
        recommendedWeight = (height - 100 + age/10.0)*0.90;
        return recommendedWeight;
    }
}
