package exercise14;

public class WeightConverter {
    //DATA MEMBER
    private final double MERCURY = 0.4, VENUS = 0.9, JUPITER = 2.5, SATURN = 1.1;
    public double weightInput;
    //CONSTRUCTOR
    public WeightConverter(){
        weightInput = 0.0;
    }
    //METHOD
    public double mecuryWeight(double weight){
        weightInput = weight*MERCURY;
        return weightInput;
    }
    public double venusWeight(double weight){
        weightInput = weight*VENUS;
        return weightInput;
    }
    public double jupiterWeight(double weight){
        weightInput = weight*JUPITER;
        return weightInput;
    }
    public double saturnWeight(double weight){
        weightInput = weight*SATURN;
        return weightInput;
    }
}
