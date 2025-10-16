package exercise7;

public class Temperature {
    //DATA MEMBER
    //Maintain the temperature internally in degrees Fahrenheit.
    private double fahrenheit;

    //CONSTRUCTOR
    public Temperature(){

    }
    //METHOD
    public double toFahrenheit(){
        return fahrenheit;
    }

    public double toCelsius(){
        fahrenheit = (fahrenheit - 32)*5.0/9.0;
        return fahrenheit;
    }

    public void setFahrenheit(double f){
        fahrenheit = f;
    }

    public void setCelsius(double c){
        fahrenheit = c*9.0/5.0 + 32;
    }
}
